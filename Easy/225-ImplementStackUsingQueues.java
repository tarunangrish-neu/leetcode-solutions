package Easy;

class MyStack {
    Queue<Integer> q = new LinkedList<Integer>();
        public MyStack() {
            
        }
        
        public void push(int x) {
            int size = q.size();
            q.add(x);
            while(size-- > 0){
                q.add(q.remove());
            }
        }
        
        public int pop() {
            return q.remove();
        }
        
        public int top() {
            return q.peek();
        }
        
        public boolean empty() {
            return q.isEmpty();
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