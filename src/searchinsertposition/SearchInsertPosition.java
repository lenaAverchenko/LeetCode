package searchinsertposition;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] ints1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //4
        int[] ints2 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //4
        int[] ints3 = {1, 2, 3, 4, 6, 7, 8, 9, 10}; //4
        int[] ints4 = {1, 2, 3, 4, 6, 7, 8, 9}; //4
        int[] ints5 = {1, 2, 3, 7, 8, 9, 10}; //3
        int[] ints6 = {1, 2, 6, 7, 8, 9}; //2
        int[] ints7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //8
        int[] ints8 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //8
        int[] ints9 = {1, 2, 3, 4, 6, 7, 8, 10}; //7
        int[] ints10 = {1, 2, 3, 4, 6, 7, 8}; //7
        int[] ints11 = {1, 2, 3, 7, 10}; //4
        int[] ints12 = {1, 2, 6, 7}; //4
        int[] ints13 = {5};
        int[] ints14 = {5, 7};

        int target = 5;
        int target2 = 9;
        int target3 = 0;
        int target4 = 5;
        System.out.println(searchInsert(ints1, target));
        System.out.println(searchInsert(ints2, target));
        System.out.println(searchInsert(ints3, target));
        System.out.println(searchInsert(ints4, target));
        System.out.println(searchInsert(ints5, target));
        System.out.println(searchInsert(ints6, target));
        System.out.println(searchInsert(ints7, target2));
        System.out.println(searchInsert(ints8, target2));
        System.out.println(searchInsert(ints9, target2));
        System.out.println(searchInsert(ints10, target2));
        System.out.println(searchInsert(ints11, target2));
        System.out.println(searchInsert(ints12, target2));
        System.out.println(searchInsert(ints12, target3));
        System.out.println(searchInsert(ints13, 5));
        System.out.println(searchInsert(ints13, 1));
        System.out.println(searchInsert(ints13, 10));
        System.out.println(searchInsert(ints14, 5));
        System.out.println(searchInsert(ints14, 7));
        System.out.println(searchInsert(ints14, 10));
        System.out.println(searchInsert(ints14, 6));
        System.out.println(searchInsert(ints14, 2));
    }

    static public int searchInsert(int[] nums, int target) {
        return divideAndSearch(nums, 0, nums.length, target);
    }

    static public int divideAndSearch(int[] nums, int startIdx, int endIdx, int target) {
        if (target < nums[0]) {
            return 0;
        }
        if (nums.length > 1) {
            while ((endIdx - startIdx) > 1) {
                int middleIndex = ((endIdx - startIdx) / 2) + startIdx;
                if (target == nums[middleIndex]) {
                    return middleIndex;
                } else if (target < nums[middleIndex]) {
                    endIdx = middleIndex;
                    divideAndSearch(nums, startIdx, endIdx, target);
                } else {
                    startIdx = middleIndex;
                    divideAndSearch(nums, startIdx, endIdx, target);
                }
                if ((endIdx - startIdx) <= 1) {
                    if (target == nums[startIdx]) {
                        return startIdx;
                    }
                    return startIdx + 1;
                }
            }
        } else if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            if (target > nums[0]) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
