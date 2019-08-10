package com.vishist.interviewImplementingSerialVersionId.copy;

import java.io.FileInputStream;
import java.io.ObjectInputStream; 
 

public class Reciever implements Deserialization { 

	 
	
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
	 
		Sender sender=(Sender)ois.readObject();

		System.out.println("after deserialisation:- i :" + sender.i + "  j:" + sender.j);

	}

}
