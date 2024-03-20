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
    System.out.println("Id : "+Id+" Name : "+name+" Age : "+age);
  }
  public void showNextId(){
    System.out.println("Next Employee id will be ="+nextId);
  }
}
class Garbage_Collection_1{
  public static void main(String[]args){
    Employee E = new Employee("Anisha", 20);
    Employee F = new Employee("Sidlu", 40);
    Employee G = new Employee("SubhaCR", 150);
    E.show();
    F.show();
    G.show();
    {
      Employee X = new Employee("Subham", 21);
      Employee Y = new Employee("Aayush", 20);
      X.show();
      Y.show();
      X.showNextId();
      Y.showNextId();
    }
    E.showNextId();
  }
}
