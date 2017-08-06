package day10_2;

public class Person {
	private String name;
	private int age;
	private String phone;

	// setters : 저장
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = (age >= 0) ? age : 0;
		// 음수가 들어오면 차라리 0을 저장해라
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// getters : 보여주기
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}
	// boolean 타입 getter는 get대신에 is를 씀

}
