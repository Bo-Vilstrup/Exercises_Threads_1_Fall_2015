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
public class Even {
    
    private int n = 0;
    
    // This method has to be synchronized for the program to work properly.
    public synchronized int next() {
        
        n++;
        n++;
        return n;
        
    } // End of next()
    
} // End of class
