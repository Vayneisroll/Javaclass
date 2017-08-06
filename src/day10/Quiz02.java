package day10;

import day10_2.Student;
public class Quiz02 {
	public static void main(String[] args) {
		Student[] st = {
			new Student("aa", 10), 
			new Student("bb", 12, 100, 50), 
			new Student("cc", 15, 68, 79)
		}; 
		
		for(Student s: st){
			System.out.println(s.getName());
			System.out.println(s.getAge()+"세");
			System.out.println(s.getAvg()+"점");
			System.out.println(s.getGrade()+"등급");
			if(s.isPassed()){
				System.out.println("합격!");
			} else {
				System.out.println("불합격..");
			}
			System.out.println("================");
		}
		
	}
}
