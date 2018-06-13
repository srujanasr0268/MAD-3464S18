/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author macstudent
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread t1 = Thread.currentThread();
        System.out.println("current thread :" + t1);
        
        t1.setName("test thread");
        t1.setPriority(10);
        System.out.println("thread info after modification : " + t1);
        System.out.println("State of thread t1 : " + t1.getState());
        System.out.println("alive or dead : " + t1.isAlive());
        System.out.println("Daemon or non-Daemon : " + t1.isDaemon());
        
        
        try{
        for(int i=1; i<=3; i++){
            System.out.println("main thread : " + i);
            new FirstThread();
            new SecondThread("second cup");
            new SecondThread("Second innings");
            Thread.sleep(6000);
            
    }
    }catch(InterruptedException e){
        e.printStackTrace();
    }finally{
            System.out.println("Exiting from main thread");
        
    }
    }
    
}
