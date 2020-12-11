package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {

		Queue<Message> mq = new LinkedList<Message>();
		
		mq.offer(new Message("sendMail", "홍길동"));
		mq.offer(new Message("sendSMS", "신용권"));
		mq.offer(new Message("sendKaTalk", "홍두께"));
		
		while(!mq.isEmpty()) {
			System.out.println(mq.poll());
		}
		System.out.println(mq.isEmpty());

	}

}

class Message {
	String command;
	String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
	@Override
	public String toString() {
		return command +" "+ to;
	}
}