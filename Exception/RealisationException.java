package myexeption;

public class RealisationException {
	static MyException a;
	public static void main(String[] args) {
	int p = 1234;
	int p2 = 123;
	try {
		a.test(p);
		a.test(p2);
	} catch (CastomException e) {
		e.getCastEx();
	}
	}

}
