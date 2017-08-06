package day19;
// db.per의 객체를 가지고 오자!
import java.io.*;
public class Test02 {
	public static void main(String[] args) {
		try{
			FileInputStream in;
			in = new FileInputStream("db.per"); 
			
			ObjectInputStream oIn;
			oIn = new ObjectInputStream(in);
			
			
			Person[] p;
			p = (Person[])oIn.readObject();
			for(Person tmp : p){
				System.out.println(tmp.name);
				System.out.println(tmp.age + "세");
				System.out.println(tmp.phone);
			}
			
			oIn.close();
			in.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
