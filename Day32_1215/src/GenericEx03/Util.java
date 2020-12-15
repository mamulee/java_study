package GenericEx03;

public class Util <K, V> {

	public static <K, V> V getValue(Pair<K, V> p, K key) {
		if(p.getKey().equals(key)) {
			return p.getValue();
		}
		return null;
	}
	
	/*
	public static <P extends Pair<K, V>, K, V> V  getValue( P p, K k) {  //Pair타입과 하위타입
	      if(p.getKey() == k) {
	         return p.getValue();
	      }else {
	         return null;
	      }
	*/
	
}
