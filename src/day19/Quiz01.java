package day19;
/*
 * Pokemon 클래스 
 *  필드 : 이름, 체력, 공격력
 * 	toString() 오버라이드 
 *  생성자
 *  compareTo() 오버라이드 (이름순으로)
 */

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;

class Pokemon implements Serializable, Comparable<Pokemon> {
	String name;
	int hp, att;
	Pokemon (String n, int h, int a){
		name =n;
		hp = h;
		att = a;
	}
	public String toString(){
		return name + "/HP." + hp + "/ATTACK." + att;
	}
	public int compareTo(Pokemon another){
		return name.compareTo(another.name);
	}
}
 /*  
 * Quiz01
 *  메뉴 
 *  	1. 포켓몬 등록 
 *  	2. 데이터 저장
 *  	3. 종료
 *  ** ArrayList 사용
 *  
 */
public class Quiz01 {
	public static void main(String[] args) {
		ArrayList<Pokemon> arr = new ArrayList<Pokemon>();
		String menu = "1. 포켓몬 등록 \n2. 데이터 저장 \n3. 종료";
		String select;
		while(true){
			select= JOptionPane.showInputDialog(menu);
			if(select.equals("1")){
				String name, sHp, sAtt;
				int hp, att;
				name = JOptionPane.showInputDialog("이름");
				sHp = JOptionPane.showInputDialog("체력");
				hp = Integer.parseInt(sHp);
				sAtt = JOptionPane.showInputDialog("공격력");
				att = Integer.parseInt(sAtt);
				arr.add(new Pokemon(name, hp, att));
				JOptionPane.showMessageDialog(null, "저장 완료!");
			} else if(select.equals("2")){
				try{
					FileOutputStream out;
					ObjectOutputStream oOut;
					
					out = new FileOutputStream("log.pok");
					oOut = new ObjectOutputStream(out);
					
					oOut.writeObject(arr);
					
					oOut.close();
					out.close();
					JOptionPane.showMessageDialog(null, "log.pok에 저장되었습니다.");
				} catch(Exception e){
					e.printStackTrace();
				}
			} else if(select.equals("3")){
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				return;
			} else {
				JOptionPane.showMessageDialog(null, "잘못 입력");
			}
		}
	}
}










