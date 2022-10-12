package com.in28minutes.hardik;

import java.math.BigDecimal;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
	    this.name = name;
	    this.marks = marks;
	    
	}


	public int getNumberOfMarks() {
		 
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaximumMarks() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getminimumMarks() {
		// TODO Auto-generated method stub
		return 0;
	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		return null;
	}

}
