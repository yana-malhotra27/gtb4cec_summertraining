package Practice;

public class Record {
    public static void main(String[] args) {
        //declare
        Student st1= new Student();
        Student st2 = new Student(15,"makiza",90.0f);
        st1.roll=8;
        System.out.println(st1.roll);
        System.out.println(st1.name);
        System.out.println(st1.marks);
        System.out.println(st2.roll);
        System.out.println(st2.name);
        System.out.println(st2.marks);
        st1.greeting();
    }
    
}
//class
class Student {
    int roll;
    String name;
    float marks=90;
    Student(int roll,String name,float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    void greeting(){
        System.out.println("hello"+name);
    }
    Student(){
        this.roll=9;
        this.name="aman";
        this.marks=88;
    }
    
}