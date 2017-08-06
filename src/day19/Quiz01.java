package day19;
/*
 * Pokemon Ŭ���� 
 *  �ʵ� : �̸�, ü��, ���ݷ�
 * 	toString() �������̵� 
 *  ������
 *  compareTo() �������̵� (�̸�������)
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
 *  �޴� 
 *  	1. ���ϸ� ��� 
 *  	2. ������ ����
 *  	3. ����
 *  ** ArrayList ���
 *  
 */
public class Quiz01 {
	public static void main(String[] args) {
		ArrayList<Pokemon> arr = new ArrayList<Pokemon>();
		String menu = "1. ���ϸ� ��� \n2. ������ ���� \n3. ����";
		String select;
		while(true){
			select= JOptionPane.showInputDialog(menu);
			if(select.equals("1")){
				String name, sHp, sAtt;
				int hp, att;
				name = JOptionPane.showInputDialog("�̸�");
				sHp = JOptionPane.showInputDialog("ü��");
				hp = Integer.parseInt(sHp);
				sAtt = JOptionPane.showInputDialog("���ݷ�");
				att = Integer.parseInt(sAtt);
				arr.add(new Pokemon(name, hp, att));
				JOptionPane.showMessageDialog(null, "���� �Ϸ�!");
			} else if(select.equals("2")){
				try{
					FileOutputStream out;
					ObjectOutputStream oOut;
					
					out = new FileOutputStream("log.pok");
					oOut = new ObjectOutputStream(out);
					
					oOut.writeObject(arr);
					
					oOut.close();
					out.close();
					JOptionPane.showMessageDialog(null, "log.pok�� ����Ǿ����ϴ�.");
				} catch(Exception e){
					e.printStackTrace();
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










