package twosum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] testingArray = {-3, 13, 3, 4};
        int testingTarget = 0;
        int[] ints = twoSum(testingArray, testingTarget);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] copiedArray = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(nums);
        int tempSum = nums[0] - 1;
        int tempFirstIndex = 0;
        int tempSecondIndex = 0;
        int numberOne = 0;
        int numberTwo = 0;
        while (tempSum != target && tempFirstIndex < nums.length) {
            for (int i = nums.length - 1; i > 0; i--) {
                numberOne = nums[tempFirstIndex];
                numberTwo = nums[tempSecondIndex + i];
                tempSum = numberOne + numberTwo;
                if (tempSum == target) {
                    break;
                }
                if (tempSum < target) {
                    tempFirstIndex += 1;
                    tempSecondIndex = i - (nums.length - 1);
                    break;
                }
            }
        }
        if (tempSum != target) {
            System.out.println("There is no such sum");
            return new int[2];
        }
        int[] result = new int[2];
        int counter = 0;
        for (int i = 0; i < copiedArray.length; i++) {
            if (copiedArray[i] == numberOne || copiedArray[i] == numberTwo) {
                result[counter] = i;
                counter++;
            }
            if (counter == 2) {
                return result;
            }
        }
        return result;
    }
//            Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//                You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]
//
//
//        Constraints:
//
//        2 <= nums.length <= 104
//                -109 <= nums[i] <= 109
//                -109 <= target <= 109
//        Only one valid answer exists.
}
