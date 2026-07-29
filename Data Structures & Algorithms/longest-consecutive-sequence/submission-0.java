
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int currcount = 1 ;
        int longest = 1;
        int lastsmaller = nums[0];
        for(int i = 1 ; i<nums.length;i++){
            if(nums[i] - 1  == lastsmaller){
                currcount += 1;
                lastsmaller = nums[i];
            }
            else if(nums[i] != lastsmaller){
                currcount = 1;
                lastsmaller = nums[i];
            }
            longest = Math.max(longest,currcount);
            
        }
        return longest;
    }
}