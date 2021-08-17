package school.lesson6;

public class Except {

    public static void arraySizeSum(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        if (stringArray.length != 4 || stringArray[0].length != 4) {
            throw new MyArraySizeException("Wrong size of array");
        } else {
            System.out.println("The size of array is correct");
        }

        int sum = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[0].length; j++) {
                try {
                    int numb = Integer.parseInt(stringArray[i][j]);
                    sum += numb;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("The wrong elements of array is  in row " + i + " and column " + j);
                }
            }
        }
        System.out.println("The sum of elements is " + sum);
    }

    public static void main(String[] args) {

        String[][] arr2 = new String[4][4];
        arr2[0][0] = "5";
        arr2[0][1] = "ok";
        arr2[0][2] = "3";
        arr2[1][0] = "5";
        arr2[1][1] = "ok";
        arr2[1][2] = "-5";

        String[][] arr1 = new String[4][4];
        arr1[0][0] = "10";
        arr1[0][1] = "2";
        arr1[0][2] = "3";
        arr1[0][3] = "5";
        arr1[1][0] = "0k";
        arr1[1][1] = "0";
        arr1[1][2] = "5";
        arr1[1][3] = "0";
        arr1[2][0] = "5";
        arr1[2][1] = "2";
        arr1[2][2] = "3";
        arr1[2][3] = "5";
        arr1[3][0] = "5";
        arr1[3][1] = "0";
        arr1[3][2] = "5";
        arr1[3][3] = "0";


        try {
            arraySizeSum(arr1);

        } catch (MyArraySizeException | MyArrayDataException e ) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}