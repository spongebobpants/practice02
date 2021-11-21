package com.javaex.practice03;
import java.util.Scanner;

public class Ex15 {
	public static void main(String []args) {
		
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int a; //n->입력값/a->나누는 값 
	
	System.out.println("숫자를 입력하세요 : ");
	
	for(a=1; a<=num; a++){
		if((num%a)==0){
		System.out.println(a);
		}
		sc.close();
	}
	}
}

