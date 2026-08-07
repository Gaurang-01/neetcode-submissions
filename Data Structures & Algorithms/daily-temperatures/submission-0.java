class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1;i<temperatures.length;i++){
            int current = temperatures[i];
            while(!stack.isEmpty() && current>temperatures[stack.peek()]){
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}
