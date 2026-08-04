class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productFromStart = new int[nums.length];
        int[] productFromEnd = new int[nums.length];
        int[] result = new int[nums.length];
        productFromStart[0] = 1;
        productFromEnd[nums.length - 1] = 1;
        for(int i = 1;i<nums.length;i++){
            productFromStart[i] = productFromStart[i - 1] * nums[i - 1];
        }        
        for(int i = nums.length-2;i>=0;i--){
            productFromEnd[i] = productFromEnd[i + 1] * nums[i + 1];
        }
        for(int i = 0;i<nums.length;i++){
            result[i] = productFromStart[i] * productFromEnd[i];
        }
            return result;
        }
        
    }

