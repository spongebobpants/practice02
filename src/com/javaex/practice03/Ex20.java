package com.javaex.practice03;
import java.util.Scanner;
public class Ex20 {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int i=70;
	int num;
	String answer;
	boolean how=true;
	
	while(how) {
		System.out.println("==========================");
		System.out.println("[숫자 맞추기 게임 시작]");
		System.out.println("==========================");
		while(true) {
			System.out.print(">>");
			num=sc.nextInt();
			if(num<i) {
				System.out.println("더 높게 ");
			}else if(num>i) {
				System.out.println("더 낮게 ");
			}else {
				System.out.println("맞았습니다 ");
				break;
				}
			}
			System.out.println("게임을 종료하시겠습니까? (y/n)");
				while(true) {
					answer=sc.next();
					if("y".equals(answer)) {
						how=false;
						break;
					}else if("n".equals(answer)) {
						break;
					}else {
						System.out.println("올바른 글자를 입력해주세요 ");
					}
				}
			}
	System.out.println("=========================");
	System.out.println("[숫자 맞추기 게임 종료]");
	System.out.println("=========================");
	sc.close();
	}
}
