package p2;

import p1.Parent;

public class Child extends Parent {
	//상속관계일때만 다른 패키지에 있는 protected인  부모의 멤버를 접근할 수 있다.
	public void testProtected() {
		num1=100;
		System.out.println("Parent의 protected field num1: "+num1);
		
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.testProtected();
	}
}
