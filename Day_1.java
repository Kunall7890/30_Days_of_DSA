import java.util.HashSet;

// LeetCode Question: 217. Contains Duplicate
// Question: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


public class Day_1 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums)); // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2)); // Output: false
    }
}