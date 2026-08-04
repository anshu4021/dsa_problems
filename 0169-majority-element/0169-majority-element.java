class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            // Choose a new candidate if count becomes 0
            if (count == 0) {
                candidate = num;
            }

            // Same candidate -> increase vote
            if (num == candidate) {
                count++;
            } else {
                // Different element -> cancel one vote
                count--;
            }
        }

        return candidate;
    }
}