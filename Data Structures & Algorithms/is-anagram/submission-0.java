class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        int[] arr2 = new int[26];
        char[] arr3 = t.toCharArray();
        for(char c : arr1){
            int index = c -'a';
            arr2[index] += 1; 
        }
        for(char d : arr3){
            int index = d -'a';
            arr2[index] -= 1;
        }
        for(int i = 0;i<26;i++){
            if(arr2[i] != 0){
                return false;
            }
        }
        return true;
    }
}
