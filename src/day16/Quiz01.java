package day16;
import java.util.*; 
/*
 * Student Ŭ���� 
 *  �ʵ� : �̸�, ��, ��, ��, �� ( private )
 *  �޼ҵ� : 
 *   1. getters, setters(���� : 0 ~100 �� �ƴϸ� 0��ó��)
 *  	�����, ���� => ��, �� ������ ��� (�ܺο��� �ǵ帱 �� ����)
 *   2. ������ 
 *   	�� �⺻ ������
 *   	�� �̸�, ��, �� �ְ� ������ ������
 *   3. toString() �������̵� 
 *   	�� �̸�, ���, ���� ������
 */
class Student {
	private String name;
	private int kr, en;
	private double avg;
	private char grade;
	
	// ������ 
	public Student(){} 
	public Student(String name, int kr, int en){
		setName(name);
		setKr(kr);
		setEn(en);
	}
	
	// getters
	public String getName(){
		return name;
	}
	public int getKr(){
		return kr;
	}
	public int getEn(){
		return en;
	}
	public double getAvg(){
		return avg;
	}
	public char getGrade(){
		return grade;
	}
	
	// setters
	public void setName(String name){
		this.name = name;
	}
	public void setKr(int kr){
		this.kr = (kr >= 0 && kr <= 100)? kr : 0;
		setAvg();
	}
	public void setEn(int en){
		this.en = (en >= 0 && en <= 100)? en : 0;
		setAvg();
	}
	private void setAvg(){
		avg = (kr+en)/2.0;
		setGrade(); 
	}
	private void setGrade(){
		if(avg>=90) grade = 'A';
		else if(avg>=80) grade = 'B';
		else if(avg>=70) grade = 'C';
		else if(avg>=60) grade = 'D';
		else grade = 'F';
	}
	
	// toString
	public String toString(){
		return name + "/" + avg + "��/" + grade;
	}
}
 /*   
 * Quiz01 Ŭ���� 
 *  HashMap ��ü ����
 *  �޴� : 
 *  	1. �л� ���
 *  	2. ��� ���� 
 *  	3. �̸� �˻� -> �̸� �Է� , �� �л��� ���� ��� 
 *  	4. �л� ���� -> �̸� �Է� , �� �л��� ����
 *  	5. �л� ���� -> �̸� �Է� , ���� ���Է�
 *  	6. ����
 */
public class Quiz01 {
	public static void main(String[] args) {
		HashMap<String, Student> m;
		m = new HashMap<String, Student>();
		String menu = "1. �л� ���\n"
					+ "2. ��� ����\n"
					+ "3. �л� �˻�\n"
					+ "4. �л� ����\n"
					+ "5. �л� ����\n"
					+ "6. ����\n";
		int select;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println(menu);
			System.out.print("�Է� : ");
			select = sc.nextInt();
			if(select==1){
				String name;
				int kr,en;
				System.out.print("�̸� : ");
				name = sc.next();
				System.out.print("���� ���� : ");
				kr = sc.nextInt();
				System.out.print("���� ���� : ");
				en = sc.nextInt();
				m.put(name, new Student(name, kr, en)); 
				System.out.println("��� �Ϸ�!");
			} else if(select==2){
				Set<String> keys = m.keySet();
				System.out.println("====�л� ����Ʈ====");
				for(String name:keys){
					System.out.println(m.get(name));
				}
				System.out.println("==================");
			} else if(select==3){
				String name;
				System.out.print("ã���� �л� �̸� : ");
				name = sc.next();
				if(m.containsKey(name)){
					System.out.println(m.get(name));
				} else {
					System.out.println("�˻� ��� ����.");
				}
			} else if(select==4){
				String name;
				System.out.print("�����Ͻ� �л� �̸� : ");
				name = sc.next();
				if(m.containsKey(name)){
					m.remove(name); 
					System.out.println("���� �Ϸ�.");
				} else {
					System.out.println("�˻� ��� ����.");
				}
			} else if(select==5){
				String name;
				System.out.print("�����Ͻ� �л� �̸� : ");
				name = sc.next();
				if(m.containsKey(name)){
					int kr, en;
					System.out.print("���� ���� : ");
					kr = sc.nextInt();
					System.out.print("���� ���� : ");
					en = sc.nextInt();
					Student s = m.get(name);
					s.setKr(kr);
					s.setEn(en);
					System.out.println("���� �Ϸ�!");
				} else {
					System.out.println("�˻� ��� ����.");
				}
			} else if(select==6){
				System.out.println("���α׷� ����");
				return;
			} else {
				System.out.println("�߸� �Է�");
			}
			
		}
	}
}








