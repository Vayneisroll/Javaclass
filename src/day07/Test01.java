package day07;

public class Test01 {
	public static void main(String[] args) {
		// Student 3칸짜리 객체를 만들겠다
		Student[] st = new Student[3];
		// 객체를 3개 만든다는게 아니라..
		// 메모장 3장 만드는 거임
		st[0] = new Student();
		st[1] = new Student();
		st[2] = new Student();
		
		st[0].name = "피카츄";
		st[0].point = 100;
		st[0].grade = 'A';
		
		st[1].name = "라이츄";
		st[1].point = 80;
		st[1].grade = 'B';
		
		st[2].name = "파이리";
		st[2].point = 70;
		st[2].grade = 'C';
		
		for(Student element:st){
			element.name = "포켓몬"; 
		}
		
		for(int i = 0; i<st.length; i++){
			st[i].showData();
		}
	}
}








