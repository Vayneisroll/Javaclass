package day19;
/*
 *  Quiz02
 * 	메뉴 	
 * 		1. 데이터 불러오기 (모든 포켓몬 보여줌)
 * 		2. 포켓몬 검색
 * 		3. 종료
 * 
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;
public class Quiz02 {
	public static void main(String[] args) {
		String menu = "1. 데이터 불러오기 \n2. 포켓몬 검색 \n3. 종료";
		String select;
		ArrayList<Pokemon> arr = null;
		while(true){
			select= JOptionPane.showInputDialog(menu);
			if(select.equals("1")){
				try{
					FileInputStream in;
					ObjectInputStream oIn;
					in = new FileInputStream("log.pok");
					oIn = new ObjectInputStream(in);
					
					
					arr = (ArrayList<Pokemon>)oIn.readObject();
					
					in.close();
					oIn.close();
					
					Collections.sort(arr);
					String msg = "=====포켓몬 리스트=====\n";
					for(Pokemon p : arr){
						msg += p.toString() + "\n"; 
					}
					JOptionPane.showMessageDialog(null, msg);
					
				} catch( Exception e){
					e.printStackTrace();
				}
			} else if(select.equals("2")){
				if(arr==null){
					JOptionPane.showMessageDialog(null, "포켓몬 정보를 먼저 불러오세요.");
					continue;
				}
				String name = JOptionPane.showInputDialog("검색할 이름");
				boolean check = false;
				for(Pokemon p:arr){
					if(p.name.equals(name)){
						JOptionPane.showMessageDialog(null, p.toString());
						check = true;
						break;
					}
				}
				if(!check){
					JOptionPane.showMessageDialog(null, "찾으시는 포켓몬이 없습니다.");
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
