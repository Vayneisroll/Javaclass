package day09;

public class Student {
	// �ʵ� : �̸�, ����, ����, ���, ���
	String name;
	int kr, en;
	double avg;
	char grade;
	// �޼ҵ� :
	/*
	 * 1. ������ 
	 *   - �⺻������ 
	 *   - �̸���
	 *   - �̸�, ����, ��� (���, ��� �ڵ� ����)
	 */
	Student(){
	}
	Student(String name){
		this.name = name;
	}
	Student(String name, int kr, int en){
		this(name);
		setKr(kr);
		setEn(en);
	}
	 /*   
	 * 2. ��� ������ sysout���� �����ִ� showData()
	 */
	 void showData(){
		 System.out.println("�̸� : " + name);
		 System.out.println("���� : " + kr + "��");
		 System.out.println("���� : " + en + "��");
		 System.out.println("��� : " + avg + "��");
		 System.out.println("��� : " + grade);
	 }
	 /* 
	 * 3. ��� ���ϴ� setAvg()
	 */
	 void setAvg(){
		 avg = (kr+en)/2.0;
		 setGrade();
	 }
	 /* 
	 * 4. ��� ���ϴ� setGrade() : ABCDF
	 */
	 void setGrade(){
		if(avg>=90) grade = 'A';
		else if(avg>=80) grade = 'B';
		else if(avg>=70) grade = 'C';
		else if(avg>=60) grade = 'D';
		else grade = 'F';
	 }
	 /* 
	 * 5. ��Ÿ �޼ҵ� ����� ������ �� ����ŵ� �˴ϴ�.. 
	 */
	 void setKr(int kr){
		 if(kr < 0 || kr > 100){
			 kr = 0;
		 } else{
			 this.kr = kr;
		 }
		 setAvg();
	 }
	 void setEn(int en){
		 if(en < 0 || en > 100){
			 en = 0;
		 } else{
			 this.en = en;
		 }
		 setAvg();
	 }
}




