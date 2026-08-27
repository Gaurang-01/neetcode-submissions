class Solution {
    public int calcTime(int[] piles, int k) {
        int totalTime = 0;
        for (int i = 0; i < piles.length; i++) {
            int time = (piles[i] + k - 1) / k;
            totalTime += time;
        }
        return totalTime;
    }
    public int findMax(int[] piles){
        int max = piles[0];
        for(int i = 1;i<piles.length;i++){
            if(piles[i]> max){
                max = piles[i];
            }
        }
        return max;
    }
    public int helper(int[] piles,int max,int h){
        int left = 1;
        int right = max;
        int minTime = calcTime(piles,max);
        while(left <= right){
            int mid = left+(right-left)/2;
            int time = calcTime(piles,mid);
            if(time<=h){
                minTime = time;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
        
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = findMax(piles);
        int k = helper(piles,max,h);
        return k;
    }
}
