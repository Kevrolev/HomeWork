package lesson2;

import java.nio.file.FileAlreadyExistsException;

public class Lesson2 {
    public static void main(String[] args) {
        //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
//5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        int a = 10;
        int b = 15;
        boolean Value;

        firstTask(a, b);
        secondTask(a);
        Value = thirdTask(a);
        System.out.println("Результатом выполнение 3 задачи = "+Value);
    }

    private static Boolean thirdTask(int a) {
        System.out.println("Решение 3 задачи.");
        if (a < 0) {
            return false;
        }
        return true;
    }

    private static void secondTask(int a) {
        System.out.println("Решение 2 задачи.");
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    private static boolean firstTask(int a, int b) {
        System.out.println("Решение первой задачи:");
        System.out.println("Входные данные а: " + a + ", b: " + b);
        int Result = a + b;
        boolean Volue;
        if (Result >= 10 && Result <= 20) {
            Volue = true;
        } else {
            Volue = false;
        }

        System.out.println("Результат выполнение медода = " + Volue);
        return Volue;
    }

}
