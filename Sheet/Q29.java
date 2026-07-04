package Sheet;

public class Q29 {
    public static void main(String[] args) {
        String str="hello";
        char[] ch=str.toCharArray ();
        int n= ch.length;
        String rev=" ";
//        int i=0;
//        int j=n-1;
//        while (i<j){
//            char temp=ch[i];
//            ch[i]=ch[j];
//            ch[j]=temp;
//            i++;
//            j--;
//        }
//
//        String rev=new String ( ch );
//        System.out.println (rev );

        for (int i=0;i<=n-1;i++){
            rev=ch[i]+rev;
        }
        System.out.println (rev );
    }

}
