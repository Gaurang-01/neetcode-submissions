class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {

                int popped = stack.pop();

                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = i - left - 1;

                int area = heights[popped] * width;

                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {

            int popped = stack.pop();

            int left = stack.isEmpty() ? -1 : stack.peek();
            int width = heights.length - left - 1;

            int area = heights[popped] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}