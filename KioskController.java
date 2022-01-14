package mvc.controller;

import java.util.Scanner;

import java.util.ArrayList;

import mvc.view.KioskView;
import mvc.vo.OrderMenuVO;

public class KioskController {
	private static int[] price= {3000,5000,3500,5000,4000};
	
	public static void selectMenuPrint() {
		System.out.println("********** ���� �޴� ���� **********");
		System.out.println("1. ������\t2. �̸�\t3. ����\t4. Ƣ��\t5. ���");
		System.out.println("*******************************");
	}
	
	public static void main(String[] args) {
		Scanner scan1= new Scanner(System.in);
		Scanner scan2= new Scanner(System.in);
		ArrayList<OrderMenuVO> orderMenuArrList=new ArrayList<OrderMenuVO>();

		selectMenuPrint();
		int orderNo=1;
		
		//�޴� ����
		while(true) {
			System.out.print("* ������ �޴��� ��ȣ�� �Է����ּ���: ");
			int menuNo=scan2.nextInt();
			System.out.print("* ������ �޴��� ������ �Է����ּ���: ");
			int menuCount=scan2.nextInt();
			
			OrderMenuVO om=new OrderMenuVO(orderNo, menuNo, price[menuNo-1],menuCount);
			
			orderMenuArrList.add(om);
			
			System.out.println("* �޴��� ��� �����Ͻðڽ��ϱ�?(y/n)");
			String msg=scan1.nextLine();
			if(msg.equals("n") || msg.equals("no")) break;
		}
		
		//��ü �ֹ� ���� ���
		KioskView view= new KioskView(orderMenuArrList);
		view.print();
		
		//���� �� �ֹ� �Ϸ� ȭ�� ���
		System.out.println("***********************************");
		System.out.println(orderNo+"�� ������ ���� �� �ֹ��� �Ϸ�Ǿ����ϴ�.");
		System.out.println("***********************************");
		scan1.close();
		scan2.close();
	}

}
