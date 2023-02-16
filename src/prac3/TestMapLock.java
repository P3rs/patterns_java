package prac3;

import java.util.Map;

public class TestMapLock {
    private static Map<Integer, String> mapLock = new MapLock<>();

    public static void main(String[] args) {
        testing();
    }
    public static void testing(){

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 21; i++) {
                mapLock.put(i,"value"+i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 21; i < 41; i++) {
                mapLock.put(i,"value"+i);
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
        mapLock.forEach((key,value)-> System.out.println(key+": "+value));
    }
}
