package com.java.jaideep;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentDeSerialization {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("E:\\JAVA_WSs\\java-practice\\java-practice\\src\\com\\java\\jaideep\\f.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
			Student s1=(Student)oin.readObject();
			oin.close();
			fin.close();
			System.out.println(s1.getRollNo()+": "+s1.getName());
			
		} catch (Exception e) {
			// DO: handle exception
			e.printStackTrace();
		}
	}
}
