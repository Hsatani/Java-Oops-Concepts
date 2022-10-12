package com.in28minutes.hardik;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = {100, 99, 95 };
		
		Student student = new Student("hardik",marks);
		int number = student.getNumberOfMarks();
		System.out.println("number of marks"+ number);
		//int sum = student.getTotalSumOfMarks();
		//int maximumMarks = student.getMaximumMarks();
		//int minimumMarks = student.getminimumMarks();
        //BigDecimal average = student.getAverageMarks();
         	
	}

}
