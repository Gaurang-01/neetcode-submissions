

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        int[] result = new int[k];
        for(int i = 0;i<nums.length;i++){
            int key = nums[i];
            if(map.containsKey(key)){
                map.put(key, map.get(key) + 1);
            }else{
                map.put(key,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();
            int freq = entry.getValue();

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        } 
        int idx = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {

            if (bucket[i] == null) continue;
         
            for (int num : bucket[i]) {
                    result[idx] = num;
                    idx++;
                    
                    if(idx == k){
                        return result;
                    }
                }
            }  
        return result;
    }
}
