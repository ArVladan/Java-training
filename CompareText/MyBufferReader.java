package compare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MyBufferReader<Item> {
	
	
	public void addFile(ArrayList<Item> list, String str) {
		@SuppressWarnings("unchecked")
		ArrayList<String> l = (ArrayList<String>) list;
		try(BufferedReader one = new BufferedReader(new FileReader(str))) {
			String s;
			while (((s = one.readLine())!= null)) {
				l.add(s);
			}
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}
	

}
