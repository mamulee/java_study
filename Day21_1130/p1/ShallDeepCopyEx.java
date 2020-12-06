package p1;

public class ShallDeepCopyEx {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1,1),2.0);
		Circle c2 = c1.shallowCopy();	//얕은 복사
		Circle c3 = c1.deepCopy();		//깊은 복사
		
		System.out.println("c1= "+c1);
		System.out.println("c2= "+c2);
		System.out.println("c3= "+c3);
		
		//수정하기
		c1.p.x=9;
		c1.p.y=10;
		c1.r=30;
		
		System.out.println("수정 후");
		System.out.println("c1= "+c1);
		System.out.println("c2= "+c2);
		System.out.println("c3= "+c3);
		

	}

}
