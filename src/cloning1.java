

public class cloning1 implements Cloneable {
	int i;
	int j;

	
	  
	public static void main(String[] args) throws CloneNotSupportedException {
		cloning1 obj= new cloning1();
		obj.i=5;
		obj.j=6;
		
		/*
		 * cloning1 obj1=obj; System.out.println(obj1.i);
		 */
		cloning1 obj1=(cloning1) obj.clone();
		System.out.println(obj1.i);
		System.out.println(obj.i+" " +obj.j);
		
		
	}

}
