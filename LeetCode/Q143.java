package LeetCode;

import java.util.Arrays;

public class Q143 {

        public static int compress(char[] chars) {
            int index = 0; // Likhne (write) ke liye pointer
            int i = 0;     // Padhne (read) ke liye pointer

            while (i < chars.length) {
                char currentChar = chars[i];
                int count = 0;

                // Step 1: Jab tak same character mil raha hai, count badhate jao
                while (i < chars.length && chars[i] == currentChar) {
                    count++;
                    i++;
                }

                // Step 2: Pehle us character ko likh do
                chars[index] = currentChar;
                index++;

                // Step 3: Agar count 1 se zyada hai, toh uski ginti (count) likho
                if (count > 1) {
                    // Count ko string banakar ek-ek digit ko array mein daalo (jaise 12 hai toh '1' aur '2')
                    String countStr = String.valueOf(count);
                    for (char c : countStr.toCharArray()) {
                        chars[index] = c;
                        index++;
                    }
                }
            }

            // Return the new length of the array
            return index;
        }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        Q143.compress (chars);
        for (int i=0; i<chars.length-1;i++){
            System.out.print(chars[i]);
        }


    }
}
