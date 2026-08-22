package Recursion;

import java.util.Scanner;

public class countzero {
    public static int count(int n,int counts){
        if (n==0){
            return counts;
        }
        int rem=n%10;
        if (rem==0){
            return count(n/10,counts+1);
        }else return count(n/10,counts);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        System.out.println ("enter a number of digit" );
        int data= sc.nextInt ( );
        System.out.println (count (data,0) );
    }
}
