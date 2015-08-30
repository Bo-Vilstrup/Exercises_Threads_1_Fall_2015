
package Exercise_1;


public class ThreadsExercise1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        int second = 1000;

        // Create tasks
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        
        // Make some Threads
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);
        
        // Start the Threads
        t1.start();
        t2.start();
        t3.start();
        
        // Sleep for 10 seconds then terminate thread 3 (t3).
        Thread.sleep(10*second);
        task3.terminateTask();
        
        System.out.println("End of program");
    } // End of main()
    
} // End of class
