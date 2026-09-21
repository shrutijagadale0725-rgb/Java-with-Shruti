import java.util.*;
class MulOfTHREE{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int three=sc.nextInt();

        if(three%3==0){
             System.out.println(three+" is divisible by 3");
        }
        else{
            System.out.println(three+" is NOT divisible by 3");
        }
    }
}
