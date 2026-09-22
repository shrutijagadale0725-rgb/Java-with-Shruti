import java.util.*;
class Armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int r;
        int sum=0;
        int t=n;


        while(n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(t==sum){
            System.out.println(t+" is Armstrong");
        }
        else{
            System.out.println(t+" is NOT Armstrong");
        }
    }
}
