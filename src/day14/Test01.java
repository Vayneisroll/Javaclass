package day14;
/*
 * < util 패키지 >
 * - Date, Scanner
 * < text 패키지 >
 * - DecimalFormat, SimpleDateFormat
 */
import java.util.Scanner;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
public class Test01 {
	public static void main(String[] args) {
//		Scanner : input stream의 데이터를 scan 해오는 클래스
//		 - System.in
//		 - System.out
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d);
		System.out.println(d.getMonth()); // 5
//		Date클래스는 toString()이랑 getTime() 메소드만 사용함
		System.out.println(d.getTime()); 
//		long getTime() : 1970.1.1.00 ~ 지금까지 경과한 밀리초를 long으로 제공
//		 ** 1000밀리초 = 1초
		System.out.println(System.currentTimeMillis());
		
		SimpleDateFormat sd = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 m분 s초");
		String form = sd.format( d );
		form = sd.format( d.getTime() );
		form = sd.format( System.currentTimeMillis() );
		form = sd.format( new Date() );
		System.out.println(form);
		
		DecimalFormat df = new DecimalFormat(".#####");
		form = df.format(10/3.0);
		System.out.println(form);
	}
}











