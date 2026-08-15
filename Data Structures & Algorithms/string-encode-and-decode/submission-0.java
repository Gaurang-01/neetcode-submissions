class Solution {
    public String encode(List<String> strs) {
        String res = "";
        for (String str : strs) {
            res += str.length() + "#" + str;
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            // find '#'
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            // get length
            int length = Integer.parseInt(str.substring(i, j));

            // move past '#'
            j++;

            // get actual string
            String word = str.substring(j, j + length);

            result.add(word);

            // move i to next encoded string
            i = j + length;
        }

        return result;
    }
}
