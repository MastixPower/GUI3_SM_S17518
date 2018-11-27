package zad3;
import java.io.*;
import java.util.Scanner;


public class Towar extends Thread {
	String name;
	int weight;
	File file;
	Scanner in;
	Towar(File file)throws FileNotFoundException{
		this.file=file;
	}
	
	public void run() {
		try {
			in=new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (in.nextLine() != null)
		{
			this.name=in.nextLine();
			System.out.println(name);
		}
	}
	

}
