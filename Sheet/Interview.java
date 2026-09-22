package Sheet;

public class Interview {
    public static void main(String[] args) {
//        int a=2,b=9,temp;
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println (a+" "+b );
//
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println (b+" "+a );
//        int fac=1;
//        for(int i=1;i<=5;i++){
//            fac=fac*i;
//        }
//        System.out.println (fac );
//
//        //odd and even
//        for (int i=1;i<50;i++){
//            if (i%2==0){
//                System.out.println ("even"+i );
//            }
////            else System.out.println ("odd"+i );
//        }
////        arm strom num
//
//        int num=153;
//        int rev=0;
//         int tem=num;
//        while (num>0){
//            int r=num%10;
//            rev=rev+r*r*r;
//            num=num/10;
//        }
//        if (rev==tem){
//            System.out.println ("arms" );
//        }else System.out.println ("not" );
////       reverse number
//
//        int n=12345,revs=0;
//        while (n>0){
//            int r=n%10;
//            revs=revs*10+r;
//            n=n/10;
//        }
//        System.out.println (revs );

        //rverse string

//        String str="hello";
////        String REV="";
//        char[] ch=str.toCharArray ();
//        for (int i= ch.length-1;i>=0;i--){
//            REV=REV+ch[i];
//
//        }    System.out.println (REV );

//        while loop se
//        int l=0;
//        int r= ch.length-1;
//        while (l<r){
//            char temp=ch[l];
//            ch[l]=ch[r];
//            ch[r]=temp;
//            l++;r--;
//        }
//        System.out.println (ch );

      String str="banjlksjlkfdjc m chuiuc;;ac,ana";
      char[] chars=str.toCharArray ();
      int n= chars.length;
      boolean[] visit=new boolean[n];
      for (int i=0;i<n;i++){
          if(visit[i]){
              continue;
          }

          int count=1;
          for (int j=i+1;j<n;j++){
              if(chars[i]==chars[j]){
                  count++;
                  visit[j]=true;
              }
          }
//          System.out.println (chars[i]  +"="+count);
//          System.out.print ( chars[i] );

          //find duplicate char
          if (count>1){
              System.out.print (chars[i]+"," );
          }
      }


    }

}
