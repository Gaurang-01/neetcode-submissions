class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for(int i = 0;i<s.length();i++){
            HashSet<Character> chars = new HashSet<>();
            chars.add(s.charAt(i));
            int currentLength = 1;
            for(int j = i+1;j<s.length();j++){
                if(chars.contains(s.charAt(j))){
                    break;
                }else{
                    chars.add(s.charAt(j));
                    currentLength++;
                }
            }
            maxLength = Math.max(maxLength,currentLength);
        }
        return maxLength;
    }
}
