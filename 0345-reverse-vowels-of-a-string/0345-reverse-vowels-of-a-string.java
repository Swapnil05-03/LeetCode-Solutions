class Solution {
    public String reverseVowels(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                st.push(ch);
            }
        }
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if ("aeiouAEIOU".indexOf(arr[i]) != -1) {
                arr[i] = st.pop();
            }
        }

        return new String(arr);
    }
}