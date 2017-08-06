package day10;
/*
 * final : ������, ������ �� ����
 *  1) Ŭ���� : ����� �� ����
 *  2) �޼ҵ� : �������̵� �� �� ���� (�����ε�� ����)
 *  3) �ʵ�(�������) : ���� ������ �� ���� (����� ����ڴ�!)
 *  
 *  static final : ����� ���� ���
 *   e.g. ���α׷����� ..
 *     ǥ�ش���, Ȳ�ݺ�, ������ �ѷ� ���� �������� �����Ͱ� 
 *     ���ȴٸ�, �̸� static final�� ����
 *   e.g. Math.PI  
 *  => ALL�빮��, ������ _�� ǥ�� 
 *  e.g. MAX_VALUE GOLDEN_RATIO 
 */

class MyMath{
	
	static double pi = 3.14;
	final int a = 100;
	
	
	// �������� ���ڰ�����, ���� ���̸� �����ϴ�
	// getCircleArea() �� static �޼ҵ�� �����ϼ���
	static double getCircleArea(double radius){
		return radius * radius * pi;
	}
	// �������� ���ڰ�����, ���� �ѷ��� �����ϴ�
	// getCircleCircum() �� static �޼ҵ�� �����ϼ���
	static double getCircleCircum(double radius){
		return radius * 2 * 3.14;
	}
	// �غ�, ���̸� ���ڰ�����, 
	// �簢���� ���̸� �����ϴ� 
	// getRectangleArea()�� static �޼ҵ�� �����ϼ���
	static double getRectangleArea(double h, double b){
		return h*b;
	}
}
public class Quiz01 {
	// ���� MyMath�� �޼ҵ���� ������ ȣ��+��� ���
	public static void main(String[] args) {
		System.out.println(MyMath.getCircleArea(10));
		System.out.println(MyMath.getCircleCircum(100));
		System.out.println(MyMath.getRectangleArea(10, 20));
	}
	
}
