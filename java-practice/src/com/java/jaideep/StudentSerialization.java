package com.java.jaideep;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSerialization {

	public static void main(String[] args) {
		Student s1=new Student(12,"Jaideep");
		try {
			FileOutputStream fout=new FileOutputStream("E:\\JAVA_WSs\\java-practice\\java-practice\\src\\com\\java\\jaideep\\f.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			
			  System.out.println("success");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
