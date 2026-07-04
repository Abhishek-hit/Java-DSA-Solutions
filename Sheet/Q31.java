package Sheet;

public class Q31 {
    public static void main(String[] args) {
        String str="abcdef";
        char[] ch=str.toCharArray ();
        int n= ch.length;
        for (int i=0;i<n;i+=2){
            char temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
        }
        String rsult= new String(ch);
        System.out.println (rsult );
    }
}
