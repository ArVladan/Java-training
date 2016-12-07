package myexeption;

public class MyException {
	
	void test(int p) throws CastomException {
		if (p < 1000) {
			throw new CastomException();
		}
	}
	
}
