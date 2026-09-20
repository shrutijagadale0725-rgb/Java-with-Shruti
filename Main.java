import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Any Number");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Division:"+(a/b));
        System.out.println("Multiplication:"+(a*b));
    }
}