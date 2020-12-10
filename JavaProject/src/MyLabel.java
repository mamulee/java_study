import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MyLabel extends JLabel {

	public MyLabel(String text) {
		super(text, null, LEADING);
		this.setFont(new Font("Arial", Font.PLAIN, 18));
		this.setForeground(new Color(51, 117, 255));
	}
	
}
