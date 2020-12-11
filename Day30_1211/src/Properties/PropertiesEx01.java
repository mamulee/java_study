package Properties;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx01 {

	public static void main(String[] args) {

		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		prop.put("a", "7770"); // 이것도 가능은 함
		
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String) e.nextElement();
			System.out.println(prop.getProperty(element));
		}
		
		
	}

}
