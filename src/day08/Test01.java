package day08;

import javax.swing.JOptionPane;

public class Test01 {
	
	public static void main(String[] args) {
		
		Pokemon p1, p2;
		p1 = new Pokemon();
		p2 = new Pokemon();
		
		p1.setData("피카츄", 10, 100, 200);
		p2.setData("꼬부기", 11, 110, 180);
		
		// 피카츄가 꼬부기를 공격!
		p1.fight(p2);
		
		// 꼬부기가 피카츄를 공격! 
		p2.fight(p1);
		
		// 피카츄 정보는 sysout으로..
		System.out.println("====" + p1.name +"의 정보====\n");
		p1.showData();
		
		// 꼬부기 정보는 jop으로..
		JOptionPane.showMessageDialog(null, p2.getData());
		System.out.println(p2.getData());
	}
}




