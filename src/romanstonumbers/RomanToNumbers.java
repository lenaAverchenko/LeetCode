package romanstonumbers;

public class RomanToNumbers {
    public static void main(String[] args) {
        String s = "XX";
        String l = "MCMXCIV";
        String q = "IV";
        String f = "LVIII";
        System.out.println(romanToInt(s));
        System.out.println(romanToInt(l));
        System.out.println(romanToInt(f));
        System.out.println(romanToInt(q));

    }

    static public int romanToInt(String s) {
        char[] romans = s.toCharArray();
        int temporaryResult = 0;
        int resultedNumber = 0;
        int currentNumber = 0;
        int nextNumber = 0;
        for (int j = 0; j < romans.length; j++) {
            if (j < romans.length - 1) {
                currentNumber = defineRoman(romans[j]);
                nextNumber = defineRoman(romans[j + 1]);
                if (currentNumber >= nextNumber) {
                    resultedNumber = resultedNumber + currentNumber + temporaryResult;
                    temporaryResult = 0;
                } else {
                    temporaryResult = -currentNumber;
                }
            } else {
                currentNumber = defineRoman(romans[j]);
                resultedNumber = resultedNumber + currentNumber + temporaryResult;
                temporaryResult = 0;
            }
        }
        return resultedNumber;
    }

    static public int defineRoman(char roman) {
        return switch (roman) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }

}
