package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		//막힌문제.. 이걸 반복문으로??
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = 0;
		for(int i=1; i<6; i++) {
			System.out.print("숫자: ");
			int push = sc.nextInt();
			if (push<num) {//입력한 숫자가 크면
				//아무것도 없이 종료.
			} else if(push>=num) {//입력한 숫자가 작으면
				num = push;
				
			}
		}System.out.println("최대값은 " + num + " 입니다.");

		sc.close();
			
		}
		
		

	}


