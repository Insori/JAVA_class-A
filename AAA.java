package Test_t1;
//MainTest�� ���� ��Ű��
public class AAA {
	public void accessTest() {
		MainTest mt=new MainTest();	//���� ��Ű�� �ȿ��� ���� ����(public)�̱� ������
		System.out.println(mt.n1);	//public
//		System.out.println(mt.n2);	//private�� ���� Ŭ���� ����� �� ���� �Ұ�
		System.out.println(mt.n3);	//protected
		System.out.println(mt.n4);	//default
	}
}
