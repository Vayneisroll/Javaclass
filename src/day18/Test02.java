package day18;
import java.io.*;
public class Test02 {
	public static void main(String[] args) {
		// images.png 로부터 데이터 들여와야 하니까.. input
		// myImage.png 한테 보내야 하니까.. output
		try{
			FileInputStream in;
			FileOutputStream out;
			
			in = new FileInputStream("images.png");
			out = new FileOutputStream("myImage.png");
			
			int data; // 그릇
			while(true){
				data = in.read();
				if(data == -1){
					break;
				}
				out.write(data);
			}
			
			in.close();
			out.close();
			System.out.println("복사 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
