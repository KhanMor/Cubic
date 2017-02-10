package sumators;

import com.kharkhanov.Consumer;
/**
 * Created by Mordr on 10.02.2017.
 */
public class Kubator implements Runnable {
    private final int[] numbers;
    private final Consumer consumer;

    public Kubator(int[] numbers, Consumer consumer) {
        this.numbers = numbers;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        int kube = 0;
        for(int number: numbers) {
            kube += Math.pow(number, 3);
        }
        consumer.met(kube, 0, 0);
    }
}
