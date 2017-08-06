package day03;

import javax.swing.JOptionPane;

public class Quiz03 {
/*
 * 이름 입력 
 * 나이 입력 -> jop으로 입력 받음
 * 
 * ~~님은 ~~살이군요! -> jop으로 출력
 */
	public static void main(String[] args) {
		String name, sAge, msg;
		int age; 
		name = JOptionPane.showInputDialog("이름을 입력하세요..");
		sAge = JOptionPane.showInputDialog("나이를 입력하세요..");
		msg = name+"님은 " + sAge+"살이군요!";
		JOptionPane.showMessageDialog(null, msg);
		
		age = Integer.parseInt(sAge);
		
		msg = age >= 20 ? "성인": "미성년"; 
		System.out.println(msg);
	}
}
/*
 * Parse : 구문 분석
 * => 문자열("") -> 다른 자료형으로 전환
 *  e.g. "10" => 10 ( Integer.parseInt("10") )
 *       "3.14" => 3.14 ( Double.parseDouble("3.14") )
 */












