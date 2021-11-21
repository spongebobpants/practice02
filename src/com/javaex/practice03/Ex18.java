package com.javaex.practice03;
import java.util.Scanner;

public class Ex18 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		
		int num=sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=num; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		sc.close();
	}

}
