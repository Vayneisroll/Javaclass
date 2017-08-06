package day08;

import javax.swing.JOptionPane;

/*
 * Student Ŭ���� ����(�����)
 *  �ʵ� : �̸�, ����, ����, ����, ���, ���
 *  �޼ҵ� : 
 *  	1) ��� ������ String���·� return�ϴ� getData()
 *  	2) �����͵��� ���ڰ�(���)�� �޾Ƽ�, �̵��� �� �ʵ忡 �����ϴ� 
 *         setData()
 *      3) ����� ���ϴ� setAvg()
 *      4) ����� ����Ͽ� '���'�ʵ忡 �����ϴ� setGrade()
 *         ����� ������ A, B, C, D, F �� ���
 */
class Student{
	String name;
	int kr, en, ma;
	double avg;
	char grade;
	
//	1) ��� ������ String���·� return�ϴ� getData()
	String getData(){
		return "�̸�:" +name + "\n"
				+"��/��/�� : " + kr + "/" + en + "/" + ma + "\n"
				+"��� : " + avg + "�� \n"
				+"��� : " + grade;
	}	
//	2)�����͵��� ���ڰ�(���)�� �޾Ƽ�, �̵��� �� �ʵ忡 �����ϴ� setData()
	void setKr(int k) { 
		kr = k;
		setAvg();
	}
	void setEn(int e) { 
		en = e;
		setAvg();
	}
	void setMa(int m) { 
		ma = m;
		setAvg();
	}
	void setData(String n, int k, int e, int m){
		name = n;
		setKr(k);
		setEn(e);
		setMa(m);
	}
//	3) ����� ���ϴ� setAvg()
	void setAvg(){
		avg = (kr+en+ma)/3.0;
		setGrade();
	}
	
//	4) ����� ����Ͽ� '���'�ʵ忡 �����ϴ� setGrade()
	void setGrade(){
		if(avg>=90) grade= 'A';
		else if(avg>=80) grade= 'B';
		else if(avg>=70) grade= 'C';
		else if(avg>=60) grade= 'D';
		else grade = 'F';
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		// ��ü �����Ͽ� �� �޼ҵ带 �׽�Ʈ 
		Student[] s = { new Student(),new Student(),new Student()};
		
		String name, sKr, sEn, sMa;
		int kr, en, ma;
		
		for(int i = 0; i<s.length; i++){
			name = JOptionPane.showInputDialog(i + 1+"�� �л� �̸�");
			sKr = JOptionPane.showInputDialog("���� ������ �Է��ϼ���..");
			kr = Integer.parseInt(sKr);
			sEn = JOptionPane.showInputDialog("���� ������ �Է��ϼ���..");
			en = Integer.parseInt(sEn);
			sMa = JOptionPane.showInputDialog("���� ������ �Է��ϼ���..");
			ma = Integer.parseInt(sMa);
			s[i].setData(name, kr, en, ma);
		}
		
		String msg = "====�л� ����====\n";
		for(Student ss: s){
			msg += ss.getData() + "\n"
				    +"=================\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}
}














