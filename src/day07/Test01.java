package day07;

public class Test01 {
	public static void main(String[] args) {
		// Student 3ĭ¥�� ��ü�� ����ڴ�
		Student[] st = new Student[3];
		// ��ü�� 3�� ����ٴ°� �ƴ϶�..
		// �޸��� 3�� ����� ����
		st[0] = new Student();
		st[1] = new Student();
		st[2] = new Student();
		
		st[0].name = "��ī��";
		st[0].point = 100;
		st[0].grade = 'A';
		
		st[1].name = "������";
		st[1].point = 80;
		st[1].grade = 'B';
		
		st[2].name = "���̸�";
		st[2].point = 70;
		st[2].grade = 'C';
		
		for(Student element:st){
			element.name = "���ϸ�"; 
		}
		
		for(int i = 0; i<st.length; i++){
			st[i].showData();
		}
	}
}








