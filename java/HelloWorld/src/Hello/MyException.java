package Hello;



public class MyException extends Exception{
    public void MyException() {
		
	}
    public MyException(String message) {
    	
		super(message);
	}
    
    public static void main(String[] args) {
		
	}
}
class testmyexception{
    public void	test() throws MyException{
		
	}
    
    public static void main(String[] args) {
		try {
			testmyexception testmyexception=new testmyexception();
			testmyexception.test();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	}