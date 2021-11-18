package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int num = sc.nextInt();
		
		int ea = num/5;//5의 배수 개수
		int sum = 0;//5의 배수의 합을 넣을 변수
		
		System.out.println("5의배수의 개수: "+ea);
		for(int i=1; i<=ea; i++){//배수의 개수를 새는 반복문
				sum = sum+5*i;//5의 배수의 합에 들어가라
		}System.out.println("5의배수의 합:"+sum);
		
		sc.close();
		
		

	}

}
