class Student{
    String name;
    String DOB;
    int age;
   
  Student(String name,String DOB,int age){
    this.name=name;
    this.DOB=DOB;
    this.age=age;
  }
  void displayinfo(){
    System.out.println("name of student is:"+name);
    System.out.println("DOB of student is:"+DOB);
    System.out.println("age of student is:"+age);

 }
}
public class Demo{
    public static void main(String args[]){
        Student s = new Student("iram","08-05-2005",19);
        s.displayinfo(); 
    }
}
