package Hello;

import java.io.File;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestFileTree {

	public static void main(String[] args) {
		File file1=new File("F:/eclipse");
		fileTree(file1,0);
		
//		boolean b=file1.isFile();
//		System.out.print(b);
//		File[] f2=file1.listFiles();
//		for (File i : f2) {
//			System.out.println(i.getName());
//		}
		//System.out.println(file1.l);
		
	}
	public static void fileTree(File tempfile,int level) {
		for (int i = 0; i <level; i++) {
			System.out.print("-");
		}
		System.out.println(tempfile.getName());
		if(tempfile.isDirectory())
		{
		   File[] temp=tempfile.listFiles();
		   for (File i : temp) {
			   	fileTree(i, level+1);
			}
		}
	}
}