package Class_Lectures;

public class DeadLock {
    public static void main(String[] args) {
        final String firstResource="First Resource";
        final String secondResource="Second Resource";

        Thread thread1=new Thread("First Thread"){
            public void run(){
                synchronized(firstResource){
                    System.out.println(this.getName()+" : First Resource is LOCKED.");
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception e){
                        
                    }
                    synchronized(secondResource){
                        System.out.println("Second Resource is LOCKED.");
                    }
                }
            }
        };
        Thread thread2=new Thread("Second Thread"){
            public void run(){
                synchronized(secondResource){
                    System.out.println(this.getName()+" : Second Resource is LOCKED.");
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception e){
                        
                    }
                    synchronized(firstResource){
                        System.out.println("first Resource is LOCKED.");
                    }
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}

/*
CODE will stay in Running Condition.
 */