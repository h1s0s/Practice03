package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		//1에서 100까지 수에서 5의 배수 이면서 7의 배수인 수를 출력하세요
		int i=0;
		while(true) {
			
			i++;
			
			if(i%5==0 && i%7==0) {
				System.out.println(i);
				break;
			}
			
		}

	}

}
