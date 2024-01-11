package firstoccurrence;

import java.util.Arrays;

public class FirstOccurrence {
    public static void main(String[] args) {
        String str1 = "baroinskbar";
        String str2 = "oinskbarhgf";
        String str3 = "jhbzdhboinskcdjr";
        String str4 = "aaa";
        String str5 = "mississippi";
        String str6 = "babba";
        String needle = "bar";
        String needle1 = "aaaa";
        String needle2 = "issipi";
        String needle3 = "bbb";
        System.out.println(strStr(str1, needle));
        System.out.println(strStr(str2, needle));
        System.out.println(strStr(str3, needle));
        System.out.println(strStr(str4, needle1));
        System.out.println(strStr(str5, needle2));
        System.out.println(strStr(str6, needle3));
        System.out.println(strStrAnother(str1, needle));
        System.out.println(strStrAnother(str2, needle));
        System.out.println(strStrAnother(str3, needle));
        System.out.println(strStrAnother(str4, needle1));
        System.out.println(strStrAnother(str5, needle2));
        System.out.println(strStrAnother(str6, needle3));
    }

    static public int strStr(String haystack, String needle) {
        char[] haystackLetters = haystack.toCharArray();
        char[] needleLetters = needle.toCharArray();
        int result = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystackLetters[i] == needleLetters[0]) {
                if (needleLetters.length > (haystack.length() - i)) {
                    return -1;
                }
                for (int j = 0; j < needleLetters.length; j++) {
                    if (needleLetters[j] == haystackLetters[i + j]) {
                        result++;
                    } else {
                        result = 0;
                    }
                    if (result == needleLetters.length) {
                        return i;
                    }
                }
            }
            result = 0;
        }
        return -1;
    }

    static public int strStrAnother(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
