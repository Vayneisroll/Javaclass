package day15;

import javax.swing.JOptionPane;
import java.util.ArrayList;
/*
 * < 국가 관리 프로그램 >
 * Nation 클래스 만들기 
 *  필드 : 국가명, 수도명, 인구수
 *  메소드 : 
 *    생성자 : 기본 생성자
 *    		   국가명, 수도명, 인구수 모두 넣고 생성할 생성자
 *    toString() 오버라이드
 */   
class Nation {
	String nation;
	String capital;
	int pop;
	Nation(){}
	Nation(String n, String c, int p){
		nation = n;
		capital = c;
		pop = p;
	}
	public String toString(){
		return "[국가명:"+nation+", 수도:"+capital +", 약 " + pop + "명]";
	}
}
 /*    
 *    
 * Quiz01 
 *  메뉴 : 
 *  	1. 국가 등록
 *  	2. 모든 국가 보기 
 *  	3. 국가 검색 (이름으로 검색, "있습니다" / "없습니다")
 *  	0. 종료하기 
 *   + 국가 삭제 (이름으로 검색 후, 있으면 삭제) 
 */

public class Quiz01 {
	public static void main(String[] args) {
		String menu = "1. 국가등록 \n"
					  +"2. 모든 국가 보기 \n"
					  +"3. 국가 검색 \n"
					  +"4. 국가 삭제 \n"
					  +"0. 종료하기 \n";
		String select;
		ArrayList<Nation> arr = new ArrayList<Nation>();
		while(true){
			select = JOptionPane.showInputDialog(menu);
			if(select.equals("1")){
				String nation, cap, sPop;
				int pop;
				nation = JOptionPane.showInputDialog("국가명");
				cap = JOptionPane.showInputDialog("수도명");
				sPop = JOptionPane.showInputDialog("인구수");
				pop = Integer.parseInt(sPop);
				Nation n = new Nation(nation, cap, pop);
				arr.add(n);
				JOptionPane.showMessageDialog(null, "등록되었습니다.");
			} else if(select.equals("2")){
				String message = "===< 국가 리스트 >===\n";
				for(Nation tmp : arr){
					message += tmp.toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, message);
			} else if(select.equals("3")){
				String nation;
				nation = JOptionPane.showInputDialog("찾으실 국가명");
				
				String msg = null;
				boolean check = false;
				for(Nation tmp :arr){
					if(nation.equals(tmp.nation)){
						msg = tmp.toString();
						check = true;
					}
				}
				if(!check){
					msg = "찾으시는 국가가 없습니다.";
				}
				
				JOptionPane.showMessageDialog(null, msg);
				
			} else if(select.equals("4")){
				String nation;
				nation = JOptionPane.showInputDialog("삭제하실 국가명");
				
				String msg = null;
				boolean check = false;
				Nation n = null; 
				for(Nation tmp :arr){
					if(nation.equals(tmp.nation)){
						msg = tmp.nation + "을(를) 삭제합니다..";
						n = tmp;
						check = true;
					}
				}
				if(!check){
					msg = "찾으시는 국가가 없습니다.";
				} else {
					arr.remove(n); 
				}
				JOptionPane.showMessageDialog(null, msg);
				
			} else if(select.equals("0")){
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				return;
			} else {
				JOptionPane.showMessageDialog(null, "잘못 입력");
			}
		}
	}
}







