package day19;
/*
 * ��ü ������ ���Ͽ� �����غ���
 */
import java.io.*;

class Person implements Serializable{
	String name;
	int age;
	String phone;
}

public class Test01 {
	public static void main(String[] args) {
		try{
			// �� ��Ʈ�� ����
			FileOutputStream out;
			out = new FileOutputStream("db.per");
			
			// ���� ��Ʈ�� (Object Stream) ����
			ObjectOutputStream oOut;
			oOut = new ObjectOutputStream(out);
			
			Person[] arr = new Person[3]; // �޸��� 3��
			arr[0] = new Person();
			arr[0].name = "��ī��";
			arr[0].age = 10;
			arr[0].phone = "010-1234-5678";
			
			arr[1] = new Person();
			arr[1].name = "������";
			arr[1].age = 20;
			arr[1].phone = "010-1234-5555";
			
			arr[2] = new Person();
			arr[2].name = "Ǫ��";
			arr[2].age = 5;
			arr[2].phone = "����";
			
			oOut.writeObject(arr);
			
			// ��Ʈ�� �ݱ�
			oOut.close();
			out.close();
			
			System.out.println("��ü ���� �Ϸ�!");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}




