package p09;

public class WaitNotifyEx {

	public static void main(String[] args) {

		DataBox dataBox = new DataBox(); // 공유객체 생성
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
		
	}

}
