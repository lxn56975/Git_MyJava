package Hello;

public class MyArrayList {
	 Object[] value;
	 int size;
	 public MyArrayList() {
		 value=new Object[16];
		 // TODO Auto-generated constructor stub
	}
	 public MyArrayList(int size) {
		 value=new Object[size];
	 }
	 public void add(Object obj) {
		value[size]=obj;
		size++;
	 }
	 public Object get(int index) {
		return value[index]; 
	}
}
