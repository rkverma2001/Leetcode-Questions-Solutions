/*
 Q3. Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     You must write an algorithm with O(log n) runtime complexity.

     Example 1: Input: nums = [1,3,5,6], target = 5
                Output: 2.
 */
public class Search_insert_position {
    public int searchInsert(int[] nums, int target) {
        if(nums[0] == target) return 0;

        else if(nums[nums.length-1]==target) return nums.length-1;
        int i = 0;
        int j = nums.length - 1;
        int mid = 0;
        while(i < j) {

            mid = (i+j)/2;
            if(nums[mid] == target) {
                return mid;
            }

            else if (nums[mid] < target) {

                i++;
            }

            else {

                j--;
            }
        }

        if(nums[i] > target) {
            return i;
        }

        else {
            return i+1;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6}; 
        int target = 5;
        Search_insert_position p = new Search_insert_position();
        int pos = p.searchInsert(nums, target);
        System.out.println(pos);
    }
}
