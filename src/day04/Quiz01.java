package day04;

import javax.swing.JOptionPane;

public class Quiz01 {
/*
 *  JOP�� Ȱ���Ͽ� ��/��/���� �Է� �ް� 
 *  ����� ���ϼ���.
 *  ���ǿ�����(?������)�� Ȱ���Ͽ� 60�̻��̸� �հ�/���հ�
 *  �� ��������� �Բ� jop���� ����ϼ���.
 */
	public static void main(String[] args) {
		
		String sKr, sEn, sMa;
		int kr, en, ma;
		double avg;
		String msg;
		
		sKr = JOptionPane.showInputDialog("����");
		sEn = JOptionPane.showInputDialog("����");
		sMa = JOptionPane.showInputDialog("����");
		kr = Integer.parseInt(sKr);
		en = Integer.parseInt(sEn);
		ma = Integer.parseInt(sMa);
		avg = (kr+en+ma) / 3.0;
		msg = "��� " + avg + "������, ";
		msg += (avg>=60) ? "�հ�" : "���հ�";
		JOptionPane.showMessageDialog(null, msg);
	}
}







