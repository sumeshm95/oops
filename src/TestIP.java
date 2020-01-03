import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIP {
	public static void main(String[] args) throws UnknownHostException {
		String hostAddress = InetAddress.getLocalHost().getHostAddress();
		System.out.println(hostAddress);
	}

}
