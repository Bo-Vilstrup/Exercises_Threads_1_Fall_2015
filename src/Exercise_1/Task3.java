
package Exercise_1;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Task3 implements Runnable {

    private boolean terminater = true;
    
    @Override
    public void run() {
    
        // Print all numbers from 10 and up.
        // Pause for 3 seconds between each print.
        int number = 10;
        int second = 1000;
        
        
        while(terminater) {
            
            try {
                
                System.out.println("Task3, count from 10 and up: " + number++);
                Thread.sleep(3*second);
            
            } catch (InterruptedException ex) {
                System.err.println("InterruptedException: " + ex);
            } // End of try-catch block
        } // End of while()
        
    } // End of run()
    
    public void terminateTask() {
        
        terminater = false;
    }
    
} // End of Class Task
