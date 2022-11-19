package stack;

import java.util.Stack;

public class Max_Area {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 7, 2, 4, 5 };
		maxArea(arr, arr.length);
	}

	private static void maxArea(int[] a, int length) {
		Stack<Integer> s = new Stack<Integer>();
		int i = 0, max = 0, currMax, area, maxArea = 0;
		while (i < length) {
			if (s.empty() || a[s.peek()] <= a[i]) {
				s.push(i);
				i++;
			} else {
				currMax = s.pop();
				area = a[currMax] * (s.empty() ? i : i - s.peek());
				if (area > maxArea) {
					maxArea = area;
				}
			}

		}
		System.out.println("max area"+ maxArea);
	}

}
