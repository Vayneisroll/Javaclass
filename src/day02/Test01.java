package day02;
/*
 * < 자료형(type) >
 * 1. 원시자료형(primitive type) => 오늘 볼 것!
 * 
 *  정수 : byte(1) short(2) int(4) long(8)
 *  실수 : float(4) double(8)
 *  문자 : char(2) 
 *  논리 : boolean(4)
 *  => 총 8개!
 *   
 *  참조자료형이지만 원시자료형 취급을 받는 자료형 1개 있음
 *  String형 => 문자열형 
 *   
 * 2. 참조자료형(reference type)
 */
public class Test01 {
	public static void main(String[] args){
		System.out.println(10000000000L);//long으로 처리하셈
		System.out.println(3.14f); // float으로 처리하셈
		
		// 1 1.0 '1' "1" 
		System.out.println(1 + 10); // 11
		System.out.println(1.0 + 10); // 11.0
		System.out.println('1' + 10); // 59
		System.out.println("1" + 10); // 110
	}
}	





