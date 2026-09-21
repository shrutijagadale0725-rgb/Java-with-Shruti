import java.util.*;
class Vote{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any AGE:");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("Candidate of "+age+" is eligible to vote");
        }
        else{
            System.out.println("Candidate of "+age+" is NOT eligible to vote");
        }
    }
}