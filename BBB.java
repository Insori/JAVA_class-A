package Test_t2;
//�ٸ� ��Ű��
import Test_t1.MainTest;

public class BBB {
	
	public void accessTest() {
		MainTest mt=new MainTest();	//MainTest�� public�̱� ������ ���� �� ��
									//MainTest�� default�� �Ǹ� ���� �� �� �����Ƿ� ���� ��
		System.out.println(mt.n1);	//public�� �� ����
//		System.out.println(mt.n2);	//private�� �翬�� �� ��
//		System.out.println(mt.n3);	//��Ű���� �ٸ��� ������ ���� �Ұ�
//		System.out.println(mt.n4);	//default
	}								
}
