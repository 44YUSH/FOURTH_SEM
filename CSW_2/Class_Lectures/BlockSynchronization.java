package Class_Lectures;
public class BlockSynchronization{
    public static void main(String[]args){
        Calculator calculator=new Calculator();
        WorkerThread1 t1=new WorkerThread1(calculator);
        WorkerThread2 t2=new WorkerThread2(calculator);
        t1.start();
        t2.start();
    }
}
class Calculator{
    void multiplicationTable(int n){
        synchronized(this){
            for(int i=1; i<=10; i++){
                System.out.println(Thread.currentThread().getName()+" : "+n*i);
                try{
                    Thread.sleep(400);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
class WorkerThread1 extends Thread{
    Calculator t;
    WorkerThread1(Calculator t){
        this.t=t;
        this.setName("Worker Thread 1");
    }
    public void run(){
        t.multiplicationTable(3);
    }
}
class WorkerThread2 extends Thread{
    Calculator t;
    WorkerThread2(Calculator t){
        this.t=t;
        this.setName("Worker Thread 2");
    }
    public void run(){
        t.multiplicationTable(40);
    }
}