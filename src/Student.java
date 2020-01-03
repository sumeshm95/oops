
public class Student {
	String name;
	int rollNo;
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		System.out.println("name--"+name+" "+"rollNo--"+rollNo);
	}
	public void action() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Student s1=new Student("sumesh", 10);
		Student s2=new Student("sumesh2", 101);
		s1.action();
		s2.action();
		
	}

}
