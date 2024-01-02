package lengthoflastword;

public class LastWordLength {
    public static void main(String[] args) {
        String str1 = "dfs zfssdh sf ";
        String str2 = " ";
        String str3 = "";
        String str4 = "gdhdh";
        String str5 = "gdhdh dfsdgsd xfnhfgjfgjfg dfhd";
        System.out.println(lengthOfLastWord(str1));
        System.out.println(lengthOfLastWord(str2));
        System.out.println(lengthOfLastWord(str3));
        System.out.println(lengthOfLastWord(str4));
        System.out.println(lengthOfLastWord(str5));

        System.out.println(lengthOfLastWordAnother(str1));
        System.out.println(lengthOfLastWordAnother(str2));
        System.out.println(lengthOfLastWordAnother(str3));
        System.out.println(lengthOfLastWordAnother(str4));
        System.out.println(lengthOfLastWordAnother(str5));
    }

    static public int lengthOfLastWord(String s) {
        if (s.isBlank()){
            return 0;
        }
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }

    static public int lengthOfLastWordAnother(String s) {
        if (!s.isBlank()){
            char[] symbols = s.toCharArray();
            int counter = 0;
            for (int i = symbols.length-1; i >= 0; i--) {
                if (symbols[i] == ' '){
                    if (counter != 0) {
                        return counter;
                    }
                    continue;
                }
                counter++;
            }
            return counter;
        }
        return 0;
    }

    static public int lengthOfLastWordAnotherOne(String s) {
        if (s.isBlank()){
            return 0;
        }
        return (s.split(" "))[(s.split(" ")).length-1].length();
    }
}
