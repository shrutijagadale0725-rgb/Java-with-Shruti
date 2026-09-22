import java.util.*;
class Factorial{
    public static void main(String argsp[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number:");
    int fact=sc.nextInt();
    int f=1;
    /*for(int i=1;i<=fact;i++){ //Factorial of a number
          f=f*i;
    }
    System.out.println("Factorial: "+f);*/ 

    for(int i=1;i<=fact;i++){
          f=f*i;
          System.out.println("Factorial: "+f);//Display Factorial series upto n
    }
    }
}
