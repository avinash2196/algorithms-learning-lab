package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * Two Sum — LeetCode #1 (Easy)
 * <p>
 * Given an array of integers and a target value, return the indices of the two numbers
 * that add up to the target.
 * <p>
 * Original Problem: https://leetcode.com/problems/two-sum/
 *
 */
public class TwoSum {

    public int[] twoSum_BruteForce(int[] nums, int target) {
        //Clarifying Questions:
        // - Can the array be empty
        // - Can the array be null
        // - Are negative numbers allowed
        // - Are duplicates allowed
        //Brute Force Approach : Check all possible pairs
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                //If the pair sums to target, return their indices
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        //return for sake for code compliance
        return new int[]{-1, -1};
    }


    // Time complexity : O(n^2) as two loops
    // Space complexity: O(1) as no additional space is required

    // ------------------------------------------------------------------------------------------//

    public int[] twoSum_Map(int[] nums, int target) {
        //Clarifying Questions :
        // - Is empty list allowed?
        // - Is null list allowed?
        // - Are duplicates Allowed?
        // - Can there be negative numbers?

        //Optimized approach using hashmap in single pass

        //HashMap to store number and index
        Map<Integer, Integer> numIndex = new HashMap<>();
        //iterate and keep on checking if target-num exists in map , if yes return else keep
        //on building map
        for (int index = 0; index < nums.length; index++) {
            int complement = target - nums[index];
            // If complement exists, we found the pair
            if (numIndex.containsKey(complement)) {
                return new int[]{index, numIndex.get(complement)};
            }
            // Otherwise store the current number and its index
            numIndex.put(nums[index], index);
        }
        //should not reach here if atleast one solution exists
        return new int[]{-1, -1};
    }
    //Time Complexity : O(n) --single pass
    //Space Complexity : O(n) --Map

//------------------------------------------------------------------------------------------//

    public int[] twoSum_Binary(int[] nums, int target) {
        //Clarifying Questions :
        // - Is empty list allowed?
        // - Is null list allowed?
        // - Are duplicates Allowed?
        // - Can there be negative numbers?
        // - Is the input already sorted?

        //Optimized approach using binary search ( better if input is already sorted)
        //create a copy to keep track of original index
        int[][] arr = new int[nums.length][2];
        for (int index = 0; index < nums.length; index++) {
            arr[index][0] = nums[index];
            arr[index][1] = index;
        }
        //Sort array to prepare for binary search
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        //Find first element and then find complement using binary search
        for (int index = 0; index < arr.length - 1; index++) {
            int complement = target - arr[index][0];
            //if number is found , return ,else keep on moving towards the number
            //Iterate over the array from left to right and keep on shrinking it
            int left = index + 1;
            int right = arr.length - 1;
            while (left <= right) {//need to check for equality to include the last element
                int mid = left + (right - left) / 2;
                if (complement == arr[mid][0]) return new int[]{arr[index][1], arr[mid][1]};
                else if (complement < arr[mid][0]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        //should not reach here if atleast one solution exists
        return new int[]{-1, -1};
    }
}

//Time Complexity : O(nlogn) --nlogn for quick sort
//Space Complexity : O(n) --Array
}