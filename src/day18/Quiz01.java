package day18;

/*
 * ����ڰ� "exit"�� �Է��� ������ ���ڿ��� ��� �Է� ����.
 * exit �Է� => �⺻���(java project����)�� log.txt�� ����, 
 * ����ڰ� �Է��� ��� ���ڿ��� ����
 */
import java.io.*;
import java.util.Date;

import javax.swing.JOptionPane;
public class Quiz01 {
	public static void main(String[] args) {
		String str = "";
		String tmp; 
		Date d = new Date();
		while(true){
			tmp = JOptionPane.showInputDialog("�ƹ��ų�..����� exit");
			if(tmp.equalsIgnoreCase("exit")){
				break;
			}
			str += tmp + "\r\n"; 
		}
		try{
			FileOutputStream out = new FileOutputStream("log.txt");
			PrintWriter pw = new PrintWriter(out);
			
			pw.println(str);
			
			pw.close();
			out.close();
			JOptionPane.showMessageDialog(null, "log.txt�� ����Ǿ����ϴ�.");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}











