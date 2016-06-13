/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.goit.Enterprise.Module3.OfflineExempleForMultithreading;

/**
 *
 * @author dev83
 */
public class Main {
    public static Producer producer = new Producer();
    public static Consumer consumer = new Consumer();
    
    
    public static void main(String[] args){
       // new Thread(producer).start();
       // new Thread(consumer).start();        
       
           
       /*Timer timer = new Timer();
       timer.scheduleAtFixedRate(new TimerTask(){
           @Override
           public void run() {
               System.out.println("qqq");
           }
           
       }, 0, 3000);
       */
       final long a = 5000*1024*1024;
       System.out.println(a);
       
    }
    
}
