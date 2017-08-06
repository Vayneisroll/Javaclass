package day20;
import java.io.*;
import java.net.*;
public class ClientSoc {
	public static void main(String[] args) {
		try{
			String ip = "localhost"; //"127.0.0.1"
			Socket s = new Socket(ip, 1004); 
			
			// ����ڰ� �ܼ�â�� �Է��ϴ� �� ���
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader input = new BufferedReader(isr);
			
			OutputStream out = s.getOutputStream();
			InputStream in = s.getInputStream();
			
			// ������ ������ byte��� ��Ʈ����, 
			// ���ڿ� ��/�߽��� ���� ���ڿ� ��� ��Ʈ��(Reader, Writer)��..
			OutputStreamWriter outW = new OutputStreamWriter(out);  
			InputStreamReader inR = new InputStreamReader(in); 
			
			PrintWriter pw = new PrintWriter(outW);
			BufferedReader br = new BufferedReader(inR);
			
			String send = null; // ���� �� �� �׸�
			String recv = null; // �����κ��� ���� �� �� �׸�
			while(true){
				send = input.readLine(); // console�� ����� inputStream
				if(send.equalsIgnoreCase("exit")){
					break;
				}
				pw.println(send); 
				pw.flush(); 
				recv = br.readLine();
				if(recv == null){
					break;
				}
				System.out.println("������ ������ echo : " +recv);
			}
			
			pw.close();
			br.close();
			s.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}





