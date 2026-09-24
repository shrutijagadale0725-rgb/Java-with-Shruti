import java.util.*;

class firstNprime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many prime numbers you want:");
        int p = sc.nextInt();

        int n = 2;
        int count = 0;

        while (count < p) {
            int c = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    c++;
                }
            }

            if (c == 2) {
                System.out.println(n);
                count++;
            }

            n++;
        }
    }
}