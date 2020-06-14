public class Solution003 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> res = new HashSet<Character>();
            int rk = -1,ans = 0;
            for (int i = 0; i<s.length(); i++) {
                if (i!=0) {
                    res.remove(s.charAt(i-1));
                }
                while((rk+1)<s.length() && !res.contains(s.charAt(rk+1))){
                    res.add(s.charAt(rk+1));
                    rk++;
                }
                ans = Math.max(ans, rk-i+1);
            }
            return ans;
        }
    }
}
