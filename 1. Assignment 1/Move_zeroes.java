/*
 Q7. Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.
     Note that you must do this in-place without making a copy of the array.

     Example 1: Input: nums = [0,1,0,3,12]
                Output: [1,3,12,0,0].
 */
public class Move_zeroes {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        while(j<nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,12};
        Move_zeroes zero = new Move_zeroes();
        zero.moveZeroes(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}