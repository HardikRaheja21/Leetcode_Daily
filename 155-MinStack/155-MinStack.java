// Last updated: 2/10/2026, 3:18:38 PM
class MinStack {

    Stack<Long> st;
    long mini;

    public MinStack() {
        st = new Stack();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            mini = val;
            st.add((long)val);
        }
        else if(val>mini){
            st.add((long)val);
        }
        else{
            st.add((long)2*val-mini);
            mini = val;
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        long x = st.pop();

        if(x<mini) 
        mini = 2*mini-x;
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        long x = st.peek();

        if(x>mini) return (int)x;
        else return (int)mini;
        
    }
    
    public int getMin() {
        return (int)mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */