package stack;

import java.util.Collections;
import java.util.Stack;

public class String_Repeat_Char {

	public static void main(String[] args) {
		String s = "2[ab]2[c]";
		Stack<String> stack = new Stack<String>();
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				stack.push(String.valueOf(s.charAt(i)));
			} else if (s.charAt(i) == '[') {
				stack.push(String.valueOf(s.charAt(i)));
			} else if (s.charAt(i) == ']') {
				String temp = null;
				if(!stack.peek().equals("[")){
					temp  = stack.pop();
					stack.pop();
					boolean isNumeric = stack.peek().chars().allMatch(Character::isDigit);
					if (isNumeric) {
						res = res + String.join("", Collections.nCopies(Integer.parseInt(stack.pop()), temp));
					} else {
						res = res + stack.pop();
					}
				}
				
			} else {
				if (stack.size() > 0 && !stack.peek().equals("[")) {
					stack.push(stack.pop().concat(String.valueOf(s.charAt(i))));
				}else{
					stack.push(String.valueOf(s.charAt(i)));
				}
			}

		}
		System.out.println(res);

	}

}
