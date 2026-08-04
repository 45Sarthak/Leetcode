class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;

  

    public MinStack() {
      stack=new Stack<>();
      minstack=new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);

        if(minstack.isEmpty() || value<=minstack.peek()){
            minstack.push(value);
        }
        
    }
    
    public void pop() {
        int ele=stack.pop();

        if(ele == minstack.peek()){
            minstack.pop();
        }        
    }
    
    public int top() {
        int top=stack.peek();
        return top;
    }
    
    public int getMin() {
        int min=minstack.peek();
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */