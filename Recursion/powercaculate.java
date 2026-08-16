package Recursion;

public class powercaculate {
    public static int  power(int x,int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int xpower=power (x,n-1);
        return x*xpower;
    }
    public static void main(String[] args) {
        System.out.println (powercaculate.power (5,2) );

    }
}
