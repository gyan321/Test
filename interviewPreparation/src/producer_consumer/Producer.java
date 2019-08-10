package producer_consumer;

class Producer implements Runnable{

	
	QueueData queueObject;
	
	public Producer(QueueData q){
		this.queueObject=q;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	
	@Override
	public void run() {
		int i=0;
		 while(true){
			 queueObject.put(i++);
			 try{
				 Thread.sleep(1000); }catch(Exception e){ }
		 }
		
	} 
	
	
}
