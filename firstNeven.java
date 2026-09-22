import java.util.*;
class firstNeven{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a nth number:");
        int z=sc.nextInt();

        for(int j=1;j<=z;j++){
            System.out.println(2*j+" ");
        }
    }
}