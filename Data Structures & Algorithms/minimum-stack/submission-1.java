class MinStack {

    public MinStack() {

    }
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> extra = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if(!extra.isEmpty()){
            if(val <= extra.peek()){
                extra.push(val);
            }
        }else{
            extra.push(val);
        }
    }
    
    public void pop() {
        if(stack.peek().equals(extra.peek())){
            stack.pop();
            extra.pop();
        }else{
            stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return extra.peek();
    }
}
