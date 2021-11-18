package com.javaex.practice;

import java.util.Scanner;

public class Ex16ing {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int num = sc.nextInt();
		
		int fiveea = num/5;//5의배수 개수
		int sum = 0;
		System.out.println("5의배수의 개수 : "+fiveea);
		for(int i=1; i<=fiveea; i++){//배수의 개수를 새는 반복문
			if(num%i==0) {
				sum = sum+i;
				System.out.println("i :"+i);
			}
		}System.out.println("5의배수의 합 :"+sum);
//		sc.close();
		
		

	}

}
