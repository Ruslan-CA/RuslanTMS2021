public class Homework5 {
    public static void main(String[] args) {
        System.out.println(calculateHypotenuse(3, 4));
        System.out.println(calculateHypotenuse(12, 16));
    }

    /**
     * Задача 5:
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * Example1: 3   4 return 5
     * Example2: 12  16 return 20
     */
    public static double calculateHypotenuse(int a, int b) {
        // a^{2}+b^{2}=c^{2}
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return hypotenuse;
    }
}