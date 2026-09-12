class Solution {
    public String reverseWords(String s) {

        int l = 0;
        int r = s.length() - 1;


        while (l < s.length() - 1) {
            if (s.charAt(l) == ' ') {
                l++;
            }
            else {
                break;
            }
        }

        while (r >= 0) {
            if (s.charAt(r) == ' ') {
                r--;
            }
            else {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();

        while (l <= r) {

            if (s.charAt(l) != ' ') {
                sb.append(s.charAt(l));
                l++;
            }
            else {

                if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ') {
                    sb.append(' ');
                }

                l++;
            }
        }

        int i = 0;
        int j = sb.length() - 1;

        while (i < j) {

            char temp = sb.charAt(i);

            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }

        int start = 0;
        int end = 0;

        while (start < sb.length()) {

            while (end < sb.length() && sb.charAt(end) != ' ') {
                end++;
            }

            int p1 = start;
            int p2 = end - 1;

            while (p1 < p2) {

                char temp = sb.charAt(p1);

                sb.setCharAt(p1, sb.charAt(p2));
                sb.setCharAt(p2, temp);

                p1++;
                p2--;       
            }

            start = end + 1;
            end = start;
        }

        return sb.toString();
    }
}