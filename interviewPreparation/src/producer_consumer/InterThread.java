package producer_consumer;

public class InterThread{
	
	  public static void main(String[] args) {
		  QueueData queueObject=new QueueData ();
		  
		  new Producer(queueObject);
		  new Consumer(queueObject);
	}
	  
}
