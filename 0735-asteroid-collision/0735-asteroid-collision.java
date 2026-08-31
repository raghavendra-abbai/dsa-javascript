import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] nums) {

        List<Integer> st = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            while (!st.isEmpty() &&
                   st.get(st.size() - 1) > 0 &&
                   nums[i] < 0 &&
                   st.get(st.size() - 1) < Math.abs(nums[i])) {

                st.remove(st.size() - 1);
            }

            if (!st.isEmpty() &&
                nums[i] < 0 &&
                st.get(st.size() - 1) == Math.abs(nums[i])) {

                st.remove(st.size() - 1);
            }
            else if (st.isEmpty() ||
                     st.get(st.size() - 1) < 0 ||
                     nums[i] > 0) {

                st.add(nums[i]);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }

        return ans;
    }
}