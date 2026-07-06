package ru.aston.hometask.Module4;

public class TwoThreads {
    private static final Object lock = new Object();
    private static boolean isFirstTurn = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (!isFirstTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("1");
                    isFirstTurn = false;
                    lock.notifyAll();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (isFirstTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("2");
                    isFirstTurn = true;
                    lock.notifyAll();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
