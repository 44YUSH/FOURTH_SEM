package Class_Lectures;
class Employee{
  private int ID;
  private String name;
  private int age;
  private static int nextId = 1;
  public Employee(String name, int age){
    this.name=name;
    this.age=age;
    this.ID=nextId++;
  }
   public void show(){
    System.out.println("Id : "+ID+" Name : "+name+" Age : "+age);
  }
  public void showNextId(){
    System.out.println("Next Employee id will be ="+nextId);
  }
}
class Garbage_Collection_1{
  public static void main(String[]args){
    Employee E = new Employee("Anisha", 20);
    E.show();
    E.showNextId();
    Employee F = new Employee("Sidlu", 40);
    F.show();
    F.showNextId();
    Employee G = new Employee("SubhaCR", 150);
    G.show();
    G.showNextId();
    {
      Employee X = new Employee("Subham", 21);
      X.show();
      X.showNextId();
      Employee Y = new Employee("Aayush", 20);
      Y.show();
      Y.showNextId();
    }
    E.showNextId();
  }
}


//OUTPUT
//Id : 1 Name : Anisha Age : 20
//Next Employee id will be =2
//Id : 2 Name : Sidlu Age : 40
//Next Employee id will be =3
//Id : 3 Name : SubhaCR Age : 150
//Next Employee id will be =4
//Id : 4 Name : Subham Age : 21
//Next Employee id will be =5
//Id : 5 Name : Aayush Age : 20
//Next Employee id will be =6
//Next Employee id will be =6
