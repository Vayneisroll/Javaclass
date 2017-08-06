package day11;
/*
 * �θ� : Book 
 *   �ʵ� : å�̸�, ����, ����
 * �ڽ�1: Novel
 *   �ʵ� : å�̸�, ����, ����, �帣
 * �ڽ�2: Cartoon
 *   �ʵ� : å�̸�, ����, ����, ���ǻ�
 * �ڽ�3: Textbook
 *   �ʵ� : å�̸�, ����, ����, ����
 *   
 * => �޼ҵ嵵 ����� ������.. 
 *    e.g. ��� ������ sysout, getters, setters
 *    
 * < Override(��ȿȭ) >
 * -> �θ� ������ �޼ҵ带 �ڽ� ��Ÿ�ϴ�� '�ٵ�' �����ϴ� ��
 *    ����(�߰�ȣ �ձ���)�� ���� 
 * -> Book�� �������� Novel, Cartoon, Textbook ���� 
 *    '��� ������ �����ִ� �޼ҵ�'�� �׳� showData()�� �̸��� �����ϴ� ���� 
 *    �� �򰥸��� ������?   
 * -> �θ� ������ �þ߸� ���� ���� ������, ���� ���� ���� 
 *    �θ� : public => �ڽ� : private (X)
 *    �θ� : private => �ڽ� : public (O) 
 * -> Annotation : jvm���� �ǳ״� �ּ�
 *    @~~~
 *    @Override
 */
class Book{
	String title; // å���� 
	String author; // ����
	int price; // ����
	
	void showData(){
		System.out.println("å �̸� : " + title);
		System.out.println("���� : " + author);
		System.out.println("���� : " + price);
	}
}
class Cartoon extends Book{
	String publisher;
	@Override
	void showData() {
		super.showData();
		System.out.println("���ǻ� : " + publisher);
	}
}
class Textbook extends Book{
	String subject;
	@Override
	void showData(){
		super.showData();
		System.out.println("���� : " + subject);
	}
}
class Novel extends Book{
	String genre; 
	void showData(){
		super.showData();
		System.out.println("�帣 : " + genre);
	}
}
public class Quiz01 {	
	public static void main(String[] args) {
		Novel n = new Novel(); 
		n.title = "Harry Potter";
		n.genre = "Fantasy";
		n.showData();
	}
}




