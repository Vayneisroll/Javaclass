package day06;

public class Quiz01 {
	public static void main(String[] args) {
		int[] arr = {1, 20, 3, 34, 123, 16, 2, 40,50,83};
		
//		Q1. �� �迭�� ���� �� 20�̻� 100������ ���Ҹ� ���
		for(int data: arr){
			if(data>= 20 && data<=100){
				System.out.println(data);
			}
		}
//		Q2. �� �迭�� ���� �� �ִ�, �ּڰ� ���
		int max = arr[0];
		int min = arr[0]; 
		for(int data:arr){
			if(max < data){
				max = data;
			}
			if(min > data){
				min = data;
			}
		}
		System.out.println("MAX :" + max);
		System.out.println("MIN :" + min);
		
//		Q3. �� �迭�� ��������(��->ū) ����(sort) <- ����
//		selection sort(���� ����)
		for(int i = 0; i<=8; i++){
			for(int j=i+1; j <= 9; j++){
				if(arr[i] > arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp; 
				}
			}
		}
		// arr Ȯ��
		for(int data:arr){
			System.out.print(data + " ");
		}
	}
}




