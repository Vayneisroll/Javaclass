package day18;

/*
 * 사용자가 "exit"를 입력할 때까지 문자열을 계속 입력 받음.
 * exit 입력 => 기본경로(java project폴더)에 log.txt가 생성, 
 * 사용자가 입력한 모든 문자열을 저장
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
			tmp = JOptionPane.showInputDialog("아무거나..종료는 exit");
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
			JOptionPane.showMessageDialog(null, "log.txt에 저장되었습니다.");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}











