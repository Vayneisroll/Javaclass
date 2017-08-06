package day11;

/*
 * Person : 이름, 나이, 연락처 
 * Student: 이름, 나이, 연락처, 점수, 등급
 * Employee: 이름, 나이, 연락처, 직급, 연봉, 회사
 * 
 * < 상속(inheritance) >
 * : 기존에 있는 클래스를 '확장'해서 새 클래스에 적용하는 작업
 *  원본클래스 : 부모클래스 == 상위클래스 == 슈퍼클래스
 *  확장클래스 : 자식클래스 == 하위클래스 == 서브클래스
 *  
 * < 상속 유의사항 > 
 * : 자바에서는 다중상속이 불가능 ( 둘 이상의 부모를 두는 건 X ) 
 * : 자식타입의 객체를 생성할 때, 부모 모양의 객체가 먼저 생성되는데.. 
 *    => 자식 타입의 생성자 호출 시, 부모 타입의 생성자가 먼저 호출된다. 
 * < super >
 * : this(이 객체의 레퍼런스)
 *   super(이 객체 안의 부모모양 객체의 레퍼런스)
 *   
 *   ** this == super (인식의 차이)
 *      this라고 하면, 자식 타입 객체로 인식함
 *      super라고 하면, 부모 타입 객체까지만 인식함
 */
class Person { 
	String name; int age; String phone; 
	Person(String name){
		this.name = name;
	}
}
class Student extends Person{
	int point;
	char grade;
	Student(){
		super("없음"); // 부모타입(Person) 생성자 호출
	}
	// 자식객체가 만들어질 때, 가장 먼저 부모타입 생성자가 호출되는데,
	// 이때, 부모클래스에 기본생성자가 없고, 다른 생성자가 있으면
	// 그 생성자에 맞게 위 super() 생성자 호출부에 뭐라도 넣어줘야 한다.
}
class Employee extends Person{
	String position;
	int salary;
	String corp;
	public Employee() {
		super(null);
	}
}
public class Test01 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "홍길동";
		
	}
}




















