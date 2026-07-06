package ru.aston.hometask.Module4;

public class DeadLockExample {
    private static final Object RESOURCE_1 = new Object();
    private static final Object RESOURCE_2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (RESOURCE_1) {
                System.out.println("Thread 1: Locked RESOURCE_1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for RESOURCE_2...");
                synchronized (RESOURCE_2) {
                    System.out.println("Thread 1: Locked RESOURCE_1 and RESOURCE_2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (RESOURCE_2) {
                System.out.println("Thread 2: Locked RESOURCE_2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for RESOURCE_1...");
                synchronized (RESOURCE_1) {
                    System.out.println("Thread 2: Locked RESOURCE_1 and RESOURCE_2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
