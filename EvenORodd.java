import java.util.*;
class EvenORodd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.print(n+" is even");
        }
        else
        {
            System.out.print(n+" is odd");
        }
    }
}