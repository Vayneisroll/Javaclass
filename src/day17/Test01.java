package day17;
/*
 * �� ���� �޼ҵ����.. ���� ó������ ������ ����� �� ���� ������� ���� ����.
 * e.g. Thread.sleep(long �и���);
 *      Thread.sleep(1000); // 1�� ���
 *      
 *  ** ���� ó�� 2���� ��� 
 *   1. try-catch�� �ٷ� ó��
 *   2. ���� �ڵ带 �ۼ��ϴ� �޼ҵ� ���� throws ����
 *   	** throws �����̶�? 
 *   	- '~~����Ŭ������ ������ �޼ҵ�'
 *   	- �� �޼ҵ带 ����� ����� �ݵ�� ����ó���� �ؾ� �Ѵ�
 *   	- try-catch�ϴ� ���� �� �޼ҵ带 ������ ���� ������� �����ϴ� ��
 *   	- �ظ��ϸ� main()�� throws �������� ����!
 */
public class Test01 {
	public static void main(String[] args) throws InterruptedException {
		//try{
			for(int i =10; i>0; i--){
				Thread.sleep(1000); 
				System.out.println(i + "��");
			}
		//} catch(Exception e){
		
		//}
	}
}



















