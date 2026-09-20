import java.util.*;

class Circle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius:");
        int radius=sc.nextInt();
        double pi=3.1415;

        System.out.println("Area of Circle: "+(pi*radius*radius));
        System.out.println("Circumference of circle: "+(2*pi*radius));
    }
}