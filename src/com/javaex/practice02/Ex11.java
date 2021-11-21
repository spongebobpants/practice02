package com.javaex.practice02;
import java.util.Scanner;
//switch-case

public class Ex11 {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("알파벳 1글자(소문자)를 입력하세요 ");
	System.out.println("알파벳: ");
	String alph=sc.nextLine();
	switch(alph){
		case "a": case "e": case "i": case "o": case "u":
		System.out.println("모음입니다 ");
		break;
		
		default:
			System.out.println("자음입니다 ");
			break;
		
	}
	sc.close();
	}

}
