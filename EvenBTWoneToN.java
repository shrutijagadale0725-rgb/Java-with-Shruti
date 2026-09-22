import java.util.*;
class EvenBTWoneToN{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        System.out.println("even Numbers are:");
        for(int i=1;i<=n;i++){
            if(i%2==0)
            System.out.println(i);//Displaly Number between 1 to N
        }
    }
}