/*
 Q2. Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
     Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
     Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
     Return k.
       
     Example : Input: nums = [3,2,2,3], val = 3
               Output: 2, nums = [2,2,_*,_*]

     Explanation: Your function should return k = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned k (hence they are underscores).
 */

public class Remove_element {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
        int[] nums = new int[] {3, 2, 2, 3};
        int val = 3;
        Remove_element r = new Remove_element();

        int count = r.removeElement(nums, val);
        System.out.println(count);

        for(int i=0; i<count; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}