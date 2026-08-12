class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Saare numbers set me daal do
        for (int num : nums) {
            set.add(num);
        }

        int ans = 0;

        for (int num : set) {

            // Agar previous number nahi hai,
            // to num sequence ka starting point hai
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                // Consecutive numbers dhundo
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                ans = Math.max(ans, length);
            }
        }

        return ans;
    }
}