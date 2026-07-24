class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> num = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++){
            if(num.contains(nums[i])){
                return true;
            }
            else{
                num.add(nums[i]);
            }
        }
        return false;
    }
}