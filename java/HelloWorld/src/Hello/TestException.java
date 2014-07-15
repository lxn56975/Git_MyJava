package Hello;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {

	public static void main(String[] args) {
		FileReader  fr=null;
		try {
			fr =new FileReader("e:/aa.txt");
			char c=(char)fr.read();
			char c2=(char)fr.read();
			
			System.out.print(""+c+c2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
	}
}
