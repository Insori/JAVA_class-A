package Test_score;
import java.util.Scanner;
public class DynamicArr_score {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//�л��� ���� �Է� �޾� �� �л��� ������ �Է� ��(�� �л��� ���� ���� �ٸ�), �� ����� ���Ͻÿ�.
		
		System.out.print("�л� �� : ");
		int stu_num=scan.nextInt();	//�л� �� �Է�
		
		int[][] scores=new int[stu_num][];
		String[] name= {"������","�輭��","������","��ٿ�","�̿���","���ֿ�","�μҸ�","��ä��","������","������","������","������","Ȳ����"};
		int[] sum=new int[12];
		int sub_num;	//���� ��
		//�����迭�� ��(�л� ��)�� ���� for��
		for(int i=0; i<scores.length; i++) {
			System.out.print(name[i]+" �л���"+" ���� �� : ");
			sub_num=scan.nextInt();
			scores[i]=new int[sub_num];
			//�����迭�� ��(���� ��)�� ���� for��
			for(int j=0; j<scores[i].length; j++) {
				System.out.print((j+1)+"���� ���� : ");
				scores[i][j]=scan.nextInt();
				sum[i]+=scores[i][j];
			}
		}
		//���
		for(int i=0; i<scores.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.print("�հ� : "+sum[i]+" ");
			System.out.println("��� : "+((double)sum[i]/scores[i].length));
		}
		
		scan.close();
		

	}

}
