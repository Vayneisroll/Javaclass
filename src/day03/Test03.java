package day03;

import javax.swing.JOptionPane;

/*
 * JOptionPane : â���� ���
 * jop -> �ڵ��ϼ� + enter 
 * 
 *  1) showin : �޼��� + �ؽ�Ʈ �Է�
 *    => �Է� ���� �ؽ�Ʈ�� �� �ڵ� �ڸ��� ���ƿ�
 *    => �Է� ���� ������ String Ÿ��   
 *  
 *  2) showm : �޼���
 *   => ù ���� ������ null ������ ��
 *   => �� ��° ���� ���� ���� ���� �޼���
 */
public class Test03 {
	public static void main(String[] args) {
		String s;
		s = JOptionPane.showInputDialog("���� �Է��غ���..");
		System.out.println(s);
		
		JOptionPane.showMessageDialog(null, "�޷ո޷�");
	}
}





