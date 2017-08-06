package day19;
/*
 *  Quiz02
 * 	�޴� 	
 * 		1. ������ �ҷ����� (��� ���ϸ� ������)
 * 		2. ���ϸ� �˻�
 * 		3. ����
 * 
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;
public class Quiz02 {
	public static void main(String[] args) {
		String menu = "1. ������ �ҷ����� \n2. ���ϸ� �˻� \n3. ����";
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
					String msg = "=====���ϸ� ����Ʈ=====\n";
					for(Pokemon p : arr){
						msg += p.toString() + "\n"; 
					}
					JOptionPane.showMessageDialog(null, msg);
					
				} catch( Exception e){
					e.printStackTrace();
				}
			} else if(select.equals("2")){
				if(arr==null){
					JOptionPane.showMessageDialog(null, "���ϸ� ������ ���� �ҷ�������.");
					continue;
				}
				String name = JOptionPane.showInputDialog("�˻��� �̸�");
				boolean check = false;
				for(Pokemon p:arr){
					if(p.name.equals(name)){
						JOptionPane.showMessageDialog(null, p.toString());
						check = true;
						break;
					}
				}
				if(!check){
					JOptionPane.showMessageDialog(null, "ã���ô� ���ϸ��� �����ϴ�.");
				}
				
			} else if(select.equals("3")){
				JOptionPane.showMessageDialog(null, "���α׷� ����");
				return;
			} else {
				JOptionPane.showMessageDialog(null, "�߸� �Է�");
			}
		}
	}
}	
