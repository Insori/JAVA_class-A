package Test_score;
import java.util.Scanner;
public class DynamicArr_score {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//학생의 수를 입력 받아 각 학생의 점수를 입력 후(각 학생의 과목 수는 다름), 각 평균을 구하시오.
		
		System.out.print("학생 수 : ");
		int stu_num=scan.nextInt();	//학생 수 입력
		
		int[][] scores=new int[stu_num][];
		String[] name= {"김윤서","배서연","백지민","양다연","이예진","이주완","인소리","임채영","정가현","정현진","조예서","최자윤","황유솔"};
		int[] sum=new int[12];
		int sub_num;	//과목 수
		//동적배열의 행(학생 수)에 대한 for문
		for(int i=0; i<scores.length; i++) {
			System.out.print(name[i]+" 학생의"+" 과목 수 : ");
			sub_num=scan.nextInt();
			scores[i]=new int[sub_num];
			//동적배열의 열(과목 수)에 대한 for문
			for(int j=0; j<scores[i].length; j++) {
				System.out.print((j+1)+"과목 점수 : ");
				scores[i][j]=scan.nextInt();
				sum[i]+=scores[i][j];
			}
		}
		//출력
		for(int i=0; i<scores.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.print("합계 : "+sum[i]+" ");
			System.out.println("평균 : "+((double)sum[i]/scores[i].length));
		}
		
		scan.close();
		

	}

}
