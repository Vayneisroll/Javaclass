package day04;

import java.util.Scanner;

public class Quiz03 {
/*
 * 월 입력 => 날짜 수 출력 
 * e.g. 4 => 30일까지 있습니다!
 *      1 => 31일까지 있습니다!
 * 1, 3, 5, 7, 8, 10, 12 : 31일
 * 2 : 28일
 * 4, 6, 9, 11 : 30일
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, date;
		System.out.print("월 : ");
		month = sc.nextInt();
		switch(month){
		case 1: case 3: case 5: 
		case 7: case 8: case 10: case 12:
			date = 31;
			break;
		case 2:
			date = 28;
			break;
		case 4: case 6: case 9: case 11:
			date = 30;
			break;
		default: 
			date = 0; 
			System.out.println("잘못 입력..");
		}
		System.out.println(month + "월은 " + date +"일까지 있다.");
	}
}










