package mergearray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {1,2,4,6,9,11,0,0,0,0};
        int[] nums2 = {3,5,8,15};
        merge(nums1,10,nums2,4);
        System.out.println(Arrays.toString(nums1));

    }
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int currentIdx = m+n-1;
        while(index2>=0) {
            if (index1 >= 0) {
                if (nums1[index1] >= nums2[index2]) {
                    nums1[currentIdx] = nums1[index1];
                    currentIdx--;
                    index1--;
                } else {
                    nums1[currentIdx] = nums2[index2];
                    currentIdx--;
                    index2--;
                }
            } else{
                nums1[currentIdx] = nums2[index2];
                currentIdx --;
                index2 --;
            }
        }
    }

    static public void mergeAnother(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        for (int i = m+n-1; i >= 0; i--) {
            if (index1 < 0){
                nums1[i] = nums2[index2];
                index2--;
            }
            if (index2 < 0 && index1>=0){
                nums1[i] = nums1[index1];
                index1--;
            }
            if (index1 >= 0 && index2 >= 0){
                if (nums1[index1] >= nums2[index2]){
                    nums1[i] = nums1[index1];
                    index1--;
                } else {
                    nums1[i] = nums2[index2];
                    index2--;
                }
            }
        }
    }


}
