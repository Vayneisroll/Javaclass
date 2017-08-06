package day17;

import javax.swing.JOptionPane;

/*
 * < Multi Thread > 
 * - Thread��? 
 *  ���α׷� �帧
 * - �츮 �����ߴ� ���α׷��� single thread.
 * - ���θ޼ҵ尡 �����ϴ� thread : main thread
 * - Multi thread ��� : ���� �帧�� ����ó���ϴ� ��
 * 
 * - ��Ƽ������ �������
 *  1. Ŭ���� ���� extends Thread
 *  2. Thread�� �����ص� run() �������̵� => �߰��� �帧
 *  3. �帧�� �߰��ϰ� ���� ������ ��ü ���� + start() ����
 *  
 * - Daemon thread ( ���� ������ )
 *   �츮�� �⺻������ ���������� ������ ���س����� 
 *   ���ν�����ʹ� ������ �����尡 �Ǿ 
 *   ���ν������� ����(���α׷� ����)�� �Ǿ �ٸ� �����尡 ����ִ�
 *   ���� ������� �����ؾ� ������ ���� �� ���� ����.
 */
class Timer extends Thread {
	public void run(){
		try{
			for(int i = 10; i> 0; i--){
				System.out.println(i + "��");
				Thread.sleep(1000);
			}
		} catch(Exception e){}
	}
}
public class Test02 {
	public static void main(String[] args) {
		// JOP���� ���ڿ��� �����Ӱ� 1�� �Է� + ��� ��� 
		// 10�ʸ� ī��Ʈ �ٿ�
		Timer t = new Timer();
		t.setDaemon(true); // t�� ����������� �ΰڴ�!
		t.start();
		//String str = JOptionPane.showInputDialog("�ƹ��ų�..");
		//JOptionPane.showMessageDialog(null, str);
		
		System.out.println("���α׷� ����!");
	}
}











