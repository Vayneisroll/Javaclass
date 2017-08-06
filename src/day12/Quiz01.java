package day12;

import javax.swing.JOptionPane;

/*
 * �θ�Ŭ���� : Shape
 */
abstract class Shape{
	abstract double getArea();
}
 /* 
 * �ڽ�Ŭ���� : 
 * 1) Circle 
 * 	�ʵ� : radius
 *  �޼ҵ� : 
 *  	1) ������ : ������ �ְ� ����
 *  	2) getArea() : �ʵ�� ������ �ִ� �������� ����Ͽ� ���� ���� ���� return
 */
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	double getArea() {
		return radius * radius * Math.PI;
	}
}
 /*  
 * 2) Rectangle
 *  �ʵ� : base, height;
 *  �޼ҵ� : 
 *  	1) ������ : �غ�, ���� �ְ� ���� 
 *  	2) getArea() : base, height �ʵ�� �簢�� ���� ���ؼ� return
 */
class Rectangle extends Shape{
	double base, height;
	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	@Override
	double getArea() {
		return base * height;
	}
}
 /*  
 * 3) Triangle
 * 	�ʵ� : base, height;
 * 		1) ������ : �غ�, ���� �ְ� ���� 
 *  	2) getArea() : base, height �ʵ�� �ﰢ�� ���� ���ؼ� return
 */
class Triangle extends Shape{
	double base, height;
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	@Override
	double getArea() {
		return base * height * 0.5;
	}
}
 /* 
 * 
 * ���� Ŭ���� : Quiz01
 *  �޴� : 
 *  	1. ���� ���� -> �������� �Է� �ް�, ���� �˷��� 
 *   	2. �簢���� ����  -> �غ�, ���� �Է� �ް�, ���� �˷���
 *   	3. �ﰢ���� ����  -> �غ�, ���� �Է� �ް�, ���� �˷���
 *   	4. ����
 */


public class Quiz01 {
	public static void main(String[] args) {
		Shape sh = null;
		String message = "1. ���� ���� \n"
						+ "2. �簢�� ���� \n"
						+ "3. �ﰢ�� ����\n"
						+ "4. �����ϱ�";
		String select;
		while(true){
			select = JOptionPane.showInputDialog(message);
			if(select.equals("1")){
				String sRadius = JOptionPane.showInputDialog("������");
				double radius = Double.parseDouble(sRadius);
				sh = new Circle(radius);
				JOptionPane.showMessageDialog(null, "���� ���� : " + sh.getArea());
			} else if(select.equals("2")){
				double base, height;
				String sData;
				sData = JOptionPane.showInputDialog("�غ�");
				base = Double.parseDouble(sData);
				sData = JOptionPane.showInputDialog("����");
				height = Double.parseDouble(sData);
				
				sh = new Rectangle(base, height);
				JOptionPane.showMessageDialog(null, "�簢���� ���� : " + sh.getArea());
			} else if(select.equals("3")){
				double base, height;
				String sData;
				sData = JOptionPane.showInputDialog("�غ�");
				base = Double.parseDouble(sData);
				sData = JOptionPane.showInputDialog("����");
				height = Double.parseDouble(sData);
				
				sh = new Triangle(base, height);
				JOptionPane.showMessageDialog(null, "�簢���� ���� : " + sh.getArea());
			} else if(select.equals("4")){
				return;
			}
		}
	}
}





