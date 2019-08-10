package producer_consumer;

public class QueueData {

	int num;
	boolean valueSet = false;

	public synchronized void put(int num) 
	{
		while (valueSet) {
			try {

				wait();
			} catch (Exception e) {
			}
		} 
		System.out.println("put :"+num);
		this.num=num;
		valueSet=true;
		notify();	
	}
	
	public synchronized void get( ) 
	{
		while (!valueSet) {
			try {
				wait();
			} catch (Exception e) {
			}
		} 
		System.out.println("get :"+num);		 
		valueSet=false;
		notify();	
	}

}





