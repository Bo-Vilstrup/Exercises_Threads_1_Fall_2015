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
public class EvenNumberGenerator implements Runnable {

    private Even even;
    private int odd = 0;
    private boolean terminator = true;
    
    EvenNumberGenerator(Even even) { this.even = even; }
    
    @Override
    public void run() {
    
        while( (odd % 2 == 0) && terminator  ) {
           
           odd = even.next();
           
        } 
        
        if(terminator) {
            System.out.println("EvenNumberGenerator got an odd number: " + odd);
        } else {
            System.out.println("No odd numbers was generated");
        }
        
    } // End of run()
    
    public void terminate() {
        
        terminator = false;
       
    }
    
} // End of Class
