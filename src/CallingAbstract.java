
public class CallingAbstract extends AbstractMethod{

	
	public void sendkey() {
		System.out.println("hello");
		
	}

	
	public void getTitle() {
		System.out.println("hi");
		
	}

	public static void main(String[] args) {
		CallingAbstract c= new CallingAbstract();
		c.sendkey();
	}
}
