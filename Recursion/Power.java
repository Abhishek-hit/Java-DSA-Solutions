package Recursion;

public class Power {
public  static  int pow(int p,int q){
//    if (q==0)return 1;
//    return p*pow (p,q-1);

//    approach 2 nd
    if (q==0)return 1;
    int smallPow=pow (p,q/2);
    if (q%2==0){//even
        return smallPow*smallPow;
}
    return p*smallPow*smallPow;
}
    public static void main(String[] args) {
        System.out.println (pow (2,5) );
    }
}
