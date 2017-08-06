package day17;
/*
 * 꽤 많은 메소드들은.. 예외 처리하지 않으면 사용할 수 없게 만들어진 것이 많다.
 * e.g. Thread.sleep(long 밀리초);
 *      Thread.sleep(1000); // 1초 대기
 *      
 *  ** 예외 처리 2가지 방법 
 *   1. try-catch로 바로 처리
 *   2. 지금 코드를 작성하는 메소드 옆에 throws 선언
 *   	** throws 선언이란? 
 *   	- '~~예외클래스를 던지는 메소드'
 *   	- 이 메소드를 사용할 사람은 반드시 예외처리를 해야 한다
 *   	- try-catch하는 것을 이 메소드를 실행할 다음 사람에게 위임하는 것
 *   	- 왠만하면 main()은 throws 선언하지 말자!
 */
public class Test01 {
	public static void main(String[] args) throws InterruptedException {
		//try{
			for(int i =10; i>0; i--){
				Thread.sleep(1000); 
				System.out.println(i + "초");
			}
		//} catch(Exception e){
		
		//}
	}
}



















