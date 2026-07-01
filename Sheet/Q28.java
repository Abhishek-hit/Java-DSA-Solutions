package Sheet;

public class Q28 {
    public static void main(String[] args) {
        String str="jata";
        StringBuilder sb= new StringBuilder (str);
        sb.setCharAt (2,'v');
        String result=sb.toString ();
        System.out.println (result );
    }
}
