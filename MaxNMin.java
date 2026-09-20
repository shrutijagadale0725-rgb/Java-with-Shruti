import java.util.*;
class MaxNMin{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max, min;

        if(a>b && a>c){
            max=a;
        }
        else if(b>c && b>a){
            max=b;
        }
        else{
            max=c;
        }

        if(a<b && a<c){
            min=a;
        }
        else if(b<c && b<a){
            min=b;
        }
        else{
            min=c;
        }

        System.out.println("Maximum: "+max+", Minimum: "+min);
    }
}