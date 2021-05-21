package com.geeks_for_geeks.array.array_rotations;

/**
 * @author prateek.bangre on 13/03/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/find-element-given-index-number-rotations/
Input : arr[] : {1, 2, 3, 4, 5}
        ranges[] = { {0, 2}, {0, 3} }
        index : 1
Output : 3
Explanation : After first given rotation {0, 2}
                arr[] = {3, 1, 2, 4, 5}
              After second rotation {0, 3}
                arr[] = {4, 3, 1, 2, 5}
After all rotations we have element 3 at given
index 1.

Method : Efficient We can do offline processing after saving all ranges.
Suppose, our rotate ranges are : [0..2] and [0..3]
We run through these ranges from reverse.

After range [0..3], index 0 will have the element which was on index 3.
So, we can change 0 to 3, i.e. if index = left, index will be changed to right.
After range [0..2], index 3 will remain unaffected.

So, we can make 3 cases :
If index = left, index will be changed to right.
If index is not bounds by the range, no effect of rotation.
If index is in bounds, index will have the element at index-1.


*/
public class Find_Element_At_Given_Index_After_A_Number_Of_Rotations {

    private static int findElement(int[] arr, int[][] ranges, int rotations, int atIndex) {

        for (int i = rotations-1; i >= 0; i--) {

            // Range[left...right]
            int left = ranges[i][0];
            int right = ranges[i][1];

            //index is in bounds
            if (left <= atIndex && atIndex <= right){
                if (left == atIndex)
                    atIndex = right;
                else
                    atIndex--;
            }

        }
        return arr[atIndex];
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        // Ranges according to 0-based indexing
        int[][] ranges = { { 0, 2 }, { 0, 3 } };
        int rotations = ranges.length;
        int atIndex = 1;

        System.out.println(findElement(arr, ranges, rotations, atIndex));

    }
}
