package day03;

import javax.swing.JOptionPane;

public class Quiz03 {
/*
 * �̸� �Է� 
 * ���� �Է� -> jop���� �Է� ����
 * 
 * ~~���� ~~���̱���! -> jop���� ���
 */
	public static void main(String[] args) {
		String name, sAge, msg;
		int age; 
		name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���..");
		sAge = JOptionPane.showInputDialog("���̸� �Է��ϼ���..");
		msg = name+"���� " + sAge+"���̱���!";
		JOptionPane.showMessageDialog(null, msg);
		
		age = Integer.parseInt(sAge);
		
		msg = age >= 20 ? "����": "�̼���"; 
		System.out.println(msg);
	}
}
/*
 * Parse : ���� �м�
 * => ���ڿ�("") -> �ٸ� �ڷ������� ��ȯ
 *  e.g. "10" => 10 ( Integer.parseInt("10") )
 *       "3.14" => 3.14 ( Double.parseDouble("3.14") )
 */












