import java.util.*;

class ArrayInReverse{
    public static void main(String ar[]){
    /*    int a[]={10,20,30,40,50};
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }*/
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter " + a + " elements:");
        for (int i=0;i<a;i++) {
                arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i=0;i<a;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
        }
}