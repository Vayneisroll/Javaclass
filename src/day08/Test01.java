package day08;

import javax.swing.JOptionPane;

public class Test01 {
	
	public static void main(String[] args) {
		
		Pokemon p1, p2;
		p1 = new Pokemon();
		p2 = new Pokemon();
		
		p1.setData("��ī��", 10, 100, 200);
		p2.setData("���α�", 11, 110, 180);
		
		// ��ī�� ���α⸦ ����!
		p1.fight(p2);
		
		// ���αⰡ ��ī�� ����! 
		p2.fight(p1);
		
		// ��ī�� ������ sysout����..
		System.out.println("====" + p1.name +"�� ����====\n");
		p1.showData();
		
		// ���α� ������ jop����..
		JOptionPane.showMessageDialog(null, p2.getData());
		System.out.println(p2.getData());
	}
}




