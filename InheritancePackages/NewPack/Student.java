package NewPack;
import myPack.Person;
public class Student extends Person{
    int Marks;

    public Student(String name, int Marks){
        super(name);
        this.Marks=Marks;
    }
    public void show() {
        System.out.println("MARKS of the Student is: " + Marks);
    }
    public static void main(String main[]){
        Student s = new Student("Shruti",89);
        s.disp();
        s.show();
    }
}