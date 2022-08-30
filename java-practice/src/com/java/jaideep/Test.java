package com.java.jaideep;

import java.util.PriorityQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) throws Exception {
		ABC a=new ABC();
		a.drive();
		prority();
		myAdd<Number> myadd=new myAdd<>();
		myadd.add(new Integer(0));
		myadd.add(new Double(0.0));
		BlockingDeque<Integer> aa=new LinkedBlockingDeque<>();
		aa.offerLast(10, 5,TimeUnit.SECONDS);
		System.out.println(aa.pollLast(5, TimeUnit.SECONDS));
		System.out.println(aa.pollFirst(5, TimeUnit.SECONDS));
//		Integer numA = 0;
//		incrementNumber(numA);
//		numA=numA*2;
//		System.out.println(numA);
	}

	private static void incrementNumber(Integer num) {
		num++;
		Integer numA = 42;
	}

	public static void rec(Integer num) {
		if (num > 0) {
			System.out.println(num);
			rec(num - 1);
		}
	}
	public static void prority() {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("carrot");
		pq.add("apple");
		pq.add("banana");
		System.out.println(pq.poll()+" "+pq.peek());
	}
	
}
class Vehicle{
	public void drive() {
		System.out.println("vehicle");
	}
}
class Scooty extends Vehicle{
	public void drive() {
		System.out.println("Scooty");
	}
}
class ABC extends Scooty{
	public void drive() {
		super.drive();
		System.out.println("ABC");
	}
}
class myAdd<T>{
	void add(T t) {
		
	}
}

