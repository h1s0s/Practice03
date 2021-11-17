package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("while문");
		int index = 0;//초기화
		while(index<3) {//index가 0보다 작을때 반복. 3번 반복됨이 예상됨.
			System.out.println("index=" + index);
			index++;//증감식
		}
		System.out.println("for문");
		for(int order=0; order<3; order++) {
			System.out.println("order=" + order);
		}
	}

}
//결과 예상
	//while문
	//index=0
	//index=1
	//index=2
	//for문
	//order=0
	//order=1
	//order=2