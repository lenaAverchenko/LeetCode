package longestcommonprefix;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] strs1 = {"dog", "racecar", "car"};
        String[] strs2 = {"af", "a"};
        String[] strs3 = {"afta", "aft", "af"};
        String[] strs4 = {"c","acc","ccc"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
        System.out.println(longestCommonPrefix(strs4));


    }

    static public String longestCommonPrefix(String[] strs) {
        String pattern = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].contains(pattern) || !strs[i].startsWith(pattern)) {
                if (strs[i].length() < pattern.length()) {
                    String temp = pattern;
                    pattern = strs[i];
                    strs[i] = temp;
                }
                for (int j = 0; j < strs[i].length(); j++) {
                    if (j < pattern.length()) {
                        if ((strs[i].charAt(j)) != pattern.charAt(j)) {
                            if (j == 0) {
                                return "";
                            }
                            pattern = pattern.substring(0, j);
                        }
                    }
                }
            }
        }
        return pattern;
    }

}

