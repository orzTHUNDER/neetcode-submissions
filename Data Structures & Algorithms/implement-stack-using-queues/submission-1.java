class MyStack {
    
     Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
       int cnt = q.size() -1;
       while(cnt-- != 0) {
        int x = q.poll();
        q.offer(x);
       }
       return q.poll();
    }
    
    public int top() {
       int cnt = q.size() - 1;
       while(cnt-- != 0) {
        int x = q.poll();
        q.offer(x);
       }
       int x = q.peek();
       int y = q.poll();
       q.offer(y);
       return x;

    }
    
    public boolean empty() {
        return q.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */