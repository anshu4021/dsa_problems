class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            while (low < high && !(arr[low] == 'a' || arr[low] == 'e' || arr[low] == 'i' ||
                                   arr[low] == 'o' || arr[low] == 'u' || arr[low] == 'A' ||
                                   arr[low] == 'E' || arr[low] == 'I' || arr[low] == 'O' ||
                                   arr[low] == 'U')) {
                low++;
            }

            while (low < high && !(arr[high] == 'a' || arr[high] == 'e' || arr[high] == 'i' ||
                                   arr[high] == 'o' || arr[high] == 'u' || arr[high] == 'A' ||
                                   arr[high] == 'E' || arr[high] == 'I' || arr[high] == 'O' ||
                                   arr[high] == 'U')) {
                high--;
            }

            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

        return new String(arr);
    }
}