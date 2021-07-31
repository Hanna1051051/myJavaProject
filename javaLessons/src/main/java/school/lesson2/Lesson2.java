package school.lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        summDF(17, 1);
        posit(7);
        negat(-15);
        printM(5, "All is fine");
        leapYear(100);
        arrBC();
        arrD(100);
        arrA();
        arrF(5);
        arrH(5, 35);
        arrJ();
    }

    //1
    public static boolean summDF(int d, int f) {
        int summ = (d + f);
        if (summ >= 10 && summ <= 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
        }
        return false;
    }

    //2

    public static void posit(int e) {

        if (e >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    //3

    public static boolean negat(int n) {

        if (n >= 0) {
            System.out.println("The number is positive or 0");
            return true;
        } else {
            System.out.println("The number is negative ");
            return false;
        }
    }

    //4

    public static void printM(int m, String b) {
        for (int i = 0; i < m; i++) {
            System.out.println( b);
        }
        //System.out.println("end");
    }

    //5
    public static boolean leapYear(int k) {

        if ((k % 4 == 0) && (k % 100 != 0) || (k % 400 == 0)) {
            System.out.println("Leap Year is true");
            return true;
        } else {
            System.out.println("Leap Year is false");
            return false;
        }
    }

    //6
    public static void arrBC() {
        int[] sm = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < sm.length; i++) {
            if (sm[i] == 1) {
                sm[i] = 0;
            } else {
                sm[i] = 1;
            }
            System.out.print(sm[i] + " ");

        }
        System.out.println(Arrays.toString(sm));
    }

//7

    public static void arrD(int ml) {
        int[] sm = new int[ml];
        for (int i = 0; i < sm.length; i++) {
            sm[i] = i + 1;
        }
        System.out.println(Arrays.toString(sm));
    }

    //8

    public static void arrA() {
        int[] sm = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < sm.length; i++) {
            if (sm[i] < 6) {
                sm[i] = sm[i] * 2;
            } else {
                sm[i] = sm[i];
            }
        }
        System.out.println(Arrays.toString(sm));
    }

    //9

    public static void arrF(int a) {
        int[][] table = new int[a][a];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                int sum = i + j;
                int length = table[i].length;
                if (sum == length - 1 || i == j) {
                    table[i][j] = 1;
                }
                /*else {
                    table[i][j] = 0;
                }*/
                System.out.print(table[i][j]);
            }
            System.out.println();

        }
    }

    //10

    public static void arrH(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    //10.1


    public static void arrJ() {
        int arr[] = {10000, 2, 104, 3, 4, 7777, 8, -9999, -89, -12, -1, 9};
        int min = arr[1];
        int max = arr[1];
        for (int i = 0; i < arr.length; i++) {

            if (min < arr[i]) {
                min = arr[i];
            }
            if (max > arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }


}