package mythread;

public class PingPongGame {

	public static void main(String[] args) {
		PongData po = new PongData();
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					po.ping(); 
				} catch  (InterruptedException e) {
				}
			}
		}).start();
	
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					po.pong();
				} catch (InterruptedException e) {
				}
			}
		}).start();
	}

}
