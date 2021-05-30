package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*100) +1;
		System.out.println("===============================");
		System.out.println("     [숫자맞추기게임 시작]     ");
		System.out.println("===============================");
		
		
			while(true) {
				System.out.print(">>");
				int iNum = sc.nextInt();
				 
				if (iNum<num) {
					System.out.println("더 높게");
				} else if(iNum>num) {
					System.out.println("더 낮게");
				} else {
				System.out.println("맞았숩니다");
				System.out.print("게임을 종료하겠습니까? (y/n) >>");
					String eInput = sc.nextLine();
					
					if(eInput=="y") { 
						System.out.println("===============================");
						System.out.println("     [숫자맞추기게임 종료]     ");
						System.out.println("===============================");
						break;
					} else {
						continue;
					}
				
				}
			}
		sc.close();
	}
}
