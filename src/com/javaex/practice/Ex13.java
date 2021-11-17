package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요:");
		int num = sc.nextInt();
		int num2 = 0;
		for(int i=0; i<=num; i++) {
			num2 = num2+i;
		}
		System.out.println(num2);
		
		sc.close();
	}

}
