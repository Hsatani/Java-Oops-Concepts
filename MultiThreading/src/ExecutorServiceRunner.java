import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	private int number;
	
	public Task(int number) {
	this.number = number;
	}
	 public void run() {
	 System.out.println("\nTask" + number + "Started");
		 for(int i=number*100; i<=number*100 + 99 ; i++) {
		  System.out.print(i + " ");
	      }
	      System.out.println("Task" + number + " Done ");
	}
}



public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.shutdown();
		//Task3
		//System.out.println("Task 3 kicked off");
		//for(int i=301; i<=399; i++)
			//System.out.print(i + " ");
		//System.out.println("Task 3 Done ");
		//System.out.println("Main Done ");
		
		
	}

}
