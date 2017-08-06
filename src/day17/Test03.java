package day17;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * < I/O > - input stream / output stream
 * - stream이란?
 *   프로그램 외부와 데이터를 주고 받을 때 사용하는 메모리(가상 통로)
 * - stream의 특징 
 *  1) 단방향 구조
 *    (프로그램 입장에서..)
 *     들여와야 할 때 : InputStream
 *     보내야 할 때 : OutputStream
 *  2) QUEUE 구조 (선입선출)
 *  3) 데이터는 1byte 단위로 줄지어서 스트림에 저장됨
 *  4) 스트림을 한 번 열면, 왠만하면 마지막에 닫아줘야 한다. 
 *  
 * - 스트림의 2가지 종류 
 *  1) byte 계열 스트림 
 *   - 줄서는 단위가 1byte (byte형)
 *   - 루트클래스 : InputStream / OutputStream
 *   
 *   
 *  2) char 계열 스트림
 *   - 줄서는 단위가 2byte (char형)
 *   - 루트클래스 : Reader / Writer
 *   
 */
public class Test03 {
	// 피카츄를 aa.txt 메모장에 저장해보자
	public static void main(String[] args) {
		
		
		try {
			// 통로 생성 
			FileOutputStream out;
			out = new FileOutputStream("aa.txt", true); // append모드를 true로 
			// 보조자 생성 
			PrintWriter pw = new PrintWriter(out); //out통로를 보조하겠다!
			
			
			pw.println("피카츄");
			
			
			
			// 통로 종료 
			pw.close(); 
			out.close(); // 통로 닫기 안하면, 저장 안됨
			
			System.out.println("저장 끝!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}









