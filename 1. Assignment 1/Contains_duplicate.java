/*
 Q6. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

     Example 1: Input: nums = [1,2,3,1]
                Output: true.
 */
import java.util.HashSet;

public class Contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1};
        Contains_duplicate duplicate = new Contains_duplicate();
        System.out.println(duplicate.containsDuplicate(arr));
    }
}
