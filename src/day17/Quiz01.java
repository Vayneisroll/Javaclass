package day17;

import javax.swing.JOptionPane;

class Count extends Thread{
	int s;
	public void run(){
		try{
			while(true){
				Thread.sleep(1000);
				System.out.println(++s + "��");
			}
		} catch(Exception e){}
	}
}
public class Quiz01 {
	// ������ 5������ ���� ������ �� �� �� �ɸ�����?
	// ������ ���� => jop (���ν�����)
	// �� ���� �� => sysout (����������)
	public static void main(String[] args) {
		String quiz;
		String sAnswer;
		int n1, n2;
		int answer; 
		int count = 0; // ���� ���� ���� 
		
		Count c = new Count();
		c.setDaemon(true);
		c.start();
		while(true){
			
			n1 = (int)(Math.random()*9)+1; // 1 ~ 9
			n2 = (int)(Math.random()*8)+2; // 2 ~ 9
			
			quiz = "���� ���� ��: " +count+"��\n" 
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
		JOptionPane.showMessageDialog(null, "�� " + c.s+"�� �ҿ�!");
	}
}



























