import java.util.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        int p=sc.nextInt();
        int c=0;
        for(int i=1;i<=p;i++)
        {
            if(p%i==0){
                c++;
            }        
        }
        if(c==2){
            System.out.println(p+" is prime");
        }
        else{
            System.out.println(p+" is NOT prime");
        }
        }
    } 