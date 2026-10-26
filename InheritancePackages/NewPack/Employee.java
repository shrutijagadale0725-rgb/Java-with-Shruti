package NewPack;
import myPack.Person;

public class Employee extends Person{
    int empId;
    public Employee(String name, int empId){
        super(name);
        this.empId=empId;
    }
    public void show(){
        System.out.println("ID of Employee is: " + empId);
    }
}