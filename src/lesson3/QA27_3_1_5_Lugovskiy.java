package lesson3;

/**
 * Задача 5. Создайте массив и заполните массив.
 * Выведите массив на экран в строку.
 * Замените каждый элемент с нечётным индексом на ноль.
 * Снова выведете массив на экран на отдельной строке.
 */

import java.util.Arrays;
import java.util.Random;
public class QA27_3_1_5_Lugovskiy {
    public static void main(String[] args) {
        int[] array = new int[40];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(20);
        System.out.println("Массив до изменения : " + Arrays.toString(array));
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0)
                array[j] = 0;
        }
        System.out.println("Массив после внесения изменений : " + Arrays.toString(array));
    }
}
