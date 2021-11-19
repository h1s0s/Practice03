package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int num2 = num;
		for(int y=num; y>0; y--,num--) {
			System.out.print("*");
			for(int x=num-1;x>0; x-- ) {
				System.out.print("*");
			}System.out.println("");
		}for(int y=0; y<=num2; y++) {
			System.out.print("*");	
			for(int x=1; x<y; x++ ) {
				System.out.print("*");
			}System.out.println("");
		
		sc.close();
	}

}

}
