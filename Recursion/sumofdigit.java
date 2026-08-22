package Recursion;

import java.util.Scanner;

public class sumofdigit {
    public static int sum(int n){
        if (n==0){
            return 0 ;
        }
        int s=n%10;
        return s+sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("enter a number of digit" );
        int data= sc.nextInt ( );
        System.out.println (sum (data) );
    }
}
