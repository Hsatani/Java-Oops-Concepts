
class Task1 extends Thread{
	  public void run() {
	
	      for(int i=101; i<=199; i++) {
		  System.out.print(i + " ");
	      }
	      System.out.println("Task 1 Done ");
	}
}
	
class Task2 implements Runnable{
		public void run() {
			
			for(int i=201; i<=299; i++) {
			System.out.print(i + " ");
			}
			System.out.println("Task 2 Done ");	
	}
}
	
	
public class ThreadBasicsRunner {
	

	public static void main(String[] args) {
		//Task1
		System.out.println("Task 1 kicked off");
		Task1 task1 = new Task1();
		task1.start();
		
		//Task2
		System.out.println("Task 2 kicked off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();
		
		
		//Task3
		System.out.println("Task 3 kicked off");
		for(int i=301; i<=399; i++)
			System.out.print(i + " ");
		System.out.println("Task 3 Done ");
		System.out.println("Main Done ");

	}


}
