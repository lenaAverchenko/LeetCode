package sortedarrayduplicates;

public class SortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 2, 2, 3, 4, 5, 5, 5, 5, 8, 8};
        int[] nums1 = {0, 0, 0, 0, 1, 2, 2, 3, 4, 5, 5, 5, 5, 6, 6, 7, 8, 8};
        int[] nums2 = {1, 1, 1, 1, 2, 2, 3, 4, 5, 5, 5, 5, 8, 8, 10, 77, 77};
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates(nums1));
        System.out.println(removeDuplicates(nums2));

    }

    static public int removeDuplicates(int[] nums) {
        int markerIndex = 1;
        for (int n:nums) {
            if (n!= nums[markerIndex-1]) {
                nums[markerIndex] = n;
                markerIndex++;
            }
        }
        return markerIndex;
    }
}

//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//
//Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//
//Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
//Return k.
