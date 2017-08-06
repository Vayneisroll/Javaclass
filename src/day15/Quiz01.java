package day15;

import javax.swing.JOptionPane;
import java.util.ArrayList;
/*
 * < ���� ���� ���α׷� >
 * Nation Ŭ���� ����� 
 *  �ʵ� : ������, ������, �α���
 *  �޼ҵ� : 
 *    ������ : �⺻ ������
 *    		   ������, ������, �α��� ��� �ְ� ������ ������
 *    toString() �������̵�
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
		return "[������:"+nation+", ����:"+capital +", �� " + pop + "��]";
	}
}
 /*    
 *    
 * Quiz01 
 *  �޴� : 
 *  	1. ���� ���
 *  	2. ��� ���� ���� 
 *  	3. ���� �˻� (�̸����� �˻�, "�ֽ��ϴ�" / "�����ϴ�")
 *  	0. �����ϱ� 
 *   + ���� ���� (�̸����� �˻� ��, ������ ����) 
 */

public class Quiz01 {
	public static void main(String[] args) {
		String menu = "1. ������� \n"
					  +"2. ��� ���� ���� \n"
					  +"3. ���� �˻� \n"
					  +"4. ���� ���� \n"
					  +"0. �����ϱ� \n";
		String select;
		ArrayList<Nation> arr = new ArrayList<Nation>();
		while(true){
			select = JOptionPane.showInputDialog(menu);
			if(select.equals("1")){
				String nation, cap, sPop;
				int pop;
				nation = JOptionPane.showInputDialog("������");
				cap = JOptionPane.showInputDialog("������");
				sPop = JOptionPane.showInputDialog("�α���");
				pop = Integer.parseInt(sPop);
				Nation n = new Nation(nation, cap, pop);
				arr.add(n);
				JOptionPane.showMessageDialog(null, "��ϵǾ����ϴ�.");
			} else if(select.equals("2")){
				String message = "===< ���� ����Ʈ >===\n";
				for(Nation tmp : arr){
					message += tmp.toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, message);
			} else if(select.equals("3")){
				String nation;
				nation = JOptionPane.showInputDialog("ã���� ������");
				
				String msg = null;
				boolean check = false;
				for(Nation tmp :arr){
					if(nation.equals(tmp.nation)){
						msg = tmp.toString();
						check = true;
					}
				}
				if(!check){
					msg = "ã���ô� ������ �����ϴ�.";
				}
				
				JOptionPane.showMessageDialog(null, msg);
				
			} else if(select.equals("4")){
				String nation;
				nation = JOptionPane.showInputDialog("�����Ͻ� ������");
				
				String msg = null;
				boolean check = false;
				Nation n = null; 
				for(Nation tmp :arr){
					if(nation.equals(tmp.nation)){
						msg = tmp.nation + "��(��) �����մϴ�..";
						n = tmp;
						check = true;
					}
				}
				if(!check){
					msg = "ã���ô� ������ �����ϴ�.";
				} else {
					arr.remove(n); 
				}
				JOptionPane.showMessageDialog(null, msg);
				
			} else if(select.equals("0")){
				JOptionPane.showMessageDialog(null, "���α׷� ����");
				return;
			} else {
				JOptionPane.showMessageDialog(null, "�߸� �Է�");
			}
		}
	}
}







