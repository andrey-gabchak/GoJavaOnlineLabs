/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.goit.Enterprise.Module3.OfflineExampleForMultithreading;

/**
 *
 * @author dev83
 */
public class Producer implements Runnable{
    private int productNumber;
    private boolean produced;
    
    @Override
    public void run() {
        for(;;){
            synchronized(this){
                while(produced){
                    try {
                        System.out.println("Producer.@Before wait");
                        wait();
                        System.out.println("Producer.@After wait");
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }              
            }
            synchronized(Main.consumer){
                productNumber++;
                System.out.println("Produced:"+productNumber);
                produced=true;
                Main.consumer.notify();
            }            
        }
    }
    
    public int getProductNumber(){
        produced=false;
        return productNumber;
    }
    
    public boolean isProduced(){
        return produced;
    }
    
}
