package com.java.jaideep;

public class Stack {
	private Integer[] values;
	private Integer top = -1;

	public Stack(Integer size) {
		values = new Integer[size];
	}

	public void push(Integer value) {
		if (top.equals(values.length - 1)) {
			System.out.println("stack overflow");
		} else {
			top++;
			values[top] = value;
		}
	}

	public Integer pop() {
		Integer result = null;
		if (top.equals(-1)) {
			System.out.println("stack is empty");
		} else {
			result = values[top];
			values[top] = null;
			top--;
		}
		return result;
	}

	public void print() {

		for (int i = values.length - 1; i >= 0; i--) {
			if (values[i] != null) {
				System.out.println(values[i]);

			}
		}
	}

	@Override
	public String toString() {
		String result = "";
		for (int i = values.length - 1; i >= 0; i--)  {
			if (values[i] != null) {

				result += values[i] + ",";
			}

		}
		if (!result.equals("")) {
			result = result.substring(0, result.length() - 1);
		}
		return result;

	}

	public Integer peak() {
		if (top.equals(-1) || top.equals(values.length - 1)) {
			return null;
		} else {
			return values[top];
		}
	}

}
