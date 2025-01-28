package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RollingAverage {

    static double sum;

    /**
     * Метод для вывода подмассива
     * @param array - массив данных
     * @param k - размер подмассива
     */
    public static void getRollingAverage(ArrayList<Integer> array, int k) {
        Queue<Double> queue = new LinkedList(); // создаем очередь

        for (Integer value : array) { //заполняем очередь данными из массива приводя их к типу Double
            queue.add(value.doubleValue());
        }

        for (int i = 0; i <= queue.size(); i++) { //в цикле достаём и удаляем первый элемент сумируя со вторым не удаляя второй
            if (!queue.isEmpty()) {
                double removed = queue.remove();
                double nextElement = queue.peek();
                sum = (removed + nextElement) / k;
                System.out.println(sum);
            }
        }
    }
}



