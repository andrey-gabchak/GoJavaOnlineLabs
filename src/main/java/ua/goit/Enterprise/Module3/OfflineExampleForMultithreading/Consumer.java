/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.goit.Enterprise.Module3.OfflineExampleForMultithreading;

/**
 * @author dev83
 */
public class Consumer implements Runnable {

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                while (!Main.producer.isProduced()) {
                    try {
                        System.out.println("Consumer.@Before wait");
                        wait();
                        System.out.println("Consumer.@After wait");
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            synchronized (Main.producer) {
                try {
                    int number = Main.producer.getProductNumber();
                    System.out.println("\tConsumed:" + number);
                     Thread.sleep(3000);
                    Main.producer.notifyAll();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

}
