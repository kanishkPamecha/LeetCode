class MyStack {

         int top =-1 ;
        int [] arr = new int[101];
    public MyStack() {
    }
    
    public void push(int x) {
        if(top==99)return ;
        arr[++top]=x;
    }
    
    public int pop() {
        if(top==-1) return -1;
        return arr[top--];
    }
    
    public int top() {
         if(top==-1) return -1;
        return arr[top];
    }
    
    public boolean empty() {
        if(top!=-1) {return false;}
        return true;
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