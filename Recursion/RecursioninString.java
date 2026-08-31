package Recursion;

import java.util.Scanner;

public class RecursioninString {
    public static String RemoveOccurence(String s, int idx){
        if (idx==s.length ()) return "";
        String smallAns=RemoveOccurence (s,idx+1);
        char currChar=s.charAt (idx);
        if (currChar!='a'){
            return  currChar+smallAns;
        }else {
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println ("enter a string" );
        String a=sc.nextLine ();
        System.out.println (RemoveOccurence(a,0) );
    }
}
