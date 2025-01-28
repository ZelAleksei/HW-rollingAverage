package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RollingAverage {

    static double sum;

    /**
     * Метод для вывода подмассива
     *
     * @param array - массив данных
     * @param k     - размер подмассива
     */
    public static void getRollingAverage(ArrayList<Integer> array, int k) {
        Queue<Double> queue = new LinkedList(); // создаем очередь

        for (int i = 0; i < k; i++) {
            double value = array.get(i).doubleValue();
            queue.add(value);
            sum += value;
        }

        System.out.println(sum / k);


        for (int i = k; i < array.size(); i++) { //в цикле достаём и удаляем первый элемент сумируя со вторым не удаляя второй
            double old = queue.remove();
            sum -= old;

            double newelement = array.get(i).doubleValue();
            queue.add(newelement);
            sum += newelement;
            System.out.println(sum / k);
        }
    }
}




