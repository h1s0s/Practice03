package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//다시 복습하기!!
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for(int y=1; y<=num; y++) {
			for(int x=0; x<y; x++) {
				System.out.print(y);
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
