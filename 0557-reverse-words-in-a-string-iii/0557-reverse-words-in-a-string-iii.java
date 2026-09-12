class Solution {
    public String reverseWords(String s) {

        char[] arr = s.toCharArray();

        int i = 0;
        int j = 0;

        while (i < arr.length) {

            while (j < arr.length && arr[j] != ' ') {
                j++;
            }

            int p1 = i;
            int p2 = j - 1;

            while (p1 < p2) {
                char temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;

                p1++;
                p2--;
            }

         
            j++;
            i = j;
        }

        return new String(arr);
    }
}