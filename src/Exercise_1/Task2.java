
package Exercise_1;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Task2 implements Runnable {

    @Override
    public void run() {
    
        // Print the numbers from 1 to 5.
        // Pause for 2 seconds between each print.
        
        int iterations = 5;
        int second = 1000;
        
        for (int i = 0; i < iterations; i++) {
            
            try {
                
                System.out.println("Task2, iteration :" + i);
                Thread.sleep(2*second);
            
            } catch (InterruptedException ex) {
                System.err.println("InterruptedException " +ex);
            } // End of try-catch block
        } // End of for()
        
        
    
    } // End of run()
    
} // End of Class Task
