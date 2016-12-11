package mythread;

public class ProducerConsumer {
	int[] arr = new int[5];
	volatile int index = 0;
	
	public synchronized void produce() throws InterruptedException {
		while (true) {
			 if (index == 4) 
				wait();
				arr[index++] = 1;
				System.out.println(index);
				notify();
		}
	} 
	
	public synchronized void consume() throws InterruptedException {
		while (true) {
			 if (index == 0)
				wait();
				arr[index--] = 0;
				System.out.println(index);
				notify();
		}
		
	}
	

}
