package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int y=1; y<=10; y++) {
			System.out.print(y);
			for(int x=y+1, z=1; z<10; z++, x++) {
				System.out.print("\t"+x);
			}System.out.println("");
		}
	}
}

