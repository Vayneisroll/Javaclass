package day02;
/*
 * < �ڷ���(type) >
 * 1. �����ڷ���(primitive type) => ���� �� ��!
 * 
 *  ���� : byte(1) short(2) int(4) long(8)
 *  �Ǽ� : float(4) double(8)
 *  ���� : char(2) 
 *  �� : boolean(4)
 *  => �� 8��!
 *   
 *  �����ڷ��������� �����ڷ��� ����� �޴� �ڷ��� 1�� ����
 *  String�� => ���ڿ��� 
 *   
 * 2. �����ڷ���(reference type)
 */
public class Test01 {
	public static void main(String[] args){
		System.out.println(10000000000L);//long���� ó���ϼ�
		System.out.println(3.14f); // float���� ó���ϼ�
		
		// 1 1.0 '1' "1" 
		System.out.println(1 + 10); // 11
		System.out.println(1.0 + 10); // 11.0
		System.out.println('1' + 10); // 59
		System.out.println("1" + 10); // 110
	}
}	





