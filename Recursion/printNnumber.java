package Recursion;

import java.util.Scanner;

public class printNnumber {
    public void print(int n){
        if (n==0){
            return ;
        }
        System.out.println (n );
        print (n-1);
//        System.out.print (n+" " );

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter a number " );
        int data=sc.nextInt ();
         printNnumber obj=new printNnumber ();
        obj.print (data) ;
    }
}

