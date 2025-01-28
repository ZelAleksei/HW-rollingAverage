package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,7,9,4,3));
        int k = 4;

        RollingAverage rollingAverage = new RollingAverage();
        rollingAverage.getRollingAverage(array,k);

    }
}
