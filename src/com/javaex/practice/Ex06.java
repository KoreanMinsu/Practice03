package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {
		
		int i = 1;
		while(true) {
			
			if (i%5==0 && i%7==0) {
				System.out.println(i);
				
			}
		i++;	
			
			if (i==100) {
				break;
			}
		}
		
	}
}
