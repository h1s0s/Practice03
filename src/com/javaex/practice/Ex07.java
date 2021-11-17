package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//막힌 문제
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		int num2 = 1;
		for(int y=0; y<=num; y++) {
			for(int x=0; x<=y; x++) {
				System.out.print(num2);
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
