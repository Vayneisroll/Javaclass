package day03;

import javax.swing.JOptionPane;

/*
 * JOptionPane : 창띄우는 기능
 * jop -> 자동완성 + enter 
 * 
 *  1) showin : 메세지 + 텍스트 입력
 *    => 입력 받은 텍스트가 그 코드 자리로 돌아옴
 *    => 입력 값은 무조건 String 타입   
 *  
 *  2) showm : 메세지
 *   => 첫 값은 무조건 null 넣으면 됨
 *   => 두 번째 값은 내가 띄우고 싶은 메세지
 */
public class Test03 {
	public static void main(String[] args) {
		String s;
		s = JOptionPane.showInputDialog("뭐라도 입력해보셈..");
		System.out.println(s);
		
		JOptionPane.showMessageDialog(null, "메롱메롱");
	}
}





