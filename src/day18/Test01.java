package day18;

// log.txt �� sysout �غ���.

import java.io.*;
import java.util.Scanner;
public class Test01 {
   //C:\\Users\\Administrator\\Desktop ( \�� \\Ȥ�� /��.. ) 
	public static void main(String[] args) {
		try{
			
			FileInputStream in;
			in = new FileInputStream("log.txt");
			
			Scanner sc = new Scanner(in); 
			
			while(sc.hasNext()){
				System.out.println( sc.nextLine() );
			}
			
			sc.close();
			in.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
