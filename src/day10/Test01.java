package day10;

import day10_2.Person;
import day10_2.*; // day10_2��Ű���� '���' Ŭ������ �������ڴ� 

public class Test01 {
	public static void main(String[] args) {
		// �ܺ� ��Ű���� �ִ� Ŭ������ ���� ���� ��� 
		// 1. ��Ű����.Ŭ������
		day10_2.Person p = new day10_2.Person();
		
		// 2. import ���� ���
		Person pp = new Person();
		//pp.name = "��ī��"; 
		
		pp.setName("��ī��");
		pp.setAge(-10);
		pp.setPhone("010-1111-2222");
		
		System.out.println(pp.getName());
		System.out.println(pp.getAge());
		System.out.println(pp.getPhone());
	}
}
/*
 * < ����������(access modifier) > 
 * - ���� ������ �����ϴ� Ű���� 
 * 1. public : ��� ���� ����(�� �����ְڴ�!)
 * 2. protected : �ٸ� ��Ű�����Դ� �������� ������, 
 * 				  �ڽ�Ŭ������� �����ְڴ�. 
 * 3.        : default����������
 * 			     ���� ��Ű�� O / �ٸ� ��Ű�� X
 * 4. private : Ŭ���� �ȿ����� ���� ���� 
 * 				(���� ���ž�!)
 * - ����ȭ : ������ȣ, �ʿ��� ������ �����ϰڴ�!
 * - ĸ��ȭ : ��ȣ��(getter, setter)���� �ʵ��� ���Ἲ ����
 * 
 * ** �ʵ�(�������)�� ������ private���� ����
 * ** �޼ҵ�� ������ public���� ����
 * 
 */










