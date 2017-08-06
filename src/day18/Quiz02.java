package day18;
/*
 * 기본 경로에 메모장 파일하나 만들고..
 * 아무 문장이나 쓴 뒤, 
 * 단어가 총 몇 개인지, a는 총 몇 개인지 출력(indexOf())
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
				
				// 방금 읽어온 단어에서 a가 총 몇 개 있는지 찾기
				for(int i = 0;i < str.length();i++){
					currentIndex = str.indexOf("a", i);
					if(currentIndex == -1){ // a가 없으면 그만 둠
						break;
					}
					countA++;
					i = currentIndex; // a를 찾으면 그 다음 글자부터 또 a를 찾음
				}
			}
			String[] arr = tmp.split(" ");
			System.out.println("단어 수 : " + arr.length + "개");
			System.out.println("a 개수 : " + countA + "개");
			
			sc.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}








