import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



class CallableTask implements Callable<String> {
	private String name;
	
	public CallableTask(String name) {
	this.name = name;
	}
	@Override
	public String call() throws Exception {
		 Thread.sleep(1000);
		return  name;
	}	
}



public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
     ExecutorService executorService = Executors.newFixedThreadPool(1);
     List<CallableTask> tasks = List.of(new CallableTask("Hey Keyur"),
    		                            new CallableTask("I love You"),
    		                            new CallableTask("I love you even more"));
     List<Future<String>> results = executorService.invokeAll(tasks);
     for(Future<String> result:results) {
    	 System.out.println(result.get());
     }
     executorService.shutdown();
     
    // Future<String> welcomeFuture = executorService.submit(new CallableTask("in28minutes"));
     //System.out.println("CallableTask in 28minutes submitted");
     //String welcomeMessage = welcomeFuture.get();
     //System.out.println(welcomeMessage);
     //System.out.println("\n Main completed");
     executorService.shutdown();
     
	}
}


//public MultipleCallableRunner{
//public static void main(String[] args) throws InterruptedException, ExecutionException {
  //  ExecutorService executorService = Executors.newFixedThreadPool(1);
    //List<CallableTask> tasks = List.of(new CallableTask("Hey Keyur"),
   	//	                            new CallableTask("I love You"),
   	//	                            new CallableTask("I love you even more"));
    //List<Future<String>> results = executorService.invokeAll(tasks);
    //for(Future<String> result:results) {
   	 //System.out.println(result.get());
    //}
    //executorService.shutdown();
//}
//}