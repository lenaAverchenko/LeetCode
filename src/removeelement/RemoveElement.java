package removeelement;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arrayOfNums = {1, 5, 7, 8, 9, 1, 5, 4, 6, 7, 8, 2};
        int val = 5;
        int[] arrayOfNums1 = {3,2,2,3};
        int val1 = 3;
        System.out.println(removeElement(arrayOfNums, val));
        System.out.println(removeElement(arrayOfNums1, val1));
    }

    static public int removeElement(int[] nums, int val) {
        int resultedNumber = 0;
        for (int n : nums) {
            if (n != val){
                nums[resultedNumber] = n;
                resultedNumber ++;
            }
        }
        return resultedNumber;
    }
}
//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//
//Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//
//Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//Return k.
