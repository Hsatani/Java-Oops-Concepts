import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StudentCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Student> students = List.of(new Student(1,"Hardik"), new Student(2, "Keyuri"), new Student(3,"Manthan"));
   
   ArrayList<Student> studentsAl = new ArrayList<>(students);
   System.out.println(studentsAl);
  
   Collections.sort(studentsAl);
   
   System.out.println(studentsAl);
   
	}

}
