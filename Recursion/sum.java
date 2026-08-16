package Recursion;

public class sum {
    public static int sumOf(int n){
        if (n==0){
            return 1 ;
        }
        int summinus=sumOf (n-1);
        int myan=n+summinus;
        return myan;
    }

    public static void main(String[] args) {
        System.out.println (sum.sumOf (5) );

    }
}
