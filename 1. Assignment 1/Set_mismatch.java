/*
 Q8. You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
     You are given an integer array nums representing the data status of this set after the error.
     Find the number that occurs twice and the number that is missing and return them in the form of an array.

     Example 1: Input: nums = [1,2,2,4]
                Output: [2,3].
 */
public class Set_mismatch {
    
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++) {
            int curr = Math.abs(nums[i]) - 1;
            if(nums[curr] < 0) {
                arr[0] = curr + 1;
            }

            else {
                nums[curr] = nums[curr] * -1;
            }

        }
            for(int i=0; i<nums.length; i++) {
                if(nums[i] > 0) {
                    arr[1] = i + 1;
                }
            }

            return arr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,4};

        Set_mismatch mismatch = new Set_mismatch();
        int arr[] = mismatch.findErrorNums(nums);

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
