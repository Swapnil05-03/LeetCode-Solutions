class MyQueue {
    Stack<Integer> st ;
    Stack<Integer> helper ;

    public MyQueue() {
        st = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);

        //or

        // while(st.size() > 0){
        //     helper.push(st.pop());
        // }
        // st.push(x);
        // while(helper.size() > 0){
        //     st.push(helper.pop());
        // }
    }
    
    public int pop() {
        // return st.pop();

        //or

        while(st.size() > 1){
            helper.push(st.pop());
        }
        int front = st.pop();
        while(helper.size() > 0){
            st.push(helper.pop());
        }
        return front;
    }
    
    public int peek() {
        // return st.peek();

        //or

        while(st.size() > 1){
            helper.push(st.pop());
        }
        int front = st.peek();
        while(helper.size() > 0){
            st.push(helper.pop());
        }
        return front;
    }
    
    public boolean empty() {
        return (st.size() == 0);
    }
}
