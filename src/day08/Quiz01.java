package day08;

import javax.swing.JOptionPane;

/*
 * Student 클래스 정의(만들기)
 *  필드 : 이름, 국어, 영어, 수학, 등급, 평균
 *  메소드 : 
 *  	1) 모든 정보를 String형태로 return하는 getData()
 *  	2) 데이터들을 인자값(재료)로 받아서, 이들을 각 필드에 세팅하는 
 *         setData()
 *      3) 평균을 구하는 setAvg()
 *      4) 등급을 계산하여 '등급'필드에 저장하는 setGrade()
 *         평균을 가지고 A, B, C, D, F 를 계산
 */
class Student{
	String name;
	int kr, en, ma;
	double avg;
	char grade;
	
//	1) 모든 정보를 String형태로 return하는 getData()
	String getData(){
		return "이름:" +name + "\n"
				+"국/영/수 : " + kr + "/" + en + "/" + ma + "\n"
				+"평균 : " + avg + "점 \n"
				+"등급 : " + grade;
	}	
//	2)데이터들을 인자값(재료)로 받아서, 이들을 각 필드에 세팅하는 setData()
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
//	3) 평균을 구하는 setAvg()
	void setAvg(){
		avg = (kr+en+ma)/3.0;
		setGrade();
	}
	
//	4) 등급을 계산하여 '등급'필드에 저장하는 setGrade()
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
		// 객체 생성하여 각 메소드를 테스트 
		Student[] s = { new Student(),new Student(),new Student()};
		
		String name, sKr, sEn, sMa;
		int kr, en, ma;
		
		for(int i = 0; i<s.length; i++){
			name = JOptionPane.showInputDialog(i + 1+"번 학생 이름");
			sKr = JOptionPane.showInputDialog("국어 점수를 입력하세요..");
			kr = Integer.parseInt(sKr);
			sEn = JOptionPane.showInputDialog("영어 점수를 입력하세요..");
			en = Integer.parseInt(sEn);
			sMa = JOptionPane.showInputDialog("수학 점수를 입력하세요..");
			ma = Integer.parseInt(sMa);
			s[i].setData(name, kr, en, ma);
		}
		
		String msg = "====학생 정보====\n";
		for(Student ss: s){
			msg += ss.getData() + "\n"
				    +"=================\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}
}














