import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Business {
	
	String title = "세상에서 제일 맛있는 디저트 가게";
	ArrayList<Dessert> cupcake = new ArrayList<Dessert>();
	ArrayList<Dessert> cookie = new ArrayList<Dessert>();
	ArrayList<Dessert> tart = new ArrayList<Dessert>();
	ArrayList<Dessert> macaron = new ArrayList<Dessert>();
	List<ArrayList<Dessert>> dessert = (Arrays.asList(cupcake, cookie, tart, macaron));
	

	void start() {
		ImageIcon main = new ImageIcon("exit.png");
		JLabel icon = new JLabel(main);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(icon, BorderLayout.CENTER);
		
		boolean flag = true;
		while(flag) {
			switch(display()) {
			case 5:
				input();
				break;
			case 4:
				modify();
				break;
			case 3:
				check();
				break;
			case 2:
				sell();
				break;
			case 1:
				invoice();
				break;
			case 0:
				flag = false;
				JOptionPane.showMessageDialog(
						null,
						panel,
						title,
						JOptionPane.PLAIN_MESSAGE
						);
			}
		}
	}

	int display() {		
		ImageIcon icon = new ImageIcon("Choose.png");
		String[] menu = {"종료", "정산", "판매", "조회", "수정", "입력"};
		int choice = JOptionPane.showOptionDialog(
				null, 
				null, 
				title, 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				icon, 
				menu, 
				menu[0]
				);
		return choice;
	}

	void input() {
		MyLabel label1 = new MyLabel("디저트 종류를 선택하세요:");
		MyLabel label2 = new MyLabel("추가할 맛:");
		MyLabel label3 = new MyLabel("이미 존재하는 맛입니다.");
		MyLabel label4 = new MyLabel("가격:");
		MyLabel label5 = new MyLabel("개수:");
		MyLabel label6 = new MyLabel("숫자만 입력할 수 있습니다.");
		
		String[] menu = {"컵케익", "쿠키", "타르트", "마카롱"};
		String flavour, p, s;
		int price, stock;

		String input = (String) JOptionPane.showInputDialog(
				null,
				label1,
				title,
				JOptionPane.PLAIN_MESSAGE,
				null,
				menu,
				menu[0]
				);
		if (input == null) return;

		flavour = JOptionPane.showInputDialog(
				null,
				label2,
				title,
				JOptionPane.PLAIN_MESSAGE
				);
		if (flavour == null) return;
		
		for (int i=0; i<dessert.size(); i++) {
			
			if (dessert.get(i).size() != 0 && input.equals(dessert.get(i).get(0).type)) {
				
				for (int j=0; j<dessert.get(i).size(); j++) {
					
					if (flavour.equals(dessert.get(i).get(j).flavour)) {
						JOptionPane.showMessageDialog(
								null, 
								label3,
								title,
								JOptionPane.PLAIN_MESSAGE
								);
						return;
					}
				}
			}
		}
		

		try {
			p = JOptionPane.showInputDialog(
					null,
					label4,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
			if (p == null) return;
			else {
				price = Integer.parseInt(p);
			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(
					null, 
					label6,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
			return;
		}

		try {
			s = JOptionPane.showInputDialog(
					null,
					label5,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
			if (s == null) return;
			else {
				stock = Integer.parseInt(s);
			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(
					null, 
					label6,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
			return;
		}

		
		MyLabel label7 = new MyLabel(flavour+"맛이 "+stock+"개 추가되었습니다.");
		if (input.equals("컵케익")) {
			cupcake.add(new Dessert("컵케익", flavour, price, stock));
			JOptionPane.showMessageDialog(
					null, 
					label7,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
		}
		else if (input.equals("쿠키")) {
			cookie.add(new Dessert("쿠키", flavour, price, stock));
			JOptionPane.showMessageDialog(
					null, 
					label7,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
		}
		else if (input.equals("타르트")) {
			tart.add(new Dessert("타르트", flavour, price, stock));
			JOptionPane.showMessageDialog(
					null, 
					label7,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
		}
		else if (input.equals("마카롱")) {
			macaron.add(new Dessert("마카롱", flavour, price, stock));
			JOptionPane.showMessageDialog(
					null, 
					label7,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
		}
	}

	void modify() {
		
		MyLabel label1 = new MyLabel("수정할 디저트 종류를 선택하세요:");
		MyLabel label2 = new MyLabel("숫자만 입력할 수 있습니다.");
		
		try {
			String[] menu = {"돌아가기", "마카롱", "타르트", "쿠키", "컵케익"};
			int choice = JOptionPane.showOptionDialog(
					null, 
					label1, 
					title, 
					JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					null, 
					menu,
					menu[0]
					);
			switch(choice) {
			case 4:
				choice = 0;
				break;
			case 3:
				choice = 1;
				break;
			case 2:
				choice = 2;
				break;
			case 1:
				choice = 3;
				break;
			case 0:
				return;
			}

			int no=1, num2;
			String num1;
			String msg = "========"+dessert.get(choice).get(0).type+"========\n"
					+ "번호\t\t맛\t\t가격\t\t개수\n";
			Iterator<Dessert> itr = dessert.get(choice).iterator();
			while(itr.hasNext()) {
				Dessert d = itr.next();
				msg += no +"\t"+ d.toString()+"\n";
				no++;
			}
			
			try {
				num1 = JOptionPane.showInputDialog(
						null,
						msg + "수정할 항목의 번호를 입력하세요: ",
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				if (num1 == null) return;
				else {
					num2 = Integer.parseInt(num1);
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(
						null, 
						label2,
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				return;
			}

			String selected = "========"+dessert.get(choice).get(0).type+"========\n"
					+ "맛\t\t가격\t\t개수\n"
					+ dessert.get(choice).get(num2-1).flavour +"\t"
					+ dessert.get(choice).get(num2-1).price + "\t"
					+ dessert.get(choice).get(num2-1).stock+"\n";

			String[] option = {"돌아가기", "개수", "가격", "맛"};
			int c = JOptionPane.showOptionDialog(
					null, 
					selected + "수정할 항목을 선택하세요: ", 
					title, 
					JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					null, 
					option,
					option[0]
					);

			switch(c) {
			case 3:
				String f = JOptionPane.showInputDialog(
						null, 
						selected + "새로운 맛을 입력하세요: ",
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				if (f == null) return;
				dessert.get(choice).get(num2-1).flavour = f;
				MyLabel label3 = new MyLabel("맛이 "+f+"(으)로 수정되었습니다.");
				JOptionPane.showMessageDialog(
						null, 
						label3,
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				break;
			case 2:
				int price;
				String p = JOptionPane.showInputDialog(
						null, 
						selected + "새로운 가격을 입력하세요: ",
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				if (p == null) return;
				else {
					price = Integer.parseInt(p);
				}
				dessert.get(choice).get(num2-1).price = price;
				MyLabel label4 = new MyLabel("가격이 "+price+"(으)로 수정되었습니다.");
				JOptionPane.showMessageDialog(
						null, 
						label4,
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				break;
			case 1:
				int stock;
				String s = JOptionPane.showInputDialog(
						null, 
						selected + "새로운 개수를 입력하세요: ",
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				if (s == null) return;
				else {
					stock = Integer.parseInt(s);
				}
				dessert.get(choice).get(num2-1).price = stock;
				MyLabel label5 = new MyLabel("개수가 "+stock+"(으)로 수정되었습니다.");
				JOptionPane.showMessageDialog(
						null, 
						label5,
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				break;
			case 0:
				return;
			}
		} catch (IndexOutOfBoundsException e) {
			MyLabel label6 = new MyLabel("수정할 항목이 없습니다.");
			JOptionPane.showMessageDialog(
					null, 
					label6,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
			return;
		}

	} //end modify

	void check() {
		MyLabel label1 = new MyLabel("디저트 종류를 선택하세요: ");
		
		String[] menu = {"컵케익", "쿠키", "타르트", "마카롱"};
		String input = (String) JOptionPane.showInputDialog(
				null,
				label1,
				title,
				JOptionPane.PLAIN_MESSAGE,
				null,
				menu,
				menu[0]

				);
		if (input == null) return;

		if(input.equals("컵케익")) {
			String msg = "====컵케익====\n"
					+ "맛\t가격\t개수\n";
			Iterator<Dessert> itr = cupcake.iterator();
			while(itr.hasNext()) {
				Dessert d = itr.next();
				msg += d.toString()+"\n";
			}
			JOptionPane.showMessageDialog(
					null, 
					msg,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
		}
		else if(input.equals("쿠키")) {
			String msg = "====쿠 키====\n"
					+ "맛\t가격\t개수\n";
			Iterator<Dessert> itr = cookie.iterator();
			while(itr.hasNext()) {
				Dessert d = itr.next();
				msg += d.toString()+"\n";
			}
			JOptionPane.showMessageDialog(
					null, 
					msg,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
		}
		else if(input.equals("타르트")) {
			String msg = "====타르트====\n"
					+ "맛\t가격\t개수\n";
			Iterator<Dessert> itr = tart.iterator();
			while(itr.hasNext()) {
				Dessert d = itr.next();
				msg += d.toString()+"\n";
			}
			JOptionPane.showMessageDialog(
					null, 
					msg,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
		}
		else if(input.equals("마카롱")) {
			String msg = "====마카롱====\n"
					+ "맛\t가격\t개수\n";
			Iterator<Dessert> itr = macaron.iterator();
			while(itr.hasNext()) {
				Dessert d = itr.next();
				msg += d.toString()+"\n";
			}
			JOptionPane.showMessageDialog(
					null, 
					msg,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
		}
	} // end check()

	void sell() {
		String n;
		int num = 0;
		MyLabel label1 = new MyLabel("판매한 디저트 종류를 선택하세요: ");
		
		String[] menu = {"돌아가기", "마카롱", "타르트", "쿠키", "컵케익"};
		int choice = JOptionPane.showOptionDialog(
				null, 
				label1, 
				title, 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				menu,
				menu[0]
				);
		switch(choice) {
		case 4:
			choice = 0;
			break;
		case 3:
			choice = 1;
			break;
		case 2:
			choice = 2;
			break;
		case 1:
			choice = 3;
			break;
		case 0:
			return;
		}

		try {
			String[] flavour = new String[dessert.get(choice).size()];
			int cnt = 0;
			Iterator<Dessert> itr = dessert.get(choice).iterator();
			while(itr.hasNext()) {
				Dessert d = itr.next();
				flavour[cnt++] = d.flavour;
			}

			MyLabel label2 = new MyLabel("판매한 맛을 선택하세요: ");
			int c = JOptionPane.showOptionDialog(
					null, 
					label2, 
					title, 
					JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					null,
					flavour,
					flavour[0]
					);

			try {
				MyLabel label3 = new MyLabel("판매한 수량: ");
				n = JOptionPane.showInputDialog(
						null,
						label3,
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				if (n == null) return;
				else {
					num = Integer.parseInt(n);
				}
			} catch (NumberFormatException e) {
				MyLabel label4 = new MyLabel("숫자만 입력할 수 있습니다.");
				JOptionPane.showMessageDialog(
						null, 
						label4,
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				return;
			}



			if(num > dessert.get(choice).get(c).stock) {
				MyLabel label5 = new MyLabel("수량이 부족합니다!");
				JOptionPane.showMessageDialog(
						null, 
						label5,
						title,
						JOptionPane.PLAIN_MESSAGE
						);
			}
			else {
				dessert.get(choice).get(c).sales = num;
				dessert.get(choice).get(c).stock -= num;
				String msg = "남은 "+dessert.get(choice).get(c).flavour+" 수량: "+dessert.get(choice).get(c).stock+"개";
				MyLabel label6 = new MyLabel(msg);
				JOptionPane.showMessageDialog(
						null, 
						label6,
						title,
						JOptionPane.PLAIN_MESSAGE
						);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			MyLabel label7 = new MyLabel("판매할 디저트가 없습니다.");
			JOptionPane.showMessageDialog(
					null, 
					label7,
					title,
					JOptionPane.PLAIN_MESSAGE
					);
			return;
		}

	} // end sell()

	void invoice() {
		int totalRevenue = 0;
		String msg = "============총 수입============\n"
				+"디저트종류\t맛\t판매량\t수입\n";
		for(int i=0; i<dessert.size(); i++) {
			for(int j=0; j<dessert.get(i).size(); j++) {
				dessert.get(i).get(j).calc();
				totalRevenue += dessert.get(i).get(j).revenue;
			}

			Iterator<Dessert> itr = dessert.get(i).iterator();
			while(itr.hasNext()) {
				Dessert d = itr.next();
				msg += d.type+"\t"+d.flavour+"\t"+d.sales+"\t"+d.revenue+"\n";
			}
		}
		msg += "-------------------------------\n"
				+"                               총 수입: "+totalRevenue;
		JOptionPane.showMessageDialog(
				null, 
				msg,
				title,
				JOptionPane.PLAIN_MESSAGE
				);


	} // end invoice()

}
