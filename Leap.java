import java.util.*;
class Leap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Year: ");
        int n=sc.nextInt();
        if(n%4==0 && (n%100!=0 || n%400==0)){
            System.out.println(n+" is leap year");
        }
        else{
            System.out.println(n+" is not leap year");
        }
    }
}