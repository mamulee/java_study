package ExTeacher;

public class CGrade extends WirelessClass {
	
	public CGrade() {
		super.custName = new String[10];
		super.gradeCode = "C";
		super.unitPrice = 104;
		super.basePrice = 15000;
		super.discountRate = super.discountRateMethod(basePrice);
		super.useTime = new int[10];
		super.communicationFee = new int[10];
	}
	
	
	static int cnt = 0;
	@Override
	public void input(String custName, int useTime) {
		super.custName[cnt] = custName;
		super.useTime[cnt] = useTime;
		super.communicationFee[cnt] = super.communicationFeeMethod(super.unitPrice, super.useTime[cnt], super.basePrice, super.discountRate);
		cnt++;
	}
	@Override
	public void output() {
		for(int i=0; i<cnt; i++) {
			System.out.print(custName[i]+ " ");
			System.out.print(gradeCode+" ");
			System.out.print( unitPrice+" ");
			System.out.print( basePrice+" ");
			System.out.print( useTime[i]+" ");
			System.out.print( discountRate+" ");
			System.out.print( communicationFee[i]);
			System.out.println();
		}
	}
}
