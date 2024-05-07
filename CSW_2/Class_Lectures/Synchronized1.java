package Class_Lectures;

class Counter {
    private int count=0;
    public synchronized void increments(){
        count++;
        System.out.println("Increment count: "+count);
    }    
    public synchronized void decrements(){
        count--;
        System.out.println("Decrement count: "+count);
    }
    public synchronized int getCount(){
        System.out.println("Syncronized count : "+count);
        return count;
    }
}
public class Synchronized1{
    public static void main(String[] args) {
        Counter counter=new Counter();

        Thread thread1=new Thread(() -> {
            for(int i=0; i<10; i++){
                counter.increments();
            }
        });
        Thread thread2=new Thread(() -> {
            for(int i=0; i<10; i++){
                counter.decrements();
            }
        });
        thread1.start();
        thread2.start();
    }
}
