class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> uniqueNum = new HashSet<>();
        boolean isDuplicate=false;
        for(int i=0;i<nums.length;i++){
            if(uniqueNum.contains(nums[i])){
                isDuplicate=true;
                return nums[i];
            }else{
                if(!isDuplicate){
                    uniqueNum.add(nums[i]);
                }
            }
        }
        return -1;
    }
}