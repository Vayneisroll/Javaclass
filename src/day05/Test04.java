package day05;
/*
 * < �迭(Arrays) >
 * : �뷮�� '���� �ڷ���' �����͸� ������ �޸�
 *   �ݺ�ó���� ���� ���
 *  ���� == ����1ĭ
 *  �迭 == ������
 */
public class Test04 {
	public static void main(String[] args) {
		// �����ڷ��� �迭 ���� 3���� 
		// ���1
		int[] arr1; // int arr1[]; 
		arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		// ���2
		int[] arr2;
		arr2 = new int[]{10,20,30};
		
		// ���3
		int[] arr3 = {10,20,30}; 
		
		// int arr4[3] (X)
		
		for(int i = 0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		// �迭��.length : ĭ ����(int) 
		
		// Ȯ��for��( foreach�� )
		// �迭, �÷��ǿ� ���Ǵ� Ư�� for��
		// for( ���Ҹ� ������ ���� ���� : �迭��  ){ 
		//    �ݺ��� �����
		// }
		for(int data : arr1){
			System.out.println(data);
		}
		// arr1�� ���ҵ��� ���ʷ� data�� �����ϸ鼭 
		// �ݺ��� �����ϰڴ�
		// ** �б����� (���� ��ü�� ������ �� ����)
		for(int data : arr1){
			data = 0; 
		}
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
	}
}













