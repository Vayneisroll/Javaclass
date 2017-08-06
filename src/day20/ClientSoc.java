package day20;
import java.io.*;
import java.net.*;
public class ClientSoc {
	public static void main(String[] args) {
		try{
			String ip = "localhost"; //"127.0.0.1"
			Socket s = new Socket(ip, 1004); 
			
			// 사용자가 콘솔창에 입력하는 데 사용
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader input = new BufferedReader(isr);
			
			OutputStream out = s.getOutputStream();
			InputStream in = s.getInputStream();
			
			// 위에서 생성한 byte기반 스트림을, 
			// 문자열 수/발신을 위해 문자열 기반 스트림(Reader, Writer)로..
			OutputStreamWriter outW = new OutputStreamWriter(out);  
			InputStreamReader inR = new InputStreamReader(in); 
			
			PrintWriter pw = new PrintWriter(outW);
			BufferedReader br = new BufferedReader(inR);
			
			String send = null; // 보낼 때 쓸 그릇
			String recv = null; // 서버로부터 받을 때 쓸 그릇
			while(true){
				send = input.readLine(); // console과 연결된 inputStream
				if(send.equalsIgnoreCase("exit")){
					break;
				}
				pw.println(send); 
				pw.flush(); 
				recv = br.readLine();
				if(recv == null){
					break;
				}
				System.out.println("서버로 부터의 echo : " +recv);
			}
			
			pw.close();
			br.close();
			s.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}





