package Class_Lectures;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Concurrency1 {
    public static void main(String[] args) {
        ExecutorService executor=Executors.newFixedThreadPool(5);
        for(int i=0; i<10; i++){
            Runnable workers=new WorkerThread(" "+i);
            executor.execute(workers);
        }
        executor.shutdown();
        while(!executor.isTerminated()){
            System.out.println("All task completed.");
        }
    }
}
class WorkerThread implements Runnable{
    private String message;
    public WorkerThread(String s){
        this.message=s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"(Start) message = "+message);
        processMessage();

        System.out.println(Thread.currentThread().getName()+" (END) "+message);
    }
    private void processMessage(){
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}