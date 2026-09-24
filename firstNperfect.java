import java.util.*;

class firstNperfect {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many perfect numbers you want:");
        int p=sc.nextInt();
        int n=1;
        int count=0;

        while (count<p) {
            int sum=0;
            for (int i=1;i<n;i++) {
                if (n%i==0) {
                    sum=sum+i;
                }
            }
            if (sum==n) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}