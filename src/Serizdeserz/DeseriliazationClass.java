package Serizdeserz;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeseriliazationClass {
public static void main(String[] args) {
	Seriz s=null;
	try {
		FileInputStream filein=new FileInputStream("C:\\\\Users\\\\smohandass\\\\Desktop\\\\file\\\\char.txt");
		ObjectInputStream in= new ObjectInputStream(filein);
		s=(Seriz) in.readObject();
		in.close();
		filein.close();
	}
	catch(IOException  | ClassNotFoundException c){
		c.printStackTrace();
		
	}
	finally {
		System.out.println("name "+s.name);
		System.out.println("address "+s.address);
		System.out.println("gender "+s.gender);
	}


}


}
