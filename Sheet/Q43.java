package Sheet;

public class Q43 {
    public static void main(String[] args) {
        String str ="java is a programming langauge is a the java ";
        String[] ch=str.split (" ");
        int n=ch.length;
        boolean[] visit=new boolean[n];
        for (int i=0;i<n;i++){
            if (visit[i]){
                continue;
            }
            int count=1;
            for (int j=i+1;j<n;j++){
                if (ch[i].equals (ch[j])){
                    count++;
                    visit[j]=true;
                }
            }
//            System.out.println(ch[i]+"= "+count );
//            duplicate
//            if (count>1){
//                System.out.println(ch[i]+"= "+count );
//            }
            // remove duplicate

                System.out.print(ch[i]+" " );

        }

    }
}
