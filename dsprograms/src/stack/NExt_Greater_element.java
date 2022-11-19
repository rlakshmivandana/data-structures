package stack;

import java.util.Stack;

public class NExt_Greater_element {

	public static void main(String[] args) {
		int arr[] = { 8, 7, 5, 2, 9, 3, 10 };
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (stack.empty()) {
				stack.push(arr[i]);
				continue;
			}
			while(!stack.empty() && stack.peek() <arr[i]){
				System.out.println(stack.peek() + " " + arr[i]);

				stack.pop();
			}
			stack.push(arr[i]);
		}
		while(!stack.empty()){
			System.out.println(stack.peek() + " " + -1);
			stack.pop();

		}
	}
	

}
