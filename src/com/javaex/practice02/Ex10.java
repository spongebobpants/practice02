package com.javaex.practice02;
import java.util.Scanner;

public class Ex10 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("사변(정수)를 입력해주세요 ");
		System.out.print("사변: ");
		int code=sc.nextInt();
		if(code%3==0) {
			System.out.println("A팀입니다 ");
		}else if(code%3==1) {
			System.out.println("B팀입니다 ");
		}else if(code%3==2) {
			System.out.println("C팀입니다 ");
		}else {
			System.out.println("잘못 입력하셨습니다 ");
		}

		sc.close();
	}

}
