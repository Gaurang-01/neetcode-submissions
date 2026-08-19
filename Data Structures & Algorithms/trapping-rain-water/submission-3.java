class Solution {
    public int trap(int[] height) {
        int leftMax = height[0], rightMax = height[height.length-1];
        int left = 1, right = height.length-2;
        int total = 0;
        while(left<=right){
            if(leftMax <= rightMax){
                if(height[left]<leftMax){
                    total += leftMax - height[left];
                }else{
                    leftMax = height[left];
                }
                left++;
            }else{
                if(height[right]<rightMax){
                    total += rightMax - height[right];
                }else{
                    rightMax = height[right];
                }
                right--;
            }
        }
        return total;
    }
}
