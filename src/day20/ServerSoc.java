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
			ServerSocket soc = new ServerSocket(1004);// ��Ʈ��ȣ 1004
			InputStream in;
			OutputStream out;
			
			System.out.println("���� ��⸦ �����մϴ�...");
			Socket s = soc.accept(); // ����ϴٰ� Ŭ���̾�Ʈ�� ������ �����ϸ� 
									 // �� ������ �޾� s�� ����
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�...");
			
			
			
			
			
			
			
			
			
			in = s.getInputStream(); // �� ���Ͽ� ����� inputStream ���� 
			out = s.getOutputStream(); // �� ���Ͽ� ����� outputStream ����
		
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			
			
			
			
			
			
			
			String str = null;
			while(true){
				str = br.readLine();
				if(str == null){ break; }
				System.out.println("Ŭ���̾�Ʈ : " + str);
				pw.println(str);
				pw.flush(); // ���ۿ� ������ �ܿ������Ͱ� ���� ���ɼ��� �־
							// �� �� Ŭ���̾�Ʈ���� �о����
			}
			pw.close();
			br.close();
			soc.close(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}







