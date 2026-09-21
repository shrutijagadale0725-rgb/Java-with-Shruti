import java.util.*;
class DiVbyfivNSev{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:");
        int f=sc.nextInt();

        if(f%5==0 && f%7==0 ){
            System.out.println(f+" is divisible by 5 and 7");
        }
        else if(f%5==0){
            System.out.println(f+" is divisible only by 5");
        }
        else if(f%7==0){
            System.out.println(f+" is divisible only by 7");
        }
        else{
            System.out.println("Invalid");
        }
    }
}