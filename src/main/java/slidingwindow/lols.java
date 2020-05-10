package slidingwindow;

import java.util.HashMap;

public class lols {

    /**
     * 3 无重复字符的最长子串
     *
     * @param s 字符串
     * @return 最长子串
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> tem = new HashMap<>();
        int left = 0;
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (tem.containsKey(s.charAt(i))) {
                left = Math.max(left, tem.get(s.charAt(i)) + 1);
            }
            tem.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    /**
     * 最小覆盖字串
     * 给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字母的最小子串。
     *
     * @return
     */
    public String minWindow(String s, String t) {
        return "";
    }
}
