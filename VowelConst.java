import java.util.*;
class VowelConst{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0); 

        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')||(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
                System.out.println("The entered character "+ch+" is Vowel");
            }
            else{
                System.out.println("The entered character "+ch+" is Consonant");
            } 
        }
        else if(ch>='0' && ch<='9'){
            System.out.println(ch+" is digit");
        }
        else{
             System.out.println(ch+" is Special character");
        }
    }
}