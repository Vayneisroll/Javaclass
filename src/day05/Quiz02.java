package day05;

public class Quiz02 {
	public static void main(String[] args) {
		char[] str = {'p', 'O', 'K', 'e', 'm', 'o', 'n'};
		System.out.println(str); // pOKemon
		// for���� ����Ͽ� ��->�� ����
		// 'a' �̻� 'z' ���� = �ҹ���
		// ��+32 = �� 
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






