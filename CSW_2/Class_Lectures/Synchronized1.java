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

/*
OUTPUT:

Increment count: 1
Decrement count: 0
Decrement count: -1
Decrement count: -2
Decrement count: -3
Decrement count: -4
Decrement count: -5
Decrement count: -6
Decrement count: -7
Decrement count: -8
Decrement count: -9
Increment count: -8
Increment count: -7
Increment count: -6
Increment count: -5
Increment count: -4
Increment count: -3
Increment count: -2
Increment count: -1
Increment count: 0
 */