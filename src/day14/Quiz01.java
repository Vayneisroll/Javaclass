package day14;

import javax.swing.JOptionPane;

//�ǽ� : ȸ������ ���α׷�
//
//�̸��ϰ� ��й�ȣ�� �Է� �������� 
//�̶�, ���Ŀ� ��߳� �Է��� ������ �ش� �׸��� �ٽ� �Է� ��������.
//1. �̸��� : 
//- @�� �ݵ�� �־�� �� => constains()
//- .com, .net, .org, .edu, .co.kr �� �ϳ��� ������ �� => endsWith()
// ���ܻ�Ȳ
//  ���̵� ���Է� : @naver.com (X) => startsWith()
//  ������ ���Է� : issell@.net (X) => contains("@.") 
//2. ��й�ȣ : 
//- 4�� �̻� 12�� ���Ϸ� ���� => length()
//- ��й�ȣ ���Է� �ް�, �� ����� �ٸ��� �ٽ� ��� ��� => equals()
//
//3. ���̵� 
//- �̸��� ���̵�� �ڵ� ��� => indexOf(), subString()
//
//=> ������ ������ "ȸ������ �Ϸ�!" ����ϰ�,
// ����� �̸���, ���̵�, ���(�� 2���ڸ� �����ְ� ���� ���ڴ� *ó��) 
class Account{
	String id;
	String email;
	private String password;
	
	boolean putEmail(){
		String email = JOptionPane.showInputDialog("E-mail�� �Է��ϼ���.");
		String[] end = {".com", ".net", ".org", ".edu", ".co.kr"};
		if (!email.contains("@")) {
			JOptionPane.showMessageDialog(null, "@�� �����ϼž� �մϴ�.");
			return false;
		}
		if (email.startsWith("@")) {
			JOptionPane.showMessageDialog(null, "���� ���̵� �Է��ϼž��մϴ�.");
			return false;
		}
		if (email.contains("@.")) {
			JOptionPane.showMessageDialog(null, "�������� �����ϼž� �մϴ�.");
			return false;
		}
		for(String e:end){
			if(email.endsWith(e)){
				this.email=email;
				putId();
				return true;
			}
		}
		JOptionPane.showMessageDialog(null, "�������� �����ϼž� �մϴ�.");
		return false;
	}
	
	void putId(){
		int index = email.indexOf("@");
		id = email.substring(0, index);
	}
	
	boolean putPassword(){
		String password = JOptionPane.showInputDialog("��й�ȣ�� ����ϼ���.");
		String rePassword;
		if(password.length()<4 ||password.length()>12){
			JOptionPane.showMessageDialog(null, "4 ~ 12�� ���� �����ϼ���.");
			return false;
		}
		rePassword = JOptionPane.showInputDialog("�� �� �� �Է����ּ���.");
		if(!password.equals(rePassword)){
			JOptionPane.showMessageDialog(null, "��ġ���� �ʽ��ϴ�. �ٽ� ����ϼ���.");
			return false;
		}
		this.password = password;
		return true;
	}
	String getPassword(){
		int index = password.length()-2;
		String tmp = password.substring(0, 2);
		for(int i = 1; i<= index; i++){
			tmp+="*";
		}
		return tmp;
	}
	
	@Override
	public String toString(){
		return "ID: " + id + "\n"
				+ "E-mail: " + email + "\n"
				+ "PW: " + getPassword();
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		Account acc = new Account();
		while(!acc.putEmail());
		while(!acc.putPassword());
		JOptionPane.showMessageDialog(null, acc);
	}
}






