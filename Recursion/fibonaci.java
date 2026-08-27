package Recursion;

import java.util.Scanner;

public class fibonaci {
    public static int fibonaciNub(int n){
        if (n==0||n==1){
            return n;
        }
        return fibonaciNub (n-1)+fibonaciNub (n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter a nunber to find fibonacci number");
        int n= sc.nextInt ( );
        for(int i=0;i<n;i++){
            System.out.print (fibonaciNub (i)+" " );
        }
    }
}
