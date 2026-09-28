class Solution {
    public int maxDepth(String s) {

        Stack<Character> st = new Stack<>();
        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                st.push('(');

                maxDepth = Math.max(maxDepth, st.size());

            } else if (s.charAt(i) == ')') {

                st.pop();

            }
        }

        return maxDepth;
    }
}