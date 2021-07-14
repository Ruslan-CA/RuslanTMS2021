import java.util.*;

public class Homework {
    public static void main(String[] args) {

        // проверк заданий:
        amoebasCount();
        summ(2, 5);
        trianglesArray();
        arrayOfOddNumbers();
        numCount();
        findIndexMax();
        oddNumbersMass();
        cNumbersMass();
        checkRepeat();
        trianglesArray();
    }

    /**
     //   1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
     //   сколько амеб будет через 3, 6, 9, 12,..., 24 часа
     */
    private static void amoebasCount() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        int x = scan.nextInt();
        int respaun = 1;
        for (int i = 0; i < x / 3; i++) {
            respaun *= 2;
        }
        System.out.printf("За %d часов будет %d амеб", x, respaun);
    }

    /**
     //  2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операциеи?
     //  умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль
     */
    private static void summ(int a, int b) {
        int result = 0;
        int[] mass = new int[b];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = a;
            result += mass[i];
        }
        System.out.printf("Результат %d", result);
    }

    /**
     //  3) Дан двумерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
     //объявляем и создаём массив, указывая только количество строк
     //        a)                  b)
     //              *        *
     //            * *        * *
     //          * * *        * * *
     //        * * * *        * * * *
     //
     //        c)                  d)
     //        * * * *        * * * *
     //          * * *        * * *
     //            * *        * *
     //              *        *
     */
    private static void trianglesArray() {
        String[][] twoArrayA = new String[4][];
        twoArrayA[0] = new String[]{" ", " ", " ", "*"};
        twoArrayA[1] = new String[]{" ", " ", "*", "*"};
        twoArrayA[2] = new String[]{" ", "*", "*", "*"};
        twoArrayA[3] = new String[]{"*", "*", "*", "*"};
        for (int i = 0; i < twoArrayA.length; i++) {
            for (int j = 0; j < twoArrayA[i].length; j++) {
                System.out.print(" " + twoArrayA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        String twoArrayB[][] = new String[4][];
        twoArrayB[0] = new String[]{"*", " ", " ", " "};
        twoArrayB[1] = new String[]{"*", "*", " ", " "};
        twoArrayB[2] = new String[]{"*", "*", "*", " "};
        twoArrayB[3] = new String[]{"*", "*", "*", "*"};
        for (int i = 0; i < twoArrayB.length; i++) {
            for (int j = 0; j < twoArrayB[i].length; j++) {
                System.out.print(" " + twoArrayB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        String twoArrayC[][] = new String[4][];
        twoArrayC[0] = new String[]{" ", " ", " ", "*"};
        twoArrayC[1] = new String[]{" ", " ", "*", "*"};
        twoArrayC[2] = new String[]{" ", "*", "*", "*"};
        twoArrayC[3] = new String[]{"*", "*", "*", "*"};
        for (int i = 0; i < twoArrayC.length; i++) {
            for (int j = 0; j < twoArrayC[i].length; j++) {
                System.out.print(" " + twoArrayC[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        String twoArrayD[][] = new String[4][];
        twoArrayD[0] = new String[]{"*", " ", " ", " "};
        twoArrayD[1] = new String[]{"*", "*", " ", " "};
        twoArrayD[2] = new String[]{"*", "*", "*", " "};
        twoArrayD[3] = new String[]{"*", "*", "*", "*"};
        for (int i = 0; i < twoArrayD.length; i++) {
            for (int j = 0; j < twoArrayD[i].length; j++) {
                System.out.print(" " + twoArrayD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     //   4) В переменную записываем число.
     //   Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
     //   Например, Введите число: 5
     //   "5 - это положительное число, количество цифр = 1"
     */
    private static void numCount() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число в котором надо посчитать количество цифр и узнать его знак: ");
        int x = scan.nextInt();

        int numberOfDigits = 1;
        int numberCut = x;

        while (Math.abs(numberCut) / 10 != 0) {
            numberOfDigits++;
            numberCut /= 10;
        }

        if (numberOfDigits > 0) {
            System.out.println(x + " - положительное число, количество цифр = " + numberOfDigits);
        } else if (x < 0) {
            System.out.println(x + " - отрицательное число, количество цифр = " + numberOfDigits);
        } else {
            System.out.println(x + " - ноль. Не положительный и не отрицательный. Количество цифр = 1");
        }
    }

    /**
     //  5) Создаи?те массив из всех нече?тных чисел от 1 до 100, выведите его на экран в строку,
     //  а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
     */
    public static void arrayOfOddNumbers() {
        int[] mass = {12, 55, 61, 62, 74, 44, 12, 11, -18, 41, -66, -17};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0) {
                System.out.printf(mass[i] + " ");
            }
        }
        System.out.println();

        for (int i = mass.length - 1; i >= 0; i--) {
            if (mass[i] % 2 != 0) {
                System.out.print(mass[i] + " ");
            }
        }
    }

    /**
     //  6) Создаи?те массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
     //  Определите какои? элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
     //  Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
     */
    public static void findIndexMax() {
        int[] mass = new int[12];
        int maxValue = 0;
        int indexMaxValue = 0;
        int min = 0;
        int max = 15;
        int diff = max - min;

        Random rand = new Random();
        // заполняем массив случайными числами
        for (int i = 0; i < mass.length; i++) {
            int randomNumber = rand.nextInt(diff + 1) + min;
            ;
            mass[i] = randomNumber;
        }
        System.out.println(Arrays.toString(mass));

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= maxValue) {
                maxValue = mass[i];
                indexMaxValue = i;
            }
        }
        System.out.printf("Максимальный значение %d, индекс %d", maxValue, indexMaxValue);
    }

    /**
     //   7) Создаи?те массив размера 20, заполните его случаи?ными целыми чиселами из отрезка от 0 до 20.
     //   Выведите массив на экран в строку. Замените каждыи? элемент с нече?тным индексом на ноль.
     //   Снова выведете массив на экран на отдельнои? строке.
     */
    private static void oddNumbersMass() {
        int mass[] = new int[20];
        int mass2[] = new int[20];
        int min = 0;
        int max = 20;
        int diff = max - min;

        Random rand = new Random();
        // заполняем массив случайными числами из диапазона 0 - 20
        for (int i = 0; i < mass.length; i++) {
            int randomNumber = rand.nextInt(diff + 1) + min;
            mass[i] = randomNumber;
        }
        System.out.println(Arrays.toString(mass));

        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0) {
                mass2[i] = mass[i];
            } else {
                mass2[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mass2));
    }

    /**
     //  8) Наи?ти максимальныи? элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
     */
    private static void cNumbersMass() {
        int mass[] = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int maxValue = -1;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > maxValue) {
                maxValue = mass[i];
            }
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                mass[i] = maxValue;
            }
        }
        System.out.println(Arrays.toString(mass));
    }

    /**
     //  9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
     //  Пример: {0,3,46,3,2,1,2}
     //  Массив имеет повторяющиеся элементы 3, 2
     //  Пример: {0,34,46,31,20,1,28}
     //  Массив не имеет повторяющихся элементов
     */
    public static void checkRepeat() {
        ArrayList<Integer> mass = new ArrayList<>();
        mass.add(0);
        mass.add(3);
        mass.add(46);
        mass.add(3);
        mass.add(2);
        mass.add(1);
        mass.add(2);

        Set<Integer> repeats = new HashSet<>();
        for (int i = 0; i < mass.size(); i++) {
            for (int j = i + 1; j < mass.size(); j++) {
                if (mass.get(i).equals(mass.get(j))) {
                    repeats.add(mass.get(i));
                    break;
                }
            }
        }
        if (repeats.isEmpty()) {
            System.out.println("Массив не имеет повторяющихся элементов");
        } else {
            System.out.print("Массив имеет повторяющиеся эелементы ");
            for (Integer repeat : repeats) {
                System.out.print(repeat + ", ");
            }
            System.out.print("\b\b");
            System.out.println();
        }
    }

    /**
     //10) Создае?м квадратную матрицу, размер вводим с клавиатуры.
     //  Заполняем случаи?ными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
     //  Далее необходимо транспонировать матрицу(1 столбец станет 1-и? строкои?, 2-и? столбец - 2-и? строкои? и т. д.)
     //  Пример:
     //  1 2 3 4      1 6 3 1
     //  6 7 8 9      2 7 3 5
     //  3 3 4 5      3 8 4 6
     //  1 5 6 7      4 9 5 7
     */
    public static void transpose(int[][] matr) {
        int[][] transposedMatr = new int[matr.length][matr.length];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                transposedMatr[j][i] = matr[i][j];
            }
        }
        for (int i = 0; i < transposedMatr.length; i++) {
            for (int j = 0; j < transposedMatr.length; j++) {
                System.out.printf("%2d ", transposedMatr[i][j]);
            }
            System.out.println();
        }
    }

    public static void task10() {
        System.out.println("Введите размер матрицы (целое положительное число)");
        Scanner input;
        Random generate = new Random();
        int dim;

        while (true) {
            input = new Scanner(System.in);
            if (input.hasNextInt()) {
                dim = input.nextInt();
                if (dim > 0) {
                    break;
                }
            }
            System.out.println("Введите целое положительное число");
        }

        int[][] matrix = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = generate.nextInt(51);
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        transpose(matrix);
    }
}