package day13;
/*
 * String Ŭ����
 */
public class Test03 {
	public static void main(String[] args) {
		String str = "ABC"; 
		
		char[] arr = {'A','B','C'};
		String str2 = new String(arr); 
		
//		1. char charAt(int index): index��° ���� ��ȯ
//		2. boolean contains(String word)
//		: ���ڿ��� word�� �ִ��� true/false
		System.out.println("ABCDEFG".contains("CD")); //true
		
//		3. boolean endsWith(String word)
//		: ���ڿ��� word�� ��������
		String email = "issell@naver.com";
		System.out.println(email.endsWith(".com"));
//		 ** startsWith() : ~�� �����ϴ���
		
//		4. int indexOf(String str)
//		: str�� ���ڿ����� �� ������ �����ϴ��� int������ 
//		  (������ -1��ȯ)
		int index = email.indexOf("@"); 
		System.out.println(index + "���� �ִ�!"); // 6
//		 ** indexOf(String str, int fromIndex); 
		System.out.println(email.indexOf("e")); // 3
		System.out.println(email.indexOf("e", 6)); // 10
//		 ** lastIndexOf(String str) 
//		    : str�� ���� �� ������ ������ �ܾ��� ���� �ε���
		
		
//		5.boolean isEmpty() : ���ڿ� ���̰� 0�̴�?
		System.out.println("".isEmpty()); // true
		
//		6. int length() : ���� ����
		System.out.println(email.length() );
		
//		7. String replace(String old, String new)
//		 : old�� new�� ��ü�� �� ���ڿ��� ��ȯ
//		   ** String��ſ� char �־ ��
		String str3 = "AAAABBBBCCCCDDDD";
		String str4 = str3.replace("A", "Z");
		System.out.println(str3);
		System.out.println(str4);
		
//		8. String[] split(String regex)
//		regex : regular expression (���� ǥ����)
//		 ** ����ǥ���� : ���� ���ڿ� ���� ���� (e.g. |�� or��) 
		String str5 = "��ī��,������@���̸�!���α�";
		String[] arr2 = str5.split(",|!|@"); 
		for(String s : arr2){
			System.out.println(s);
		}
		
//		9. String substring(int start, int end)
//		start~end�� �ձ����� �߶� �̸� ���ڿ��� ��ȯ 
		String str6 = email.substring(4, 7);
		System.out.println(str6); // ll@
		System.out.println(email.substring(4)); // ll@naver.com
		
//		10. char[] toCharArray() : ���ڿ��� char�� �迭��..
//		11. toUpperCase() : ��� �빮�ڷ� 
//		12. toLowerCase() : ��� �ҹ��ڷ� 
//		13. trim() : �� ���� ������ ���ְڴ�
//		14. valueOf() : 1 => "1" / 3.14 = "3.14" 
//		  => Parsing�� �ݴ�
		String str7 = String.valueOf(6); // "6"
		String str8 = 6 + ""; 
	}
}






