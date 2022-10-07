class MyQueue {

    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        
        int ele = s2.pop();
        
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        return ele;
    }
    
    public int peek() {
        int peek = -1;
        while(!s1.isEmpty())
        {
            peek = s1.pop();
            s2.push(peek);
        }
         while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        return peek;
    }
    
    public boolean empty() {
        if(!s1.isEmpty())
            return false;
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */