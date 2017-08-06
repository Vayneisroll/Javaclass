package day05;

public class Test02 {
	public static void main(String[] args){
		// 1 ~ 10
		int num = 1;
		do{
			System.out.println(num);
			num++;
		} while( num <= 10);
		
		// do-while은 while과 달리 
		// 조건식이 애초에 거짓이었어도 1번은 무조건 실행
		
		while(num == 0){ // false
			System.out.println("while 실행?");
		}
		
		do{
			System.out.println("do - while 실행?");
		} while(num==0);
	}
}






