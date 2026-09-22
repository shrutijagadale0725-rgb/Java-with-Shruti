import java.util.*;
class Perfect{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        int per=sc.nextInt();
        int c=0;
        for(int i=1;i<per;i++)
        {
            if(per%i==0){
                c=c+i;
            }        
        }
        if(c==per){
            System.out.println(per+" is perfect");
        }
        else{
            System.out.println(per+" is NOT perfect");
        }
        }
    } 