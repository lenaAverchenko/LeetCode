package addbinary;


public class AddBinary {
    public static void main(String[] args) {
        String str = "1010";
        String str2 = "1011";
        System.out.println(addBinary(str, str2));
        System.out.println(addBinary("1", "11"));
        System.out.println(addBinary("100000101010", "1101010000000000010"));

    }

    static public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        StringBuilder builder = new StringBuilder();
        while (i >= 0 && j >= 0) {
            if (a.charAt(i) == b.charAt(j)) {
                if (a.charAt(i) == '0') {
                    builder.append(sum);
                    sum = 0;
                } else if (a.charAt(i) == '1') {
                    if (sum == 0) {
                        builder.append(0);
                        sum = 1;
                    } else {
                        builder.append(1);
                        sum = 1;
                    }
                }
            } else {
                if (sum == 0) {
                    builder.append(1);
                } else {
                    builder.append(0);
                    sum = 1;
                }
            }
            i--;
            j--;
        }
        if (i >= 0) {
            while (i >= 0) {
                if (sum == 0) {
                    builder.append(a.charAt(i));
                } else {
                    if (a.charAt(i) == '0') {
                        builder.append(1);
                        sum = 0;
                    } else {
                        builder.append(0);
                    }
                }
                i--;
            }
        } else if (j >= 0) {
            while (j >= 0) {
                if (sum == 0) {
                    builder.append(b.charAt(j));
                } else {
                    if (b.charAt(j) == '0') {
                        builder.append(1);
                        sum = 0;
                    } else {
                        builder.append(0);
                    }
                }
                j--;
            }
        }
        if (sum != 0){
            builder.append(1);
        }
        return builder.reverse().toString();
    }


    static public String addBinaryAnother(String a, String b) {
        return Integer.toBinaryString(toDecimal(a) + toDecimal(b));
    }

    static public int toDecimal(String a) {
        char[] chars = a.toCharArray();
        int number = 0;
        int index = a.length() - 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                index--;
                continue;
            }
            number = (number + (int) (Math.pow(2, index)));
            index--;
        }
        return number;
    }


}
