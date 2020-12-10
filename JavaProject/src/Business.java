import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Business {
	String title = "세상에서 제일 맛있는 디저트 카페";
	ArrayList<Dessert> cupcake = new ArrayList<Dessert>();
	ArrayList<Dessert> cookie = new ArrayList<Dessert>();
	ArrayList<Dessert> tart = new ArrayList<Dessert>();
	ArrayList<Dessert> macaron = new ArrayList<Dessert>();
	List<ArrayList<Dessert>> dessert = (Arrays.asList(cupcake, cookie, tart, macaron));

	//		public void test() {
	//			System.out.println(dessert.get(0).get(0).type);
	//		}

	void start() {
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
						"프로그램을 종료합니다.",
						title,
						JOptionPane.INFORMATION_MESSAGE
						);
			}
		}
	}

	int display() {
		String[] menu = {"종료", "정산", "판매", "조회", "수정", "입력"};
		int choice = JOptionPane.showOptionDialog(
				null, 
				"메뉴를 선택하세요: ", 
				title, 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				menu, 
				menu[0]
				);
		return choice;
	}

	void input() {
		String[] menu = {"컵케익", "쿠키", "타르트", "마카롱"};
		String flavour, p, s;
		int price, stock;

		String input = (String) JOptionPane.showInputDialog(
				null,
				"디저트 종류를 선택하세요: ",
				title,
				JOptionPane.PLAIN_MESSAGE,
				null,
				menu,
				menu[0]
				);
		if (input == null) return;

		flavour = JOptionPane.showInputDialog(
				null,
				"추가할 맛: ",
				title,
				JOptionPane.PLAIN_MESSAGE
				);
		if (flavour == null) return;

		try {
			p = JOptionPane.showInputDialog(
					null,
					"가격: ",
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
					"숫자만 입력할 수 있습니다.",
					title,
					JOptionPane.PLAIN_MESSAGE
					);
			return;
		}

		try {
			s = JOptionPane.showInputDialog(
					null,
					"수량: ",
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
					"숫자만 입력할 수 있습니다.",
					title,
					JOptionPane.PLAIN_MESSAGE
					);
			return;
		}

		if (input.equals("컵케익")) {
			cupcake.add(new Dessert("컵케익", flavour, price, stock));
			JOptionPane.showMessageDialog(null, "컵케익에 "+flavour+"맛이 "+stock+"개 추가되었습니다.");
		}
		else if (input.equals("쿠키")) {
			cookie.add(new Dessert("쿠키", flavour, price, stock));
			JOptionPane.showMessageDialog(null, "쿠키에 "+flavour+"맛이 "+stock+"개 추가되었습니다.");
		}
		else if (input.equals("타르트")) {
			tart.add(new Dessert("타르트", flavour, price, stock));
			JOptionPane.showMessageDialog(null, "타르트에 "+flavour+"맛이 "+stock+"개 추가되었습니다.");
		}
		else if (input.equals("마카롱")) {
			macaron.add(new Dessert("마카롱", flavour, price, stock));
			JOptionPane.showMessageDialog(null, "마카롱에 "+flavour+"맛이 "+stock+"개 추가되었습니다.");
		}
	}

	void modify() {
		try {
			String[] menu = {"돌아가기", "마카롱", "타르트", "쿠키", "컵케익"};
			int choice = JOptionPane.showOptionDialog(
					null, 
					"수정할 디저트 종류를 선택하세요: ", 
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
						"숫자만 입력할 수 있습니다.",
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
				JOptionPane.showMessageDialog(
						null, 
						"맛이 "+f+"(으)로 수정되었습니다.",
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
				JOptionPane.showMessageDialog(
						null, 
						"가격이 "+price+"(으)로 수정되었습니다.",
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
				JOptionPane.showMessageDialog(
						null, 
						"개수가 "+stock+"(으)로 수정되었습니다.",
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				break;
			case 0:
				return;
			}
		} catch (IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(
					null, 
					"수정할 항목이 없습니다.",
					title,
					JOptionPane.PLAIN_MESSAGE
					);
			return;
		}

	} //end modify

	void check() {
		String[] menu = {"컵케익", "쿠키", "타르트", "마카롱"};
		String input = (String) JOptionPane.showInputDialog(

				null,
				"디저트 종류를 선택하세요: ",
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
		String[] menu = {"돌아가기", "마카롱", "타르트", "쿠키", "컵케익"};
		int choice = JOptionPane.showOptionDialog(
				null, 
				"판매한 디저트 종류를 선택하세요: ", 
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

			int c = JOptionPane.showOptionDialog(
					null, 
					"판매한 맛을 선택하세요: ", 
					title, 
					JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					null,
					flavour,
					flavour[0]
					);

			try {
				n = JOptionPane.showInputDialog(
						null,
						"판매한 수량: ",
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				if (n == null) return;
				else {
					num = Integer.parseInt(n);
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(
						null, 
						"숫자만 입력할 수 있습니다.",
						title,
						JOptionPane.PLAIN_MESSAGE
						);
				return;
			}



			if(num > dessert.get(choice).get(c).stock) {
				JOptionPane.showMessageDialog(
						null, 
						"수량이 부족합니다!",
						title,
						JOptionPane.PLAIN_MESSAGE
						);
			}
			else {
				dessert.get(choice).get(c).sales = num;
				dessert.get(choice).get(c).stock -= num;
				String msg = "남은 "+dessert.get(choice).get(c).flavour+" 수량: "+dessert.get(choice).get(c).stock+"개";
				JOptionPane.showMessageDialog(
						null, 
						msg,
						title,
						JOptionPane.PLAIN_MESSAGE
						);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(
					null, 
					"판매할 디저트가 없습니다.",
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
