package day17;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * < I/O > - input stream / output stream
 * - stream�̶�?
 *   ���α׷� �ܺο� �����͸� �ְ� ���� �� ����ϴ� �޸�(���� ���)
 * - stream�� Ư¡ 
 *  1) �ܹ��� ����
 *    (���α׷� ���忡��..)
 *     �鿩�;� �� �� : InputStream
 *     ������ �� �� : OutputStream
 *  2) QUEUE ���� (���Լ���)
 *  3) �����ʹ� 1byte ������ ����� ��Ʈ���� �����
 *  4) ��Ʈ���� �� �� ����, �ظ��ϸ� �������� �ݾ���� �Ѵ�. 
 *  
 * - ��Ʈ���� 2���� ���� 
 *  1) byte �迭 ��Ʈ�� 
 *   - �ټ��� ������ 1byte (byte��)
 *   - ��ƮŬ���� : InputStream / OutputStream
 *   
 *   
 *  2) char �迭 ��Ʈ��
 *   - �ټ��� ������ 2byte (char��)
 *   - ��ƮŬ���� : Reader / Writer
 *   
 */
public class Test03 {
	// ��ī�� aa.txt �޸��忡 �����غ���
	public static void main(String[] args) {
		
		
		try {
			// ��� ���� 
			FileOutputStream out;
			out = new FileOutputStream("aa.txt", true); // append��带 true�� 
			// ������ ���� 
			PrintWriter pw = new PrintWriter(out); //out��θ� �����ϰڴ�!
			
			
			pw.println("��ī��");
			
			
			
			// ��� ���� 
			pw.close(); 
			out.close(); // ��� �ݱ� ���ϸ�, ���� �ȵ�
			
			System.out.println("���� ��!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}









