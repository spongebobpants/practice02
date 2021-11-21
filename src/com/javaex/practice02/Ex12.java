package com.javaex.practice02;
import java.util.Scanner;

public class Ex12 {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("출력되는 내용을 입력하세요 ");
	
	System.out.print("기호:"); //key
	String key=sc.nextLine();
	
	System.out.print("숫자1:"); //num1
	int n1=sc.nextInt();
	
	System.out.print("숫자2:"); //num2
	int n2=sc.nextInt();
	
	if(key=="+") {
		System.out.println("결과는: "+(n1+n2));
	}else if(key=="-") {
		System.out.println("결과는: "+(n1-n2));
	}else if(key=="*") {
		System.out.println("결과는: "+(n1*n2));
	}else if(key=="/") {
		System.out.println("결과는: "+(n1/n2));
	}else {
		System.out.println("계산할 수 없는 기호입니다 ");
	}
	
	
	
	sc.close();
	}
}