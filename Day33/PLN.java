package hundred_days_of_code.Day33;

import java.util.Stack;

class Solution {
    private Stack<Integer> stack;

    public Solution() {
        stack = new Stack<Integer>();
    }

    public int evalRPN(String[] tokens) {
        
        for (int x = 0; x < tokens.length; x++) {
            
            if (tokens[x].equals("+")) {
                stack.push(stack.pop() + stack.pop());
                
            } else if (tokens[x].equals("-")) {
                int val2 = stack.pop();
                int val1 = stack.pop();
                stack.push(val1 - val2);
                
            } else if (tokens[x].equals("*")) {
                stack.push(stack.pop() * stack.pop());
                
            } else if (tokens[x].equals("/")) {
                int val2 = stack.pop();
                int val1 = stack.pop();
                stack.push(val1 / val2);
                
            } else {
                stack.push(Integer.parseInt(tokens[x]));
            }
        }
 
        return stack.pop();
    }
}
