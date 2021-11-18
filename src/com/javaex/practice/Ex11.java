package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		//복습하기.. 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();

		int sum = 0;//합을 출력할 변수
		
		if(num%2==0) {//짝수인가
			for(int i=2; i<=num; i=i+2) {
				sum = sum+i;//
			}System.out.println("결과값:"+sum);
		} else if(num==0) { //0인가
			System.out.println("0이 아닌 숫자를 입력해주세요.");
		} else {//홀수인가
			for(int i=1; i<=num; i=i+2) {
				sum = sum+i;//
			}System.out.println("결과값:"+sum);
		}
		
	}
}