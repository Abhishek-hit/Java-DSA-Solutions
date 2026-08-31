package Recursion;

import java.util.Scanner;

public class reverse {
    static  String reverse(String s, int idx){
        if (idx==s.length ()) return "";
        String smallAns=reverse (s,idx+1);
        return smallAns+s.charAt (idx);
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in);
        String rev=scanner.nextLine ();

        System.out.println (reverse(rev,0) );

    }
}
