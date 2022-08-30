package com.java.jaideep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class A{
	public String add(Object a) {
		return null;
	}
	public void add(Integer a) {
		
	}
	
}
public class Driver {
	static Integer[] stack= {1,4,5,2,5,2,3,5};
	static int top=stack.length-1;
	public static void main(String[] args) {
		A a=new A();
		String s=a.add(null);
		
		
	}
	private static void print() {
		// TODO Auto-generated method stub
		top=0;
		for(Integer i:stack) {
			System.out.println(i);
		}
	}
}
