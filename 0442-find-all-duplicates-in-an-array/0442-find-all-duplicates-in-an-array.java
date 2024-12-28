class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>(); 
        for (int i = 0; i < nums.length; i++) 
        { int index = Math.abs(nums[i]) - 1; 
        // Use the value as the index (1-based to 0-based) 
        if (nums[index] < 0) { duplicates.add(index + 1); // Found a duplicate
         } else
          { nums[index] = -nums[index]; // Mark as visited
           } } return duplicates;
    }
}