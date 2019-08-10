package threadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
	 
		PrintJob[] jobs={new PrintJob("Task1"),
				         new PrintJob("Task2"),
				         new PrintJob("Task3"),
				         new PrintJob("Task4"),
				         new PrintJob("Task5"),
				         new PrintJob("Task6")};
		
		ExecutorService service= Executors.newFixedThreadPool(3);//creating thread pool
		
		for(PrintJob job:jobs){
			service.submit(job);
		}
		
		service.shutdown();
	}

}
