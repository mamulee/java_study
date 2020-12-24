package ChatProgram1v1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChattingClient extends Thread implements ActionListener {

	Frame frame;
	TextArea ta;
	TextField tf;
	TextField tf2;
	Dialog dialog;
	Label label;

	Socket s1;
	DataOutputStream dos;
	DataInputStream dis;
	boolean stop;
	String host;

	public ChattingClient() {
		launchFrame(); // 화면 실행
	}

	public void launchFrame() {
		frame = new Frame("일대일 채팅 - 클라이언트");
		ta = new TextArea();
		tf = new TextField();
		frame.setBackground(Color.CYAN);
		ta.setEditable(false);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);
		frame.setSize(500, 300);
		frame.setVisible(true);
		tf.requestFocus();

		dialog = new Dialog(frame, "서버 IP", true);
		label = new Label("접속할 서버 IP를 입력하세요: ");
		tf2 = new TextField(15);
		dialog.add(label, BorderLayout.NORTH);
		dialog.add(tf2, BorderLayout.CENTER);
		tf2.addActionListener(this);
		dialog.pack();
		dialog.show();

		service(host);
		tf2.requestFocus();
	}

	public void service(String host) {
		try {
			s1 = new Socket(host, 5432);
			dis = new DataInputStream(s1.getInputStream());
			dos = new DataOutputStream(s1.getOutputStream());
			ta.append("접속 완료.\n");
			this.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(tf==e.getSource()) {
				String msg = tf.getText();
				ta.append(msg + "\n");
				if(msg.equals("exit")) {
					ta.append("Bye!!");
					stop = true;
					dos.close();
					s1.close();
					System.exit(0);
				} else {
					dos.writeUTF("서버:" +msg);
					tf.setText(" ");
				}
			}else  {
				host = tf2.getText().trim();//전역변수 host에 서버의 ip주소 넣기 
				if(host.equals("")) host="localhost";
				dialog.dispose();
			}
		}catch(IOException e1) {} 
	}

	@Override
	public void run() {
		try {
			System.out.println("Thread Start....\n");
			while(!stop) {
				ta.append(dis.readUTF()+"\n");
			}
			dis.close();
			s1.close();
		} catch (EOFException e1) {
			// TODO Auto-generated catch block
			System.out.println("서버로부터 연결이 끊겼습니다... ");
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChattingClient();
	}


}
