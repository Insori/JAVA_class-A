package Test_t2;
//다른 패키지
import Test_t1.MainTest;

public class BBB {
	
	public void accessTest() {
		MainTest mt=new MainTest();	//MainTest가 public이기 때문에 오류 안 남
									//MainTest가 default가 되면 접근 할 수 없으므로 오류 남
		System.out.println(mt.n1);	//public은 다 가능
//		System.out.println(mt.n2);	//private은 당연히 안 됨
//		System.out.println(mt.n3);	//패키지가 다르기 때문에 접근 불가
//		System.out.println(mt.n4);	//default
	}								
}
