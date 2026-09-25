import java.util.*;

class elemNinArr{
    public static void main(String ar[]){
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter "+a+" elements: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sorted Array:");
        Arrays.sort(arr);
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }*/
       int a[]={10,20,30,40,50};
       int n=10;
       for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
       }
       for(int i=0;i<a.length;i++){
        if(n==a[i])
        {
            System.out.println("\n"+"element found: "+a[i]);
        }
    }
    }
}