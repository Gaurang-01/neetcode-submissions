class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        int[] need = new int[128];
        int[] have = new int[128];

        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0, count = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            have[c]++;

            if (have[c] <= need[c]) {
                count++;
            }

            // Window is valid
            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char remove = s.charAt(left);
                have[remove]--;

                if (have[remove] < need[remove]) {
                    count--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}