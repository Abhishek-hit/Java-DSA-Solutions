package Sheet;

public class Q36 {
    public static void main(String[] args) {
        String str="banana";
        char[] chars=str.toCharArray ();
        int n=chars.length;
        boolean[] visited=new boolean[n];
        for (int i=0;i<n;i++){
            if (visited[i]){
                continue;
            }
            int count=1;
            for (int j=i+1;j<n;j++){
                if (chars[i]==chars[j]){
                    count++;
                    visited[j]=true;
                }
            }
//            System.out.println(chars[i] + " = " + count);
            if (count>1){
                System.out.println(chars[i] + " = " + count);
            }
        }


    }
}
