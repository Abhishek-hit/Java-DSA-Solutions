package Sheet;

public class Q29 {
    public static void main(String[] args) {
        String str="hello";
        char[] ch=str.toCharArray ();
        int n= ch.length;


       for (int i=0;i<n-1;i++){
           for (int j=n;j>n-1;j--){
               int swap=ch[i];
               ch[j]=ch[i];
               ch[i]=swap;
           }
       }
    }

}
