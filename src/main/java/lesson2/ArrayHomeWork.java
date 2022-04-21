package lesson2;

import static java.lang.Integer.parseInt;

public class ArrayHomeWork {
    public static void main(String[] args) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо)-> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n =-2 (на два влево)-> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.

        System.out.println("Решение первого задания, второго урока, второй методички про массивы");
        int LengthArray = 10;
        int[] array;
        int[][] arrayD;
        array = createArray(LengthArray);
        flipArray(array);

        System.out.println("Решение 2 задачи");
        array = createGeometricArray(8);
        System.out.println("Создан массив : " + arrayToString(array));

        System.out.println("Решение 3 задачи");
        creatingGivenArray();
        System.out.println("Массив создан: 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1");
        System.out.println("Создан массив : " + arrayToString(creatingGivenArray()));

        System.out.println("Решение 4 задачи");
        arrayD = creatingTwoDimensionalArray(8);
        showTwoDimensionalArray(arrayD);
        fillDiagonalsArray(arrayD, 1);
        showTwoDimensionalArray(fillDiagonalsArray(arrayD, 1));

        System.out.println("Решение 5 задачи");
        array = creatingGivenArray();
        System.out.println("Создан массив : " + arrayToString(array));
        System.out.println("минимальный эленет: " + minimumArrayElement(array));
        System.out.println("максимальный эленет: " + maximumArrayElement(array));

        System.out.println("Решение 6 задачи");
        boolean otvet;
        otvet = evennessHalvesArray(array);
        if (otvet == true) {
            System.out.println("Сумма первой половины массива равна сумме второй половины");

        } else System.out.println("В массиве не встречаються равные части");

        System.out.println("Решение 7 задачи");

        int shift = 0;
      array =  arrayShift(array, shift);

    }

    private static int[] arrayShift(int[] array, int shift) {
        int arraySh = 0;
        if (shift == 0) {
            return array;
        } else if (shift > 0) {
            for (int i = 0; i < shift; i++) {
                int variableArr = array[array.length];
                for (int j = 0; j < array.length; j++) {
                    arraySh = array[i];
                    array[i] = variableArr;
                    variableArr = arraySh;
                }
            }
            return array;
        } else if (shift < 0) {
            for (int i = 0; i < shift * (-1); i++) {
                int variableArr = array[0];
                for (int j = array.length; j == 0; j--) {
                    arraySh = array[i];
                    array[i] = variableArr;
                    variableArr = arraySh;
                }
            }
        }
        return array;
    }

    private static boolean evennessHalvesArray(int[] array) {
        int AmountFirstHalf = 0;
        int AmountSecondHalf = 0;

        for (int i = 0; i < array.length; i++) {
            AmountSecondHalf = 0;
            AmountFirstHalf = AmountFirstHalf + array[i];
            for (int j = i; j < array.length; j++) {
                AmountSecondHalf = AmountSecondHalf + array[j];
            }
            if (AmountSecondHalf == AmountFirstHalf) {
                return true;
            }
        }
        return false;
    }

    private static int maximumArrayElement(int[] array) {
        int max = array[1];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


    private static int minimumArrayElement(int[] array) {
        int min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    private static int[][] fillDiagonalsArray(int[][] arrayD, int a) {
        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i][i] = a;
            arrayD[i][arrayD.length - i - 1] = a;
        }
        return arrayD;
    }

    private static void showTwoDimensionalArray(int[][] arrayD) {
        System.out.println("Двумерный массив:");
        for (int i = 0; i < arrayD.length; i++) {
            System.out.println("-> : " + arrayToString(arrayD, i));
        }

    }

    private static int[][] creatingTwoDimensionalArray(int i) {
        int[][] array = new int[i][i];
        return array;
    }

    private static int[] creatingGivenArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //System.out.println("Массив создан: " + arrayToString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }


    private static int[] createGeometricArray(int i) {
        int[] array = new int[i];
        for (int j = 0; j < i; j++) {
            array[j] = j * 3;
        }
        return array;
    }

    private static int[] flipArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else array[i] = 0;
        }
        System.out.println("Создан пересоздан : " + arrayToString(array));
        return array;
    }

    private static String arrayToString(int[] array) {
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string = string + array[i] + " ";
        }
        return string;
    }

    private static String arrayToString(int[][] array, int a) {
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string = string + array[a][i] + " ";
        }
        return string;
    }

    private static int[] createArray(int LengthArray) {
        int[] ArrayNumber = new int[LengthArray];
        for (int i = 0; i < LengthArray - 1; i++) {
            ArrayNumber[i] = (int) ((Math.random() * ((1 - 0) + 1)) + 0);
        }
        System.out.println("Создан массив : " + arrayToString(ArrayNumber));
        return ArrayNumber;
    }
}


