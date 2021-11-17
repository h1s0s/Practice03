package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int y=num; y>0; y--,num--) {
			System.out.print("*");
			for(int x=num-1;x>0; x-- ) {
				System.out.print("*");
			}System.out.println("");
			
		}
		
		sc.close();
	}

}
