package com.javaex.practice02;
import java.util.Scanner;

public class Ex06 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요 ");
		
		System.out.print("숫자1: ");
		int n1=sc.nextInt();
		System.out.print("숫자2: ");
		int n2=sc.nextInt();
		
		if(n1>n2) {
			System.out.print("큰 수: "+n1+"입니다.");
			System.out.print("작은 수: "+n2+"입니다.");
		}else{
			System.out.print("큰 수: "+n2+"입니다.");
			System.out.print("작은 수: "+n1+"입니다.");
		}
		
		sc.close();
	}

}
