
public class Bank {
	public int accountNo=123456;
	private int pinNo=1325;
	private double balance=100000;
	public void WithdrawAmount(int accNo,int pinN,int amount) {
		if(accNo==accountNo &&pinN==pinNo) {
			if(amount<=balance) {
				balance=balance-amount;
				System.out.println("balance amount"+balance);
				
		}
			else
			{
				System.out.println("insufficient balance");
			}
	}else
	{
		System.out.println("wrong credentials");
	}
	

}
	public void updatePin(int accNo,int oldPin,int newPin) {
		if(accNo==accountNo &&oldPin==pinNo) {
			pinNo=newPin;
			System.out.println("pin changed sucessfully");
		
	}
		else
		{
			System.out.println("wrong credentials");
		}
}
}
