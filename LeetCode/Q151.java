package LeetCode;

public class Q151 {

    public static String[] reverseWords(String s) {
        // 1. String ke aage-peeche ke extra spaces hatao aur usko words mein tod do
        // "\\s+" ka matlab hai "ek ya ek se zyada spaces" jahan mile, wahan se string split kar do
        String[] ch = s.trim().split("\\s+");
     int n= ch.length;
        int l=0;
        int r=n-1;

        // String banane ke liye StringBuilder ka use karte hain kyunki yeh fast hota hai
//        StringBuilder result = new StringBuilder();
//
//        // 2. Words ke array par ulta (reverse) loop chalao
//        for (int i = words.length - 1; i >= 0; i--) {
//            result.append(words[i]);
//
//            // Aakhiri word ke baad space add nahi karna hai
//            if (i > 0) {
//                result.append(" ");
//            }
//        }
//
//        return result.toString();

        //  String rev=" ";
        int i=0;
        int j=n-1;
        while (i<j){
            String temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return ch;
    }

    public static void main(String[] args) {
        // Aapka diya gaya test case
        String s1 = "the sky is blue";
        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Output: \"" + reverseWords(s1) + "\"");
        System.out.println("---");

        // Ek aur test case extra spaces ke sath
        String s2 = "  hello world  ";
        System.out.println("Input: \"" + s2 + "\"");
        System.out.println("Output: \"" + reverseWords(s2) + "\"");
        System.out.println("---");

        // Test case multiple spaces ke sath
        String s3 = "a good   example";
        System.out.println("Input: \"" + s3 + "\"");
        System.out.println("Output: \"" + reverseWords(s3) + "\"");
    }
}