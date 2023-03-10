package prac3;

import java.util.Set;

public class TestSetSync {
    private static Set setSync = new SetSync();

    public static void main(String[] args) {
        testing();
    }
    public static void testing(){

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 21; i++) {
                setSync.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 21; i < 41; i++) {
                setSync.add(i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sync list:");
        setSync.forEach(System.out::println);
    }
}
