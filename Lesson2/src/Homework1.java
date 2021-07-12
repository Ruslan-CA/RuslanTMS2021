public class Homework1 {
    public static void main(String[] args) {
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE)); // count: -2
    }

    /**
     Задача 1: Найти сумму двух чисел a и b
     1. Метод должен вернуть сумму двух чисел a и b
     2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     */
    public static int sum(int a, int b) {
        int sum = a + b;

        if (a > 0 && b > 0 && (Integer.MAX_VALUE - b < a) || (a < 0 && b < 0 && (Integer.MIN_VALUE - b > a))) {
            return -1;
        } else {
            return sum;
        }
    }
}
