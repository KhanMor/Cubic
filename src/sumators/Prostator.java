package sumators;

import com.kharkhanov.Consumer;

/**
 * Created by Mordr on 10.02.2017.
 */
public class Prostator implements Runnable {

    private final int[] numbers;
    private final Consumer consumer;

    public Prostator(int[] numbers, Consumer consumer) {
        this.numbers = numbers;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        int prost = 0;
        for(int number: numbers) {
            prost += number;
        }
        consumer.met(0, 0, prost);
    }
}
