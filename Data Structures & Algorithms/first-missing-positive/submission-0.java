class Solution {
    public int firstMissingPositive(int[] nums) {
        int counter = 1;
        HashSet<Integer> hash = new HashSet<>();

        for (int num : nums) {
            hash.add(num);
        }

        while (true) {
            if (!hash.contains(counter)) {
                return counter;
            }
            counter++;
        }
    }
}