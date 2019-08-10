package com.vishist.constructorInjection;

import com.applicationContext.setterInjection.TriangleSide;

public class Triangle {
	
	String colour;
	String size;
	
	private TriangleSide triangleSide;
	
	public TriangleSide getTriangleSide() {
		return triangleSide;
	}

	public void setTriangleSide(TriangleSide triangleSide) {
		this.triangleSide = triangleSide;
	}

	public Triangle(String colour , String size ) {
		super();
		this.colour = colour;
		this.size = size;
	}

	public   void Draw(){
		System.out.println("drawing triangle with "+this.colour+"with length"+triangleSide.getSideLength()+"size :"+this.size);
	}

}
