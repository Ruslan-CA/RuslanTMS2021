public class Homework3 {
    public static void main(String[] args) {
        System.out.println(average(new int[]{1, 2, 3, 4, 5}));
        System.out.println(average(new int[]{0, -2, 3, -1, 5}));
    }

    /**
     * Задача 3:
     * Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * Example: array = {1,2,3,4,5} Метод должен return 3.0
     */
    public static double average(int[] array) {
        int sumValues = 0;
        double average;

        for (int j : array) {
            sumValues = sumValues + j;
        }
        average = sumValues / array.length;
        return average;
    }
}
