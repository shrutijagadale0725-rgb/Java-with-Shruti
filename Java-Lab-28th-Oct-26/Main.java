import java.util.*;
class Main{
    public static void main(String[] args){
        int maths,java,python;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your marks of maths, java, python : ");
        maths = sc.nextInt();
        java = sc.nextInt();
        python = sc.nextInt();

        Student s = new Student(maths,java,python);

        System.out.println("Total Marks: " + s.CalculateTotal());
        System.out.println("Percentage: " + s.CalculatePercentage() + "%");
        System.out.println("Grade: " + s.CalculateGrade());

    }
}