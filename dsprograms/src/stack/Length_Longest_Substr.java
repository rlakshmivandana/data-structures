package stack;

import java.util.Stack;

public class Length_Longest_Substr {

	public static void main(String[] args) {
		 String str = "(())";
		 int subStrCount = getValidSubStrCount(str);
		 System.out.println("getValidSubStrCount"+subStrCount);
		

	}

	private static int getValidSubStrCount(String str) {

		int result = 0;
		int n = str.length();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(-1);
		for (int i = 0; i < n; i++) {
			if(str.charAt(i) == '('){
				stack.push(i);	
			}else{
			// Pop the previous
            // opening bracket's index
            if(!stack.empty())
            	stack.pop();

            // Check if this length
            // formed with base of
            // current valid substring
            // is more than max
            // so far
            if (!stack.empty())
            	
            	
                result
                    = Math.max(result,
                               i - stack.peek());

            // If stack is empty. push
            // current index as base
            // for next valid substring (if any)
            else
            	stack.push(i);
		}}
		return result;
	}

}
