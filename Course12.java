class Demo{
    int sem;
    int marks;
    Demo(int sem,int marks){
        this.sem=sem;
        this.marks=marks;
    }
    void display(){
        System.out.println("Semester of student is:"+sem);
        System.out.println("marks of student is:"+marks);
    }
}
public class Course12 {
    public static void main(String args[]){
        Demo d=new Demo(1,400);
        Demo d1=new Demo(2,400);
        Demo d2=new Demo(3,400);
        Demo d3=new Demo(4,400);

        d.display();
        d1.display();
        d2.display();
        d3.display();
    }
}