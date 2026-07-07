package Sheet;

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
       // String str="madam";
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
       if (sc.hasNextInt ()){
           System.out.println ("pls enter string only TE S" );
           return;// yahi pr program end ho gya
       }else {
           str = sc.nextLine ( );

       }
        char[] ch=str.toCharArray ();
        int n= ch.length;
        int l=0;
        int r=n-1;
        while (l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        String result=new String ( ch );
      if (result.equals (str)){
          System.out.println ("palindrom" );
      }else {
          System.out.println ("not palindrom" );
      }
    }
}
