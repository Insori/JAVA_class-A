package Test_t1;
//MainTest와 같은 패키지
public class AAA {
	public void accessTest() {
		MainTest mt=new MainTest();	//같은 패키지 안에서 접근 가능(public)이기 때문에
		System.out.println(mt.n1);	//public
//		System.out.println(mt.n2);	//private은 같은 클래스 뺴고는 다 접근 불가
		System.out.println(mt.n3);	//protected
		System.out.println(mt.n4);	//default
	}
}
