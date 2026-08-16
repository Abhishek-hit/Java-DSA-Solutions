package Recursion;

public class printnum {
    public void printNubr(int n){
        if (n==0){
            return;
        }
        System.out.println (n );
        printNubr (n-1);

    }
    public static void main(String[] args) {
       printnum s=new printnum ();
       s.printNubr (5);
    }
}
