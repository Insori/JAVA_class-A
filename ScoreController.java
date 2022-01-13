package mvc.score.controller;

import java.util.Scanner;

import java.util.ArrayList;

import mvc.score.model.Student;
import mvc.score.view.Scoreview;

public class ScoreController {

	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		ArrayList<Student> studentArrList=new ArrayList<Student>();
		String[] sub= {"����","����","����","����","����"};
		int[] score=new int[sub.length];
		
		while(true) {
			System.out.println("�л� ������ �Է����ּ���.");
			System.out.print("����: ");
			String name=scan1.nextLine();
			System.out.print("�й�: ");
			int stuId=scan2.nextInt();
			System.out.println("�л� ������ �Է����ּ���.");
			for(int i=0; i<sub.length; i++) {
				System.out.print(sub[i]+": ");
				score[i]=scan2.nextInt();
			}
			
			Student s=new Student(name, stuId, score[0], score[1], score[2], score[3], score[4]);
			studentArrList.add(s);	//�߰�
			
			System.out.print("���� �л� ������ ��� �Է��Ͻðڽ��ϱ�? (y/n)");
			String choice=scan1.nextLine();
			if(choice.equals("n") || choice.equals("no")) break;
		}
		
		//ȭ�鿡 ����� ����ϱ� ���ؼ� ScoreView ��ü�� �����Ѵ�.
		Scoreview view=new Scoreview(studentArrList);
		view.print();
		
		scan1.close();
		scan2.close();
	}

}
