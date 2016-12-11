package mythread;

public class PCExecutor {

	public static void main(String[] args) {
		
		final ProducerConsumer pc = new ProducerConsumer();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce(); 
				 
				} catch  (InterruptedException e) {
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					
				}
			}
		}).start();

	}

}
