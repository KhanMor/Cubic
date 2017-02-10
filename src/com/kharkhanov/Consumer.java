package com.kharkhanov;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Mordr on 10.02.2017.
 */
public class Consumer {
    private volatile static boolean lockKube = false;
    private volatile static boolean lockKvadro = false;
    private volatile static boolean lockSimple = false;

    private volatile AtomicInteger result = new AtomicInteger(0);

    public void met(int kube, int kvadro, int simple) {
        if(kube != 0) {
            lockAndAdd(lockKube, kube);
        }
        if(kvadro != 0) {
            lockAndAdd(lockKvadro, kvadro);
        }
        if(simple != 0) {
            lockAndAdd(lockSimple, simple);
        }
    }

    private void lockAndAdd(boolean lock, int addValue) {
        while (lock) {
            Thread.yield();
        }
        try {
            result.addAndGet(addValue);
            System.out.println("Result = " + result);
        } finally {
            lock = false;
        }
    }
}
