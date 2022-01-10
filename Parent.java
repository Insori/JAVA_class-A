package Test_final1;

public class Parent {
	//final 필드는 초기화된 값만 사용할 수 있고 변경이 불가능하다.(필드 값 변경 금지)
	final int restTime=10;
	public final void rest() {
//		restTime=20;
		System.out.println(restTime+"분간 휴식을 한다.");
	}


}
