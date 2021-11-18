package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int num2 = 1;
		for(int i=1; i<=num; i++) {
			num2 = num2*i;
		}
		
		System.out.println("\n"+"합계:"+num2);
		
		sc.close();
	}

}
