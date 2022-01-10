package Test_field1;

public class RunTV {

	public static void main(String[] args) {
		TV t1=new TV("Black",55);
		TV t2=new TV("Silver",65);
		TV t3=new TV("Blue",100);
		
//		t1.PRODUCER="삼성전자";	//PRODUCER(static에 할당)은 한 번만 할당되기 때문에 t1,t2,t3 모두 삼성전자라고 나온다.
		System.out.printf("색상: %s, 크기: %d, 제조사: %s\n",t1.color, t1.size, TV.PRODUCER);
		System.out.printf("색상: %s, 크기: %d, 제조사: %s\n",t2.color, t2.size, TV.PRODUCER);
		System.out.printf("색상: %s, 크기: %d, 제조사: %s\n",t3.color, t3.size, TV.PRODUCER);
		
		
		
		
		
		
		
	}

}
