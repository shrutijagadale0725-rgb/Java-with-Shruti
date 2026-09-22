//C] LOOP Control Structure
import java.util.*;
class forLoop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        System.out.println("Numbers are:");
       /*for(int i=1;i<=n;i++){
            System.out.println(i);//Displaly Number between 1 to N
        }*/
       for(int i=n;i>=1;i--){
            System.out.println(i);//Displaly Number between N to 1
       }
    }
}


