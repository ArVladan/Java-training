package mythread;

public class PongData {
	private final  static int PING = 1;
	private final static int PONG = 0;
	private int state = 0;
	
	public synchronized void pong() throws InterruptedException {
		while (true) {
			if (state == PING) {
				wait();
			}
			System.out.println("Pong");
			state = PING;
			notify();
		}
	}
	
	public synchronized void ping() throws InterruptedException {
		while (true) {
			if (state == PONG) {
				wait();
			}
			System.out.println("Ping");
			state = PONG;
			notify();
		}
	}
}
