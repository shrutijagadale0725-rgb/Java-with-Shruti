import java.util.*;
class PosORnegORzero{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:");
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.print(n+" is Positive");
        }
        else if(n<0)
        {
            System.out.print(n+" is negative");
        }
        else
        {
            System.out.print(n+" is zero");
        }
    }
}