import java.util.*;

class Solution {
    public String decodeString(String s) {

        Stack<Integer> numberstack = new Stack<>();
        Stack<String> stringstack = new Stack<>();

        int i = 0;
        int num = 0;
        String ans = "";

        while (i < s.length()) {

            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            }
            
            else if (ch == '[') {
                numberstack.push(num);
                stringstack.push(ans);

                num = 0;
                ans = "";
            }
            else if (ch == ']') {

                int count = numberstack.pop();
                String old = stringstack.pop();

                for (int j = 0; j < count; j++) {
                    old = old + ans;
                }

                ans = old;
            }

            else {
                ans = ans + ch;
            }

            i++;
        }

        return ans;
    }
}