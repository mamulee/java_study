package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {

		Socket socket = null;
		
		socket = new Socket();
		System.out.println("[연결 요청]");
		try {
			socket.connect(new InetSocketAddress("127.0.0.1", 5003));
			System.out.println("[연결 성공]");
			
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "Hello, Server!";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[데이터 전송 성공]");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[데이터 받기 성공]\n받은 메세지: "+message);
			
			is.close();
			os.close();
			
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
