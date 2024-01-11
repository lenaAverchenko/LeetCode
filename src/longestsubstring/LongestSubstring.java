package longestsubstring;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {
//        String s = "qwertyasdfgqwqwryyujgjqwertyuiop[]";
//        String s = "dvdf";
//        String s = "anviajklmnbauio";
//        String s = " ";
        String s = "bbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int pointerIndex = 0;
        int indexIndicator = 0;
        List<Character> subCharacters = new ArrayList<>();
        char[] chars = s.toCharArray();
        if (chars.length == 1) {
            return 1;
        }
        while (pointerIndex < chars.length - 1) {
            indexIndicator = pointerIndex;
            for (int i = pointerIndex; i < chars.length; i++) {
                if (subCharacters.contains(chars[i])) {
                    if (subCharacters.size() > length) {
                        length = subCharacters.size();
                    }
                    if (subCharacters.size() == 1) {
                        pointerIndex = i;
                        break;
                    }
                    pointerIndex = indexIndicator + subCharacters.indexOf(chars[i]) + 1;
                    break;
                }
                subCharacters.add(chars[i]);
                pointerIndex = i;
            }
            if (pointerIndex < chars.length - 1) {
                subCharacters.clear();
            } else {
                if (subCharacters.size() > length) {
                    return subCharacters.size();
                }
            }
        }
        return length;
    }
}


//Given a string s, find the length of the longest
//substring
// without repeating characters.
//
//
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//Constraints:
//
//0 <= s.length <= 5 * 104
//s consists of English letters, digits, symbols and spaces.
