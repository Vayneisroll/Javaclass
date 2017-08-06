package day18;
import java.io.*;
public class Test02 {
	public static void main(String[] args) {
		// images.png �κ��� ������ �鿩�;� �ϴϱ�.. input
		// myImage.png ���� ������ �ϴϱ�.. output
		try{
			FileInputStream in;
			FileOutputStream out;
			
			in = new FileInputStream("images.png");
			out = new FileOutputStream("myImage.png");
			
			int data; // �׸�
			while(true){
				data = in.read();
				if(data == -1){
					break;
				}
				out.write(data);
			}
			
			in.close();
			out.close();
			System.out.println("���� �Ϸ�!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
