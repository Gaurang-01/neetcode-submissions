class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxfreq = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            Character c = s.charAt(right);

            map.put(c, map.getOrDefault(c, 0) + 1);

            maxfreq = Math.max(maxfreq, map.get(c));

            int currentK = (right - left + 1) - maxfreq;

            if(currentK>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
