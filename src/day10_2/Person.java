package day10_2;

public class Person {
	private String name;
	private int age;
	private String phone;

	// setters : ����
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = (age >= 0) ? age : 0;
		// ������ ������ ���� 0�� �����ض�
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// getters : �����ֱ�
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}
	// boolean Ÿ�� getter�� get��ſ� is�� ��

}
