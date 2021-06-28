import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //Некоторые тесты для проверки задач.Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        calculateSumOfDiagonalElements();
        countDevs(103);
        foobar(6);
        foobar(10);
        foobar(15);
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        int max = 100; // граница диапазона для случайных чисел от 0 до 100

        Scanner scanValue = new Scanner(System.in);
        System.out.print("Укажите размер массива: ");
        int arraySize = scanValue.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ++max);
            System.out.println(array[i]);
        }
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number = number - 2;
        } else if (number == 0) {
            number = 10;
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int amountNumbers = 0; // количество не четных элементов массива
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 - 1 == 0) {
                amountNumbers++;
            }
        }
        return amountNumbers;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        String devs = "";
        int lastNumber = count % 10;
        if (lastNumber == 1) {
            devs = "программист";
        } else if (lastNumber >= 2 & lastNumber <= 4) {
            devs = "программиста";
        } else if (lastNumber >= 5) {
            devs = "программистов";
        }
        String result = String.valueOf(count) + " " + devs;
        System.out.println(result);
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        String result = "";
        if (number % 3 == 0) {
            result = result + "foo";
        }
        if (number % 5 == 0) {
            result = result + "bar";
        }
        System.out.println(result);
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        // Объявим локальные переменные для хранения значения сумм диагоналей слева на право и с права на лево
        int sumDiagonalLeftRigt, sumDiagonalRigtLeft;
        // Инициализируем локальные переменные для диапазона случайных чисел
        int min = -300;
        int max = 300;
        int diapason = max + Math.abs(min) + 1;
        // Создадим маленький двумерный массив
        int[][] mas = new int[2][2];
        // Запоняем ранее созданны массив случайными числами из заданнго диапазона и выведим его на консоль
        for (int i = 0; i < 2; i++) {
            for (int s = 0; s < 2; s++) {
                mas[i][s] = (int) (Math.random() * diapason) - max;
                System.out.print(mas[i][s]);
                System.out.print(" ");
            }
            System.out.println();
        }
        // Т.к. длинна двумерного массива известна, по индексу получаем значения по диаганали
        sumDiagonalLeftRigt = mas[0][0] + mas[1][1];
        sumDiagonalRigtLeft = mas[0][1] + mas[1][0];
        // Выводим на консоль значения сумм по диагоналям
        System.out.println("Сумма элементов на диагонали с лева на право: " + String.valueOf(sumDiagonalLeftRigt));
        System.out.println("Сумма элементов на диагонали с права на лево: " + String.valueOf(sumDiagonalRigtLeft));
    }


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        // тут пишем логику
        // Посмотрю к следующему разу
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        // тут пишем логику
        // Посмотрю к следующему разу
    }


}
