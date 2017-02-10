package sumators;

import com.kharkhanov.Consumer;

/**
 * Created by Mordr on 10.02.2017.
 */
public class Kvadrator implements Runnable {

    private final int[] numbers;
    private final Consumer consumer;

    public Kvadrator(int[] numbers, Consumer consumer) {
        this.numbers = numbers;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        int kvadr = 0;
        for(int number: numbers) {
            kvadr += Math.pow(number, 2);
        }
        consumer.met(0, kvadr, 0);
    }

}
