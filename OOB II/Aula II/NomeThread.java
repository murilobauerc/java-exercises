package exerc05mrl;

/**
 *
 * @author 122138610
 */
public class NomeThread implements Runnable {
    @Override
    public void run() {
            System.out.println("Thread: " +
            Thread.currentThread().getName());
    } 
}
