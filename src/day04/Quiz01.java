package day04;

import javax.swing.JOptionPane;

public class Quiz01 {
/*
 *  JOP을 활용하여 국/영/수를 입력 받고 
 *  평균을 구하세요.
 *  조건연산자(?연산자)를 활용하여 60이상이면 합격/불합격
 *  을 평균점수와 함께 jop으로 출력하세요.
 */
	public static void main(String[] args) {
		
		String sKr, sEn, sMa;
		int kr, en, ma;
		double avg;
		String msg;
		
		sKr = JOptionPane.showInputDialog("국어");
		sEn = JOptionPane.showInputDialog("영어");
		sMa = JOptionPane.showInputDialog("수학");
		kr = Integer.parseInt(sKr);
		en = Integer.parseInt(sEn);
		ma = Integer.parseInt(sMa);
		avg = (kr+en+ma) / 3.0;
		msg = "평균 " + avg + "점으로, ";
		msg += (avg>=60) ? "합격" : "불합격";
		JOptionPane.showMessageDialog(null, msg);
	}
}







