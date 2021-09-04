package com.algodaily.array;

/**
 * @author prateek.bangre on 16/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/fast-minimum-in-rotated-array/java
public class Fast_Minimum_In_Rotated_Array {

    private int getMinimum(int[] nums) {

        if (nums.length == 0){
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid = (low + high) / 2;
            if(nums[high] < nums[mid]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[high];
    }

    // remove or comment if running tests (we run our own main)
    public static void main(String[] args) {

        Fast_Minimum_In_Rotated_Array obj = new Fast_Minimum_In_Rotated_Array();
        System.out.println(obj.getMinimum(new int[] {6, 7, 8, 9, 10, 3, 4, 5}));
        System.out.println(obj.getMinimum(new int[] {6, 7, 8, 0, 1, 2, 3, 4, 5}));
        System.out.println(obj.getMinimum(new int[] {4, 5, 1, 2, 3}));
        System.out.println(obj.getMinimum(new int[] {5, 6, 7, 0, 1, 2, 3}));
    }
}
