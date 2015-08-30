
package Exercise_1;


public class Task1 implements Runnable {

    @Override
    public void run() {
    
        // compute and print the sum of all numbers from 1 to 1 billion
        long billion = 1_000_000_000;
        long sum = 0;
        
        for (int i = 0; i < billion; i++) {
            
            sum += i;
        }
    
        System.out.println("Task1, sum of 1 billion is: " + sum);
        
    } // End of run()
} // End of Class Task
