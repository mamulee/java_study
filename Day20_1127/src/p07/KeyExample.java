package p07;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "홍길동"); // 해쉬맵이라는 상자 안에 자료 넣기
		String value = hashMap.get(new Key(1)); // Key를 넣으면 value 출력
		System.out.println(value);
	}

}
