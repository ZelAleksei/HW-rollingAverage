package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,5));
        int k = 2;

        RollingAverage rollingAverage = new RollingAverage();
        rollingAverage.getRollingAverage(array,k);

    }
}
