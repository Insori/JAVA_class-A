package Test_class3;

public class RunCircle {

	public static void main(String[] args) {
		
		Circle c1=new Circle();
		c1.setR(5);	//반지름 5인 원
		
		Circle c2=new Circle();
		c2.setR(12);	//반지름 12인 원
		
		c1.calcCircum();	//둘레
		c1.clacArea();	//면적
		
		c2.calcCircum();
		c2.clacArea();

		System.out.println("---------------------------------------");
		System.out.printf("반지름이 %d㎝인 원의 둘레는 %.3f㎝\n",c1.getR(),c1.getCircum());
		System.out.printf("반지름이 %d㎝인 원의 면적은 %.3f㎠\n",c1.getR(),c1.getArea());
		System.out.println("---------------------------------------");
		
		System.out.println("---------------------------------------");
		System.out.printf("반지름이 %d㎝인 원의 둘레는 %.3f㎝\n",c2.getR(),c2.getCircum());
		System.out.printf("반지름이 %d㎝인 원의 면적은 %.3f㎠\n",c2.getR(),c2.getArea());
		System.out.println("---------------------------------------");
		
	}

}
