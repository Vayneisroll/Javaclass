package day04;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// 나이를 입력 받고 
		int age; 
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 : ");
		age = sc.nextInt();
		
		// 성인/미성년자 판별
		if(age >= 20){ 
			System.out.println("성인"); 
		} else { // 그렇지 않으면(위의 짝꿍 if의 조건이 false면)
			System.out.println("미성년자");
		}
		
		if(age <= 7) System.out.println("미취학아동");
		else if(age <= 13) System.out.println("초등학생");
		else if(age <= 16) System.out.println("중학생");
		else if(age <= 19) System.out.println("고등학생");
		else System.out.println("해당사항 없음");
	}
}


