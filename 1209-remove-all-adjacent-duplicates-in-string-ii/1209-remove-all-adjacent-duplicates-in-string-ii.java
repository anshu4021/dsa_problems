class Solution {

    class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {

        Stack<Pair> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Same character as stack top
            if (!stack.isEmpty() && stack.peek().ch == ch) {

                stack.peek().count++;

                // Remove when count becomes k
                if (stack.peek().count == k) {
                    stack.pop();
                }

            } 
            // Different character
            else {
                stack.push(new Pair(ch, 1));
            }
        }

        // Build answer
        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {

            Pair p = stack.pop();

            for (int i = 0; i < p.count; i++) {
                ans.append(p.ch);
            }
        }

        // Stack is popped from top, so reverse the result
        return ans.reverse().toString();
    }
}