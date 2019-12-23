package Serizdeserz;
import java.io.*;


public class SerialiazationClass {
	public static void main(String[] args) {
		Seriz s=new Seriz();
		s.name="sumesh";
		s.address="chennai";
		s.gender="male";
	
	try {
		FileOutputStream fileout= new FileOutputStream("C:\\Users\\smohandass\\Desktop\\file\\char.txt");
	ObjectOutputStream ot= new ObjectOutputStream(fileout);
	ot.writeObject(s);
	ot.close();
	fileout.close();
	System.out.println("serilized");
			}
	catch (IOException e) {
		e.printStackTrace();
		
	}
	
	

}
}