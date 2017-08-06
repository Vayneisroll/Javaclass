package day17;

import javax.swing.JOptionPane;

class Count extends Thread{
	int s;
	public void run(){
		try{
			while(true){
				Thread.sleep(1000);
				System.out.println(++s + "초");
			}
		} catch(Exception e){}
	}
}
public class Quiz01 {
	// 구구단 5문제를 맞힐 때까지 총 몇 초 걸리는지?
	// 구구단 문제 => jop (메인스레드)
	// 초 세는 것 => sysout (보조스레드)
	public static void main(String[] args) {
		String quiz;
		String sAnswer;
		int n1, n2;
		int answer; 
		int count = 0; // 정답 개수 세기 
		
		Count c = new Count();
		c.setDaemon(true);
		c.start();
		while(true){
			
			n1 = (int)(Math.random()*9)+1; // 1 ~ 9
			n2 = (int)(Math.random()*8)+2; // 2 ~ 9
			
			quiz = "현재 정답 수: " +count+"개\n" 
					+ n1 + "X" + n2 + "=?";
			sAnswer = JOptionPane.showInputDialog(quiz);
			answer = Integer.parseInt(sAnswer);
			if(answer == n1*n2){
				count++;
			}
			
			if(count == 5){
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "총 " + c.s+"초 소요!");
	}
}



























