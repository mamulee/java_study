package Network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {

		// 연결 수락 하는 부분 !!!!!!!!!!!
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			
			// 1단계: 포트 바인딩
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			// 2단계: accept() 기다리기
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();
				// 3단계: 연결 수락
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]"+ isa.getHostName());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
