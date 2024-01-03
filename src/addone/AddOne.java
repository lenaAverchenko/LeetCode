package addone;

import java.util.Arrays;

public class AddOne {
    public static void main(String[] args){
        int[] ints1 = {1,3,4,5};
        int[] ints2 = {};
        int[] ints3 = {9};
        int[] ints4 = {1,9,9,9};
        int[] ints5 = {9,9,9};

        System.out.println(Arrays.toString(plusOne(ints1)));
        System.out.println(Arrays.toString(plusOne(ints2)));
        System.out.println(Arrays.toString(plusOne(ints3)));
        System.out.println(Arrays.toString(plusOne(ints4)));
        System.out.println(Arrays.toString(plusOne(ints5)));
    }

    static public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9){
                digits[i] = digits[i] +1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}
