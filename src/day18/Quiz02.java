package day18;
/*
 * �⺻ ��ο� �޸��� �����ϳ� �����..
 * �ƹ� �����̳� �� ��, 
 * �ܾ �� �� ������, a�� �� �� ������ ���(indexOf())
 */
import java.io.*;
import java.util.Scanner;
public class Quiz02 {
	public static void main(String[] args) {
		try{
			FileInputStream in = new FileInputStream("tmp.txt");
			Scanner sc = new Scanner(in);
			String tmp = "";
			int countA = 0;
			int currentIndex = 0; 
			while(sc.hasNext()){
				String str =sc.next(); 
				tmp+= str + " ";
				
				// ��� �о�� �ܾ�� a�� �� �� �� �ִ��� ã��
				for(int i = 0;i < str.length();i++){
					currentIndex = str.indexOf("a", i);
					if(currentIndex == -1){ // a�� ������ �׸� ��
						break;
					}
					countA++;
					i = currentIndex; // a�� ã���� �� ���� ���ں��� �� a�� ã��
				}
			}
			String[] arr = tmp.split(" ");
			System.out.println("�ܾ� �� : " + arr.length + "��");
			System.out.println("a ���� : " + countA + "��");
			
			sc.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}








