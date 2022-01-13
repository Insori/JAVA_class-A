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
		String[] sub= {"국어","영어","수학","과학","역사"};
		int[] score=new int[sub.length];
		
		while(true) {
			System.out.println("학생 정보를 입력해주세요.");
			System.out.print("성명: ");
			String name=scan1.nextLine();
			System.out.print("학번: ");
			int stuId=scan2.nextInt();
			System.out.println("학생 성적을 입력해주세요.");
			for(int i=0; i<sub.length; i++) {
				System.out.print(sub[i]+": ");
				score[i]=scan2.nextInt();
			}
			
			Student s=new Student(name, stuId, score[0], score[1], score[2], score[3], score[4]);
			studentArrList.add(s);	//추가
			
			System.out.print("다음 학생 정보를 계속 입력하시겠습니까? (y/n)");
			String choice=scan1.nextLine();
			if(choice.equals("n") || choice.equals("no")) break;
		}
		
		//화면에 결과를 출력하기 위해서 ScoreView 객체를 생성한다.
		Scoreview view=new Scoreview(studentArrList);
		view.print();
		
		scan1.close();
		scan2.close();
	}

}
