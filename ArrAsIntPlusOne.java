import java.util.Arrays;
class Solution {
    public int[] plusOne(int[] digits) {
        // Traverse the array from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // If digit is less than 9, simply increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, make it 0 and continue
            digits[i] = 0;
        }
        // If all digits were 9, create a new array
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
public class ArrAsIntPlusOne {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] digits = {1, 2, 3};
        int[] answer = obj.plusOne(digits);
        System.out.println("Result: " + Arrays.toString(answer));
    }
}