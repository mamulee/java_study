package Network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {
		
		// 연결 요청 부분 !@!@!!!
		
		Socket socket = null;
		
		socket = new Socket();
		System.out.println("[연결 요청]");
		try {
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
