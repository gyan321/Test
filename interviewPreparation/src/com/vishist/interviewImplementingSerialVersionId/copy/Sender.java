package com.vishist.interviewImplementingSerialVersionId.copy;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Sender implements Serializable{
 
	 
	int i=11;
	int j=2;
	 
 ;
	 
	public static void main(String[] args) throws Exception {
		 
		Sender sender=new Sender();
		
		System.out.println("during Serialisation----i: "+sender.i +"j"+sender.j);
		
		FileOutputStream fos=new FileOutputStream("abc.ser",true);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(sender);

	}

}