import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;

public class Student {
	
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	
	public Student(String name, int...marks) {
		this.name = name;
		for(int mark:marks) {
			this.marks.add(mark);
		}
	}
	


	public int getNumberOfmarks() {
		return marks.size() ;
	}
	
	public int getTotalSumOfMarks() {
		 int sum = 0;
		for(int mark:marks) {
			sum += mark;
		}
		return sum;
	}

	//public int getMaximumMark() {
		// TODO Auto-generated method stub
		//return Collection.max(marks);
	//}
	//public int getMinimumMark() {
		//return Collection.mini(marks);
	//}
    public BigDecimal getAverageMarks() {
    	int sum = getTotalSumOfMarks();
    	BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(marks.size()),3,RoundingMode.UP);
		return average;
    }
    public String tostring() {
    	return name + marks;
    }
}


	
