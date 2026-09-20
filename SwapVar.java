import java.util.*;
class SwapVar{
    public static void main(String args[]){
        int a=10;
        int b=20;
        int c;

        c=a;
        a=b;
        b=c;
        System.out.println("Swap with 3rd var:"+"\na's value: "+a+"\nb's value: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swap without 3rd var:"+"\na's value: "+a+"\nb's value: "+b);

    }
}