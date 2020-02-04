
public class CallingMultiple {

	public static MultipleValue setDetails() {
		String name = "sumesh";
		String address = "cbe";
		int number = 1245;
		return new MultipleValue(name, address, number);
	}
	public static void main(String[] args) {
		
		MultipleValue c= setDetails();
		System.out.println(c.name);
		System.out.println(c.address);
		System.out.println(c.number);
		
		
	}
}
