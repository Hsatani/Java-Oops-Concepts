import java.math.BigDecimal;

//public class StudentRunner {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Student student = new Student("Hardik", 95,93,90);
		//int number = student.getNumberOfmarks();
		//System.out.printf("Number of Marks:",+ number).println();
		//int sum = student.getTotalSumOfMarks();
		//System.out.printf("Sum of Marks:",+ sum).println();
		//int maximumMark = student.getMaximumMark();
		//System.out.printf("Maximum of Marks:",+ number).println();
		//int minimumMark = student.getMinimumMark();	
		//System.out.printf("Minimum of Marks:",+ number).println();
		//BigDecimal average = student.getAverageMarks();
		//System.out.printf("Averag of Marks:", + average).println();
	    //System.out.println(student);
//	}
// }	
	



public class StudentRunner {
	public static void main(String[] args) {
		Student student = new Student("Ranga", 97, 98, 100);
		int number = student.getNumberOfmarks();			
		System.out.println("Number of marks : " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks : " + sum);

		//int maximumMark = student.getMaximumMark();
		//System.out.println("Maximum of marks : " + maximumMark);
		//int minimumMark = student.getMinimumMark();
		//System.out.println("Minimum of marks : " + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("Average of marks : " + average);
		System.out.println(student);
	}	
}

