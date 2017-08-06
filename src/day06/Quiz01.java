package day06;

public class Quiz01 {
	public static void main(String[] args) {
		int[] arr = {1, 20, 3, 34, 123, 16, 2, 40,50,83};
		
//		Q1. 위 배열의 원소 중 20이상 100이하인 원소만 출력
		for(int data: arr){
			if(data>= 20 && data<=100){
				System.out.println(data);
			}
		}
//		Q2. 위 배열의 원소 중 최댓값, 최솟값 출력
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
		
//		Q3. 위 배열을 오름차순(작->큰) 정렬(sort) <- 선택
//		selection sort(선택 정렬)
		for(int i = 0; i<=8; i++){
			for(int j=i+1; j <= 9; j++){
				if(arr[i] > arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp; 
				}
			}
		}
		// arr 확인
		for(int data:arr){
			System.out.print(data + " ");
		}
	}
}




