// Problem: Backspace String Compare
// Pattern: Two Pointers Simulation (String Building)

// Approach:
- Traverse the string from left to right
- Use a StringBuilder to simulate typing
- If the current character is not '#', append it
- If the character is '#', remove the last character from StringBuilder (if it exists)
- Repeat the same process for both strings s and t
- Compare the final processed strings using equals()

// Key Insight:
Instead of actually modifying the string, we simulate typing using StringBuilder where '#' acts as a backspace to remove the previous character.

// Time Complexity - 0(n)
// Space Complexity - 0(1)

  class Solution {
    public boolean backspaceCompare(String s, String t)  {
        return build(s).equals(build(t));
    }
    private String build(String str) {
        StringBuilder sb = new StringBuilder();
        
        for(char ch : str.toCharArray()){
        if (ch != '#') {
            sb.append(ch);
        } else {
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            } 
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String s = "ab#c";
        String t = "ad#c";
        
        boolean result = sol.backspaceCompare(s, t);
        
        System.out.println("Output: " + result);
    }
}
