class Solution {
    public String mergeAlternately(String s1, String s2) {
        StringBuilder str = new StringBuilder();

        int i = s1.length();
        int j = s2.length();
        int p = 0;

        // Add characters alternately
        while (p < i && p < j) {
            str.append(s1.charAt(p));
            str.append(s2.charAt(p));
            p++;
        }

        // Add remaining characters of s1
        while (p < i) {
            str.append(s1.charAt(p));
            p++;
        }

        // Add remaining characters of s2
        while (p < j) {
            str.append(s2.charAt(p));
            p++;
        }

        return str.toString();
    }
}