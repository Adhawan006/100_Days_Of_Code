package hundred_days_of_code.Day31;
import java.util.ArrayDeque;

class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int x=0; x<s.length(); x++){
            if(s.charAt(x) == '{' || s.charAt(x) == '[' || s.charAt(x) == '(' ){
                stack.push(s.charAt(x));
            }
            else if(s.charAt(x) == '}' || s.charAt(x) == ']' || s.charAt(x) == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.pop();
                    if((s.charAt(x) == '}' && top != '{') ||
                    (s.charAt(x) == ']' && top != '[') ||
                    (s.charAt(x) == ')' && top != '(')){
                        return false;
                    }
                }

            }
        }
        return stack.isEmpty();

        
    }
}