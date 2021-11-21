package com.javaex.practice03;
import java.util.Scanner;

public class Ex17 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println("");
		sc.close();
	}

}
}
