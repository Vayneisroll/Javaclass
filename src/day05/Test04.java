package day05;
/*
 * < 배열(Arrays) >
 * : 대량의 '같은 자료형' 데이터를 저장할 메모리
 *   반복처리를 위해 사용
 *  변수 == 서랍1칸
 *  배열 == 서랍장
 */
public class Test04 {
	public static void main(String[] args) {
		// 원시자료형 배열 선언 3가지 
		// 방법1
		int[] arr1; // int arr1[]; 
		arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		// 방법2
		int[] arr2;
		arr2 = new int[]{10,20,30};
		
		// 방법3
		int[] arr3 = {10,20,30}; 
		
		// int arr4[3] (X)
		
		for(int i = 0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		// 배열명.length : 칸 개수(int) 
		
		// 확장for문( foreach문 )
		// 배열, 컬렉션에 사용되는 특수 for문
		// for( 원소를 복사할 변수 선언 : 배열명  ){ 
		//    반복할 문장들
		// }
		for(int data : arr1){
			System.out.println(data);
		}
		// arr1의 원소들을 차례로 data에 저장하면서 
		// 반복을 실행하겠다
		// ** 읽기전용 (원소 자체는 변경할 수 없음)
		for(int data : arr1){
			data = 0; 
		}
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
	}
}













