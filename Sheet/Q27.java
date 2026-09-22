package Sheet;

public class Q27 {
    public static void main(String[] args) {
        String str="hello";
        String REV="";
        char[] ch=str.toCharArray ();
        for (int i= ch.length;i>=0;i--){
            REV=REV+ch[i];

        }    System.out.println (REV );

    }
}
