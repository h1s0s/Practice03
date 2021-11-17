package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int num = sc.nextInt();
		int num2 = 0;
		for(int i=1; i<=num; i++) {
			System.out.print(i);
			num2 = num2+i;
			if(i<num) {//마지막 숫자외에 숫자 뒤에 +를 붙여줌.
				System.out.print("+");
			}
		}
		
		System.out.println("\n"+"합계:"+num2);
		
		sc.close();
	}

}
