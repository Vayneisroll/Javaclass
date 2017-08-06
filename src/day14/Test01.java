package day14;
/*
 * < util ��Ű�� >
 * - Date, Scanner
 * < text ��Ű�� >
 * - DecimalFormat, SimpleDateFormat
 */
import java.util.Scanner;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
public class Test01 {
	public static void main(String[] args) {
//		Scanner : input stream�� �����͸� scan �ؿ��� Ŭ����
//		 - System.in
//		 - System.out
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d);
		System.out.println(d.getMonth()); // 5
//		DateŬ������ toString()�̶� getTime() �޼ҵ常 �����
		System.out.println(d.getTime()); 
//		long getTime() : 1970.1.1.00 ~ ���ݱ��� ����� �и��ʸ� long���� ����
//		 ** 1000�и��� = 1��
		System.out.println(System.currentTimeMillis());
		
		SimpleDateFormat sd = new SimpleDateFormat("YYYY�� MM�� dd�� hh�� m�� s��");
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











