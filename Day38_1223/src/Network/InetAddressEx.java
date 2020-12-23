package Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) throws Exception {
		InetAddress local = InetAddress.getLocalHost();
		String ip = local.getHostAddress();
		System.out.println("내 IP주소 : " + ip);

		InetAddress [] iaArr = InetAddress.getAllByName("www.naver.com");
		
		for(InetAddress remote : iaArr) {
			System.out.println("www.naver.com IP주소: " + remote.getHostAddress());
		}

	}

}
