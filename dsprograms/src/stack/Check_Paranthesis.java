package stack;

import java.util.Stack;

public class Check_Paranthesis {

	public static void main(String[] args) {

		String str = "[a+(c*d)}]";
		boolean res = checkParanthesis(str);
		System.out.println(res);		
	}

	private static boolean checkParanthesis(String str) {
		char[] expr;
		Stack<Character> stack = new Stack<Character>();
		expr = str.toCharArray();
		char x;
		for (int i = 0; i < expr.length; i++) {
			if(expr[i] =='(' ||expr[i] =='['||expr[i] =='{' ){
				stack.push(expr[i]);
			}
			if(stack.empty()) return false;
			switch(expr[i]){
			case ')':{
				x = stack.peek();
				stack.pop();
				if(x != '('){
					return false;
				}
				break;
			}
			case '}':{
				x = stack.peek();
				stack.pop();
				if(x != '{'){
					return false;
				}
				break;			
			}
			case ']':{
				x = stack.peek();
				stack.pop();
				if(x != '['){
					return false;
				}
				break;
			}
			}
			
		}
         return stack.empty()?true:false;
	}
	

}
