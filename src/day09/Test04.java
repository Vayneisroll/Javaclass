package day09;
/*
 * static : ������, ������ 
 *  1) ������ ��������� => ��ü ���� ���ص� �ȴ�
 *  2) 1���� ��������� => ���� Ÿ���� ��ü�� 1���� �����Ѵ�
 * => �޼ҵ�, ������� (���)�� ���� 
 */

import javax.swing.JOptionPane;

class Circle {
	static double getArea(double r){
		return r * r * 3.14; // Math.PI
	}
}
public class Test04 {
	public static void main(String[] args) {
		
		// �޼ҵ带 ����Ϸ��� �ݵ�� ��ü ������ �ؾ��ߴ�. 
		System.out.println(Math.random());
		JOptionPane.showInputDialog("asd");
		
		// ����� �� �տ� static�� ���� �޼ҵ�/��������� 
		// ��ü������ ���� �ʾƵ� ��밡��
		// (�̹� ������ �� �̸� ��������⶧��)
		System.out.println(Circle.getArea(10));
		// static ��� ȣ�� : Ŭ������.�����
		Circle c = new Circle();
		System.out.println(c.getArea(10));
	}
}




