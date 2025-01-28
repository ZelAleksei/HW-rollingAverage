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

        for (int i = 0; i < k; i++) { // в первом цикле заполняем первыми K числами
            double value = array.get(i).doubleValue();
            queue.add(value);
            sum += value;
        }

        System.out.println(sum / k); //выводим перввое среднее


        for (int i = k; i < array.size(); i++) {  //второй цикл
            double old = queue.remove(); //достаем и удаляем первый элемент
            sum -= old; // вычитаем первый эллемент

            double newelement = array.get(i).doubleValue(); //достаем из массива следующее число
            queue.add(newelement);//добавляем в очередь
            sum += newelement; //суммируем новый элемент
            System.out.println(sum / k); //выводим среднее
        }
    }
}




