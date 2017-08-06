package day13;
/*
 * String 클래스
 */
public class Test03 {
	public static void main(String[] args) {
		String str = "ABC"; 
		
		char[] arr = {'A','B','C'};
		String str2 = new String(arr); 
		
//		1. char charAt(int index): index번째 문자 반환
//		2. boolean contains(String word)
//		: 문자열에 word가 있는지 true/false
		System.out.println("ABCDEFG".contains("CD")); //true
		
//		3. boolean endsWith(String word)
//		: 문자열이 word로 끝나는지
		String email = "issell@naver.com";
		System.out.println(email.endsWith(".com"));
//		 ** startsWith() : ~로 시작하는지
		
//		4. int indexOf(String str)
//		: str이 문자열에서 몇 번부터 시작하는지 int형으로 
//		  (없으면 -1반환)
		int index = email.indexOf("@"); 
		System.out.println(index + "번에 있다!"); // 6
//		 ** indexOf(String str, int fromIndex); 
		System.out.println(email.indexOf("e")); // 3
		System.out.println(email.indexOf("e", 6)); // 10
//		 ** lastIndexOf(String str) 
//		    : str이 여러 개 있으면 마지막 단어의 시작 인덱스
		
		
//		5.boolean isEmpty() : 문자열 길이가 0이니?
		System.out.println("".isEmpty()); // true
		
//		6. int length() : 문자 개수
		System.out.println(email.length() );
		
//		7. String replace(String old, String new)
//		 : old를 new로 대체한 새 문자열을 반환
//		   ** String대신에 char 넣어도 됨
		String str3 = "AAAABBBBCCCCDDDD";
		String str4 = str3.replace("A", "Z");
		System.out.println(str3);
		System.out.println(str4);
		
//		8. String[] split(String regex)
//		regex : regular expression (정규 표현식)
//		 ** 정규표현식 : 일정 문자열 패턴 형식 (e.g. |는 or다) 
		String str5 = "피카츄,라이츄@파이리!꼬부기";
		String[] arr2 = str5.split(",|!|@"); 
		for(String s : arr2){
			System.out.println(s);
		}
		
//		9. String substring(int start, int end)
//		start~end번 앞까지를 잘라 이를 문자열로 반환 
		String str6 = email.substring(4, 7);
		System.out.println(str6); // ll@
		System.out.println(email.substring(4)); // ll@naver.com
		
//		10. char[] toCharArray() : 문자열을 char형 배열로..
//		11. toUpperCase() : 모두 대문자로 
//		12. toLowerCase() : 모두 소문자로 
//		13. trim() : 양 쪽의 공백을 없애겠다
//		14. valueOf() : 1 => "1" / 3.14 = "3.14" 
//		  => Parsing의 반대
		String str7 = String.valueOf(6); // "6"
		String str8 = 6 + ""; 
	}
}






