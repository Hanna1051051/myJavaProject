package school.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        summDF(17, 1);
        posit(7);
        negat(-15);
        printMessage(5, "All is fine");
        counterMessage(3, "hi");
        counterMessageScanner();
        leapYear(100);
        arrBC();
        arrSize(100);

        int[] array8 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrMult(array8);

        arrFillDiag(10);
        arrFillIn(5, 35);
        arrMinMax();

        int[] array10 = {1, 5, 3, 2, 1, 5, 5};
        arrSumArr(array10);

        int[] array12 = {3, 5, 6, 1, 5, -15};
        arrChange(array12, -1);
    }

    //  Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    //  если да – вернуть true, в противном случае – false.

    public static boolean summDF(int d, int f) {
        if ((d + f) >= 10 && (d + f) <= 20) {
            System.out.println("The sum of the numbers is positive - it is true");
            return true;
        } else {
            System.out.println("The sum of the numbers is positive - it is false");
        }
        return false;
    }

    //2 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void posit(int e) {
        if (e >= 0) {
            System.out.println("The number " + e + " is positive");
        } else {
            System.out.println("The number " + e + " is negative");
        }
    }

    //3 Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    // если число отрицательное, и вернуть false если положительное.

    public static boolean negat(int n) {
        if (n >= 0) {
            System.out.println("The number  " + n + " is positive or 0");
            return true;
        } else {
            System.out.println("The number " + n + " is negative ");
            return false;
        }
    }

    //4 Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку,
    // указанное количество раз;

    public static void printMessage(int number, String message) {
        for (int i = 0; i < number; i++) {
            System.out.println(message);
        }
    }

    public static void counterMessage(int number, String message) {
        int i = 0;
        while (i < number) {
            System.out.println(message);
            i++;
        }
    }

    public static void counterMessageScanner() {
        Scanner number = new Scanner(System.in);
        Scanner mes = new Scanner(System.in);
        System.out.println("Enter number");
        int first = number.nextInt();
        System.out.println("Enter message");
        String result = mes.nextLine();
        for (int i = 0; i < first; i++) {
            System.out.println((i + 1) + ". " + result);
        }
    }


    //5 Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    public static boolean leapYear(int year) {

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year is true for " + year);
            return true;
        } else {
            System.out.println("Leap Year is false for " + year);
            return false;
        }
    }

    //6 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void arrBC() {
        int[] sm = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(sm));
        for (int i = 0; i < sm.length; i++) {
            if (sm[i] == 1) {
                sm[i] = 0;
            } else {
                sm[i] = 1;
            }
            //System.out.print(sm[i] + " ");
        }
        System.out.println(Arrays.toString(sm));
    }

//7 Задать пустой целочисленный массив длиной 100 (длину массива можно задать переменной - ml).
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void arrSize(int ml) {
        int[] sm = new int[ml];
        for (int i = 0; i < sm.length; i++) {
            sm[i] = i + 1;
        }
        System.out.println(Arrays.toString(sm));
    }

    //8 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;

    public static void arrMult(int[] array8) {
        System.out.println(Arrays.toString(array8));
        for (int i = 0; i < array8.length; i++) {
            if (array8[i] < 6) {
                array8[i] = array8[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array8));
    }

    //9 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void arrFillDiag(int a) {
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

    public static void arrFillIn(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    //10.1 Задать одномерный массив и найти в нем минимальный и максимальный элементы;


    public static void arrMinMax() {
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
        System.out.printf("min=%d max=%d", min, max);
        System.out.println();
    }

    //10.2 Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место,
    // в котором сумма левой и правой части массива равны.

    static boolean arrSumArr(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;

        for (int j = 0; j < array.length; j++) {
            sumRight += array[j];
        }
        for (int i = 0; i < array.length; i++) {
            sumLeft += array[i];
            sumRight -= array[i];
            if (sumLeft == sumRight) {
                System.out.println("The sum of left and right parts of the array can be equal");
                return true;
            }
        }
        System.out.println("The sum of left and right parts of the array are never equal");
        System.out.println();
        return false;
    }


    //12.3 Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.

    static void arrChange(int[] array, int n) {
        System.out.println(Arrays.toString(array));
        int current = 0;
        if (n < 0) {
            for (int i = 1; i <= Math.abs(n); i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    current = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = current;
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = array.length - 1; j > 0; j--) {
                    current = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = current;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}