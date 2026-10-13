class MinStack {
        Stack<Integer> st;
        Stack<Integer> minstack;
    public MinStack() {
        st=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int value) {
            st.push(value);
            if(minstack.size()==0 || value<=minstack.peek()){
                minstack.push(value);
            }
    }
    
    public void pop() {
        if(st.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        int val=st.pop();
        if(val==minstack.peek()){
            minstack.pop();
        }
       
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minstack.peek();
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