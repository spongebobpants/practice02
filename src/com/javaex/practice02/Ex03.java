package com.javaex.practice02;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[]args) {
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("나이를 입력해주세요 ");
		System.out.print("나이: ");
		age=sc.nextInt();
		if(age>20) {
			System.out.print("\"1번그룹\"");
		}else {
			System.out.print("\"2번그룹\"");
		}System.out.print("입니다 ");
		
		sc.close();
	}

}
//나이를 입력해주세요
//나이: age라는 변수는 정수인데 만약 20보다 크면 
//1번그룹이 출력될 것이고 
//20보다 작은 19,-1,0은 2번 그룹에 추가될 것

