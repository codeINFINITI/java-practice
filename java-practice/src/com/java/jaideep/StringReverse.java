package com.java.jaideep;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "radar";
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				break;
			}
			i++;
			j--;
		}
		if(i>j || i==j) {
			System.out.println(str+" is palindrome");
			
		}
		else {
			System.out.println(str+" is not palindrome");
		}
	}

}
