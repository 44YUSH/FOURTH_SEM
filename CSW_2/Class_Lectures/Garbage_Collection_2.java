package Class_Lectures;
class Emp{
  private int ID;
  private String name;
  private int age;
  private static int nextId = 1;
  public Emp(String name, int age){
    this.name=name;
    this.age=age;
    this.ID=nextId++;
  }
   public void show(){
    System.out.println("( Id : "+ID+" ) ( Name : "+name+")  ( Age : "+age+" )");
  }
  public void showNextId(){
    System.out.println("Next Employee id will be ="+nextId);
  }
  public void gap() {
	  System.out.println();
  }
  protected void finalize() {
	  --nextId;
  }
}
class Garbage_Collection_2{
  public static void main(String[]args){
    Emp E = new Emp("Anisha ", 20);
    E.show();
    E.showNextId();
    E.gap();
    Emp F = new Emp("Sidlu  ", 40);
    F.show();
    F.showNextId();
    F.gap();
    Emp G = new Emp("Subha  ", 150);
    G.show();
    G.showNextId();
    G.gap();
    {
      Emp X = new Emp("Subham ", 21);
      X.show();
      X.showNextId();
      X.gap();
      Emp Y = new Emp("Aayush ", 20);
      Y.show();
      Y.showNextId();
      Y.gap();
      
      X=Y=null;
      System.gc();
      System.runFinalization();
    }
    E.showNextId();
  }
}

//OUTPUT
//( Id : 1 ) ( Name : Anisha )  ( Age : 20 )
//Next Employee id will be =2

//( Id : 2 ) ( Name : Sidlu  )  ( Age : 40 )
//Next Employee id will be =3

//( Id : 3 ) ( Name : Subha  )  ( Age : 150 )
//Next Employee id will be =4

//( Id : 4 ) ( Name : Subham )  ( Age : 21 )
//Next Employee id will be =5

//( Id : 5 ) ( Name : Aayush )  ( Age : 20 )
//Next Employee id will be =6

//Next Employee id will be =4

