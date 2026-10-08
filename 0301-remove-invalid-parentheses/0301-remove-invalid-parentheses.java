class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> removeInvalidParentheses(String s) {

        int left = 0;
        int right = 0;

        // Find minimum invalid '(' and ')'
        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                left++;
            } 
            else if (ch == ')') {

                if (left > 0) {
                    left--;
                } 
                else {
                    right++;
                }
            }
        }

        dfs(s, 0, left, right, 0, new StringBuilder());

        return ans;
    }

    void dfs(String s, int index, int leftRemove,
             int rightRemove, int balance, StringBuilder current) {

        // Invalid
        if (balance < 0) {
            return;
        }

        // End of string
        if (index == s.length()) {

            if (leftRemove == 0 &&
                rightRemove == 0 &&
                balance == 0) {

                String result = current.toString();

                if (!ans.contains(result)) {
                    ans.add(result);
                }
            }

            return;
        }

        char ch = s.charAt(index);

        // If '('
        if (ch == '(') {

            // Remove it
            if (leftRemove > 0) {
                dfs(s, index + 1,
                    leftRemove - 1,
                    rightRemove,
                    balance,
                    current);
            }

            // Keep it
            current.append(ch);

            dfs(s, index + 1,
                leftRemove,
                rightRemove,
                balance + 1,
                current);

            current.deleteCharAt(current.length() - 1);
        }

        // If ')'
        else if (ch == ')') {

            // Remove it
            if (rightRemove > 0) {
                dfs(s, index + 1,
                    leftRemove,
                    rightRemove - 1,
                    balance,
                    current);
            }

            // Keep it
            if (balance > 0) {

                current.append(ch);

                dfs(s, index + 1,
                    leftRemove,
                    rightRemove,
                    balance - 1,
                    current);

                current.deleteCharAt(current.length() - 1);
            }
        }

        // Normal character
        else {

            current.append(ch);

            dfs(s, index + 1,
                leftRemove,
                rightRemove,
                balance,
                current);

            current.deleteCharAt(current.length() - 1);
        }
    }
}