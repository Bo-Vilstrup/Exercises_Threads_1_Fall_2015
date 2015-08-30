/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_2;

/**
 *
 * @author bo
 */
public class ThreadsExcise1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        int second = 1000;
        
        Even even = new Even();
        
        EvenNumberGenerator e1 = new EvenNumberGenerator(even);
        EvenNumberGenerator e2 = new EvenNumberGenerator(even);
        
        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        
        t1.start();
        t2.start();
        
        // terminate after 5 seconds
        Thread.sleep(5 * second);
       
        e1.terminate();
        e2.terminate();
        
        System.out.println("The 5 seconds are finito");
        
        
    } // End of main()
    
} // End of class
