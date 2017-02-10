package com.kharkhanov;

import sumators.Kubator;
import sumators.Kvadrator;
import sumators.Prostator;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        Consumer consumer = new Consumer();
        Kubator kubator = new Kubator(numbers, consumer);
        Kvadrator kvadrator = new Kvadrator(numbers, consumer);
        Prostator prostator = new Prostator(numbers, consumer);

        Thread threadKubator1 = new Thread(kubator);
        Thread threadKvadrator1 = new Thread(kvadrator);
        Thread threadProstator1 = new Thread(prostator);
        Thread threadKubator2 = new Thread(kubator);
        Thread threadKvadrator2 = new Thread(kvadrator);
        Thread threadProstator2 = new Thread(prostator);

        threadKubator1.start();
        threadKubator2.start();

        threadKvadrator1.start();
        threadKvadrator2.start();

        threadProstator1.start();
        threadProstator2.start();
    }
}
