/**
 * Задача 4:
 * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
 **/
public class Homework4 {
    public static void main(String[] args) {
        System.out.println(max(new int[]{1, 2, 10, 3}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
    }

    public static int max(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (count < array[i]) {
                count = array[i];
            }
        }
        return count;
    }
}
