package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// 막힌문제
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println("결과값:");
		}
		
		sc.close();
	}

}
