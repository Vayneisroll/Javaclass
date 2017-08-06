package day05;

public class Quiz02 {
	public static void main(String[] args) {
		char[] str = {'p', 'O', 'K', 'e', 'm', 'o', 'n'};
		System.out.println(str); // pOKemon
		// for문을 사용하여 소->대 변경
		// 'a' 이상 'z' 이하 = 소문자
		// 대+32 = 소 
		for(int i = 0; i<str.length; i++){
			if(str[i] >= 'a' && str[i] <= 'z'){
				str[i] -= 32; 
			}
		}
		System.out.println(str); // POKEMON
		
		String s = "Lee Se Ra";
		s = s.toUpperCase();
		System.out.println(s);
	}
}






