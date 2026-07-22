import java.util.Arrays;
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
                k = k % n;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
public class RotateArr {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        obj.rotate(nums, k);
        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}