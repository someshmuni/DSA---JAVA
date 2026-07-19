import java.util.Arrays;

class Solution {

    public int RemoveDuplicateFromSortedArray(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = obj.RemoveDuplicateFromSortedArray(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        System.out.println("Complete array: " + Arrays.toString(nums));
    }
}