package day17;

import javax.swing.JOptionPane;

/*
 * < Multi Thread > 
 * - Thread란? 
 *  프로그램 흐름
 * - 우리 여태했던 프로그램은 single thread.
 * - 메인메소드가 시작하는 thread : main thread
 * - Multi thread 방식 : 여러 흐름을 병렬처리하는 것
 * 
 * - 멀티스레드 구현방법
 *  1. 클래스 정의 extends Thread
 *  2. Thread가 선언해둔 run() 오버라이드 => 추가할 흐름
 *  3. 흐름을 추가하고 싶은 시점에 객체 생성 + start() 실행
 *  
 * - Daemon thread ( 보조 스레드 )
 *   우리가 기본적으로 보조스레드 설정을 안해놓으면 
 *   메인스레드와는 별개의 스레드가 되어서 
 *   메인스레드의 종료(프로그램 종료)가 되어서 다른 스레드가 살아있다
 *   보조 스레드로 지정해야 메인이 끝날 때 같이 끝남.
 */
class Timer extends Thread {
	public void run(){
		try{
			for(int i = 10; i> 0; i--){
				System.out.println(i + "초");
				Thread.sleep(1000);
			}
		} catch(Exception e){}
	}
}
public class Test02 {
	public static void main(String[] args) {
		// JOP으로 문자열을 자유롭게 1번 입력 + 결과 출력 
		// 10초를 카운트 다운
		Timer t = new Timer();
		t.setDaemon(true); // t를 보조스레드로 두겠다!
		t.start();
		//String str = JOptionPane.showInputDialog("아무거나..");
		//JOptionPane.showMessageDialog(null, str);
		
		System.out.println("프로그램 종료!");
	}
}











