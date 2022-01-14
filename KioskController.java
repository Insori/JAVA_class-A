package mvc.controller;

import java.util.Scanner;

import java.util.ArrayList;

import mvc.view.KioskView;
import mvc.vo.OrderMenuVO;

public class KioskController {
	private static int[] price= {3000,5000,3500,5000,4000};
	
	public static void selectMenuPrint() {
		System.out.println("********** 선택 메뉴 종류 **********");
		System.out.println("1. 떡볶이\t2. 쫄면\t3. 순대\t4. 튀김\t5. 김밥");
		System.out.println("*******************************");
	}
	
	public static void main(String[] args) {
		Scanner scan1= new Scanner(System.in);
		Scanner scan2= new Scanner(System.in);
		ArrayList<OrderMenuVO> orderMenuArrList=new ArrayList<OrderMenuVO>();

		selectMenuPrint();
		int orderNo=1;
		
		//메뉴 선택
		while(true) {
			System.out.print("* 선택한 메뉴의 번호를 입력해주세요: ");
			int menuNo=scan2.nextInt();
			System.out.print("* 선택한 메뉴의 개수를 입력해주세요: ");
			int menuCount=scan2.nextInt();
			
			OrderMenuVO om=new OrderMenuVO(orderNo, menuNo, price[menuNo-1],menuCount);
			
			orderMenuArrList.add(om);
			
			System.out.println("* 메뉴를 계속 선택하시겠습니까?(y/n)");
			String msg=scan1.nextLine();
			if(msg.equals("n") || msg.equals("no")) break;
		}
		
		//전체 주문 내역 출력
		KioskView view= new KioskView(orderMenuArrList);
		view.print();
		
		//결제 및 주문 완료 화면 출력
		System.out.println("***********************************");
		System.out.println(orderNo+"번 고객님의 결제 및 주문이 완료되었습니다.");
		System.out.println("***********************************");
		scan1.close();
		scan2.close();
	}

}
