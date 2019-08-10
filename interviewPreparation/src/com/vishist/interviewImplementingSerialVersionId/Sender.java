package com.vishist.interviewImplementingSerialVersionId;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender {

	public static void main(String[] args) throws Exception 
	{
		SerialisationWithSerialId serialObject=new SerialisationWithSerialId();
		
		System.out.println("during Serialisation----i: "+serialObject.i +"j"+serialObject.j);
		
		FileOutputStream fos=new FileOutputStream("abc.ser",true);
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(serialObject);

	}

}
