package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 83;
		System.out.println("=======================");
		System.out.println("    [숫자맞추기게임 시작]    ");
		System.out.println("=======================");
		while(true) {
			System.out.print(">>");
			int push = sc.nextInt();
			if(push==num) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(1.YES/2.NO) >>");
				int yorn = sc.nextInt();
				if( yorn == 1 ) {
					System.out.println("=======================");
					System.out.println("    [숫자맞추기게임 종료]    ");
					System.out.println("=======================");
					break;
				} else {
					
				}
			} else if(push<num) {
				System.out.println("더 높게");
			} else if(push>num) {
				System.out.println("더 낮게");
			}
		
		}
		sc.close();
	}

}
