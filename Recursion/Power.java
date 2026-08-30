package Recursion;

import java.util.Scanner;

public class Power {
    public  static  int pow(int p,int q){
//    if (q==0)return 1;
//    return p*pow (p,q-1);

//    approach second
        if (q==0)return 1;
        int smallPow=pow (p,q/2);
        if (q%2==0){//even
            return smallPow*smallPow;
        }
        return p*smallPow*smallPow;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a two number" );
        int a= sc.nextInt ( );
        int b= sc.nextInt ( );
        System.out.println (pow (a,b) );
    }
}
