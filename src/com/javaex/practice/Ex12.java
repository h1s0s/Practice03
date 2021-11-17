package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// 너무 어려움.. 풀다 막힘
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		for(int i=1, e=0; i<=num; i++) {
			if(num%2==0) {//입력한 숫자가 짝수일때.
				e= e+i;
			} else if(num<=0) {//입력한 숫자가 음수거나 0일때.
				System.out.println("음수와 0은 적용할 수 없습니다.");
			} else {//입력한 숫자가 홀수일때.
				
			}
				e = i;
			System.out.println("결과값"+e);
		}
		
		
		sc.close();
	}

}
