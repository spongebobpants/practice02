package com.javaex.practice02;
import java.util.Scanner;

public class Ex09 {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("첫번째 숫자: ");
	int one=sc.nextInt();
	System.out.print("두번째 숫자: ");
	int two=sc.nextInt();
	
	if(one>two) {
		if(one%two==0) {
			System.out.println(two+"는(은)"+one+"의 약수다 ");
		}else{
			System.out.println(two+"는(은)"+one+"의 약수가 아니다 ");
		}
		
	}else if(one<two){
		if(two%one==0) {
			System.out.println(one+"는(은)"+two+"의 약수다 ");
	}else {
		System.out.println(one+"는(은)"+two+"의 약수가 아니다 ");
	}

		sc.close();
	}

}
}
