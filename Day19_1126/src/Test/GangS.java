package Test;

public class GangS extends District {
	public GangS() {
		super.Location = "강남지구";
		super.name = "이기영";
		super.amount = new int[10];
		super.amount = new int[10];
		super.time = new int[10];
		super.priceAmount = new int[10];
		super.priceTime = new int[10];
		super.priceTotal = new int[10];
	}
	
	static int cnt = 0;
	@Override
	public void input(int amount, int time) {
		super.amount[cnt] = amount;
		super.time[cnt] = time;
		super.priceAmount[cnt] = super.costAmountMethod(amount);
		super.priceTime[cnt] = super.costTimeMethod(time);
		super.priceTotal[cnt] = super.costTotalMethod(super.priceAmount[cnt], super.priceTime[cnt] );
		cnt++;
	}
	
	@Override
	public void output() {
		for(int i=0; i<cnt; i++) {
			System.out.print(name+"\t"+time[i]+"\t"+amount[i]+"\t"+priceTotal[i]);
			System.out.println();
		}
	}
}
