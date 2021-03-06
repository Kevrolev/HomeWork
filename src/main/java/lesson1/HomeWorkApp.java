package lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords(); // 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.

        checkSumSign(); // //3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;

        printColor();// 4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
        compareNumbers(); //5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
        //Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
    }

    private static void compareNumbers() {
        int a = (int) (Math.random() * (200 + 1)) - 100;
        int b = (int) (Math.random() * (200 + 1)) - 100;

        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
        System.out.println("Значение чисел были следующие:");
        System.out.println("a->" + a);
        System.out.println("b->" + b);

    }

    private static void printColor() {
        int value = (int) (Math.random() * (300 + 1)) - 150;
        System.out.println("Код цвета: " + value);
        if (value < 0) {
            System.out.println("Цвет красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Цвет желтый");
        } else if (value > 100) {
            System.out.println("Цвет зеленый");
        }
    }


    //2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    private static void checkSumSign() {
        //Переменные созданны от -100 до 100
        int a = (int) (Math.random() * (200 + 1)) - 100;
        int b = (int) (Math.random() * (200 + 1)) - 100;
        int result = a + b;

        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
        System.out.println("Числа были следующие:");
        System.out.println("a->" + a);
        System.out.println("b->" + b);
    }


}


