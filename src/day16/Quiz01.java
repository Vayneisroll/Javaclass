package day16;
import java.util.*; 
/*
 * Student 클래스 
 *  필드 : 이름, 국, 영, 평, 학 ( private )
 *  메소드 : 
 *   1. getters, setters(점수 : 0 ~100 이 아니면 0점처리)
 *  	ㄴ평균, 학점 => 국, 영 가지고 계산 (외부에서 건드릴 수 없음)
 *   2. 생성자 
 *   	ㄴ 기본 생성자
 *   	ㄴ 이름, 국, 영 넣고 생성할 생성자
 *   3. toString() 오버라이드 
 *   	ㄴ 이름, 평균, 학점 보여줌
 */
class Student {
	private String name;
	private int kr, en;
	private double avg;
	private char grade;
	
	// 생성자 
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
		return name + "/" + avg + "점/" + grade;
	}
}
 /*   
 * Quiz01 클래스 
 *  HashMap 객체 생성
 *  메뉴 : 
 *  	1. 학생 등록
 *  	2. 모두 보기 
 *  	3. 이름 검색 -> 이름 입력 , 그 학생의 정보 출력 
 *  	4. 학생 삭제 -> 이름 입력 , 그 학생을 삭제
 *  	5. 학생 수정 -> 이름 입력 , 점수 재입력
 *  	6. 종료
 */
public class Quiz01 {
	public static void main(String[] args) {
		HashMap<String, Student> m;
		m = new HashMap<String, Student>();
		String menu = "1. 학생 등록\n"
					+ "2. 모두 보기\n"
					+ "3. 학생 검색\n"
					+ "4. 학생 삭제\n"
					+ "5. 학생 수정\n"
					+ "6. 종료\n";
		int select;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println(menu);
			System.out.print("입력 : ");
			select = sc.nextInt();
			if(select==1){
				String name;
				int kr,en;
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("국어 점수 : ");
				kr = sc.nextInt();
				System.out.print("영어 점수 : ");
				en = sc.nextInt();
				m.put(name, new Student(name, kr, en)); 
				System.out.println("등록 완료!");
			} else if(select==2){
				Set<String> keys = m.keySet();
				System.out.println("====학생 리스트====");
				for(String name:keys){
					System.out.println(m.get(name));
				}
				System.out.println("==================");
			} else if(select==3){
				String name;
				System.out.print("찾으실 학생 이름 : ");
				name = sc.next();
				if(m.containsKey(name)){
					System.out.println(m.get(name));
				} else {
					System.out.println("검색 결과 없음.");
				}
			} else if(select==4){
				String name;
				System.out.print("삭제하실 학생 이름 : ");
				name = sc.next();
				if(m.containsKey(name)){
					m.remove(name); 
					System.out.println("삭제 완료.");
				} else {
					System.out.println("검색 결과 없음.");
				}
			} else if(select==5){
				String name;
				System.out.print("수정하실 학생 이름 : ");
				name = sc.next();
				if(m.containsKey(name)){
					int kr, en;
					System.out.print("국어 점수 : ");
					kr = sc.nextInt();
					System.out.print("영어 점수 : ");
					en = sc.nextInt();
					Student s = m.get(name);
					s.setKr(kr);
					s.setEn(en);
					System.out.println("수정 완료!");
				} else {
					System.out.println("검색 결과 없음.");
				}
			} else if(select==6){
				System.out.println("프로그램 종료");
				return;
			} else {
				System.out.println("잘못 입력");
			}
			
		}
	}
}








