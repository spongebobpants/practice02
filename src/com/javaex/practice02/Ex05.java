package com.javaex.practice02;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요 ");
		System.out.print("키: ");
		int height=sc.nextInt();
		System.out.print("몸무게: ");
		int weight=sc.nextInt();
		
		if((height-100)*0.9==weight) {
			System.out.println("표준체중입니다.");
			System.out.println("표준체중:"+(height-100)*0.9);
		}else if((height-100)*0.9>weight){
			System.out.println("저체중입니다.");
			System.out.println("표준체중:"+(height-100)*0.9);
		}else {
			System.out.println("과체중입니다.");
			System.out.println("표준체중:"+(height-100)*0.9);
		}
		
		
		
		
		sc.close();
		
	}

}
