// 225. Implement Stack using Queues

//   Example 1:

// Input
// ["MyStack", "push", "push", "top", "pop", "empty"]
// [[], [1], [2], [], [], []]
// Output
// [null, null, null, 2, 2, false]

// Explanation
// MyStack myStack = new MyStack();
// myStack.push(1);
// myStack.push(2);
// myStack.top(); // return 2
// myStack.pop(); // return 2
// myStack.empty(); // return False

// solution

class MyStack {
    Queue<Integer> q = new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {

        q.offer(x);

        for(int i = 0; i < q.size() - 1; i += 1) {
            q.offer(q.poll());
        }
    }
    
    public int pop() {   
        return q.poll();    
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
