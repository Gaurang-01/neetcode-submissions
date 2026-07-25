class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> map = new HashMap<>();
        for(String s: strs){
            StringBuilder sb = new StringBuilder();
            char[] arr1 = s.toCharArray();
            int[] count = new int[26];
            for(char c: arr1 ){
                int index = c -'a';
                count[index]+=1;
            }
            for(int i : count){
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());        
    }
}
