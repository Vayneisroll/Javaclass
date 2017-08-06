package day19;
/*
 * 객체 정보를 파일에 저장해보자
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
			// 주 스트림 생성
			FileOutputStream out;
			out = new FileOutputStream("db.per");
			
			// 보조 스트림 (Object Stream) 생성
			ObjectOutputStream oOut;
			oOut = new ObjectOutputStream(out);
			
			Person[] arr = new Person[3]; // 메모장 3장
			arr[0] = new Person();
			arr[0].name = "피카츄";
			arr[0].age = 10;
			arr[0].phone = "010-1234-5678";
			
			arr[1] = new Person();
			arr[1].name = "라이츄";
			arr[1].age = 20;
			arr[1].phone = "010-1234-5555";
			
			arr[2] = new Person();
			arr[2].name = "푸린";
			arr[2].age = 5;
			arr[2].phone = "없음";
			
			oOut.writeObject(arr);
			
			// 스트림 닫기
			oOut.close();
			out.close();
			
			System.out.println("객체 저장 완료!");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}




