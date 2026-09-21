import java.util.*;
class ValidTri{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers/sides(of traingle):");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a+b>=c && b+c>a && a+c>b){
            System.out.println("Traingle is valid");
        }
        else{
            System.out.println("Traingle is Invalid");
        }
    }
}