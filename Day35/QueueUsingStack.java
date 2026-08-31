package hundred_days_of_code.Day35;

import java.util.Stack;

class MyQueue {
    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {    
        first = new Stack<>();
        second = new Stack<>();
    
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        shiftStacks();
        return second.pop();
    }
    
    public int peek() {
        shiftStacks();
        return second.peek();
    }
    
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
    private void shiftStacks(){
        if(second.isEmpty()){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }
    }
}
