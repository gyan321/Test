package producer_consumer;

class Consumer implements Runnable{

	
	QueueData queueObject;
	
	public Consumer(QueueData q){
		this.queueObject=q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	
	@Override
	public void run() {
		 
		 while(true){
			 queueObject.get();
			 try{
				 Thread.sleep(1000); }catch(Exception e){ }
		 }
		
	} 
	
	
}