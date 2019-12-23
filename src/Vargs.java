
public class Vargs {
public static void main(String[] args) {
	Vargs v= new Vargs();
	v.Add(10,10);
}

public void Add(int...a)
{
	int sum=0;
	for (int i : a) {
		sum=sum+i;
		
		
	}
	System.out.println(sum);
}
}