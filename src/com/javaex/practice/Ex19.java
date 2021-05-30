package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {

		int dMoney;
		int wMoney;
		int balance = 0;
		int num;

		Scanner sc = new Scanner(System.in);
		boolean action = true;

		while (action) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			num = sc.nextInt();

			
			/* if (num == 1) {
				System.out.print("예금액>");
				dMoney = sc.nextInt();
				balance = balance + dMoney;
			} else if (num == 2) {
				System.out.print("출금액>");
				wMoney = sc.nextInt();
				balance = balance - wMoney;
			} else if (num == 3) {
				System.out.print("잔고액>");
				System.out.println(balance);
			} else {
				System.out.println("다시입력해주쇼");

			}

			if (num == 4) {
				System.out.println("프로그램종료");
				break;

			}	
			*/
			
			switch(num) {
			
				case 1 :
					System.out.print("예금액>");
					dMoney = sc.nextInt();
					balance = balance + dMoney;
					break;
			
			
				case 2 : 
					System.out.print("출금액>");
					wMoney = sc.nextInt();
					balance = balance - wMoney;
					break;
		
				case 3: 
					System.out.print("잔고액>");
					System.out.println(balance);
					break;
					
					
				default : 
					System.out.println("다시입력해주쇼");
					break;
			}	
			
			
		
		}
		sc.close();
	}
}
