/**
 * Задача 2:
 * Метод должен вернуть максимальное значение из двух чисел
 * Example1: a = 4, b = 5 Метод должен вернуть 5
 * Example2: a = 10, b = 10 Метод должен вернуть 10
 */
public class Homework2 {
    public static void main(String[] args) {
        System.out.println(max(4, 5));
        System.out.println(max(10, 10));
        System.out.println(max(56, 349));
    }

    public static int max(int a, int b) {
        int count = Math.max(a, b);
        return count;
    }
}
