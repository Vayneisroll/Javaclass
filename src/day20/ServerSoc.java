package day20;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSoc {
	public static void main(String[] args) {
		
		try {
			ServerSocket soc = new ServerSocket(1004);// 포트번호 1004
			InputStream in;
			OutputStream out;
			
			System.out.println("서버 대기를 시작합니다...");
			Socket s = soc.accept(); // 대기하다가 클라이언트가 소켓을 생성하면 
									 // 그 소켓을 받아 s에 저장
			System.out.println("클라이언트와 연결되었습니다...");
			
			
			
			
			
			
			
			
			
			in = s.getInputStream(); // 그 소켓에 연결된 inputStream 생성 
			out = s.getOutputStream(); // 그 소켓에 연결된 outputStream 생성
		
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			
			
			
			
			
			
			
			String str = null;
			while(true){
				str = br.readLine();
				if(str == null){ break; }
				System.out.println("클라이언트 : " + str);
				pw.println(str);
				pw.flush(); // 버퍼에 남겨진 잔여데이터가 있을 가능성이 있어서
							// 싹 다 클라이언트한테 밀어줘라
			}
			pw.close();
			br.close();
			soc.close(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}







