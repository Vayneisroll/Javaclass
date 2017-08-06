package day14;

import javax.swing.JOptionPane;

//실습 : 회원가입 프로그램
//
//이메일과 비밀번호를 입력 받으세요 
//이때, 형식에 어긋난 입력을 받으면 해당 항목을 다시 입력 받으세요.
//1. 이메일 : 
//- @가 반드시 있어야 함 => constains()
//- .com, .net, .org, .edu, .co.kr 중 하나로 끝나야 함 => endsWith()
// 예외상황
//  아이디 미입력 : @naver.com (X) => startsWith()
//  도메인 미입력 : issell@.net (X) => contains("@.") 
//2. 비밀번호 : 
//- 4자 이상 12자 이하로 지정 => length()
//- 비밀번호 재입력 받고, 두 비번이 다르면 다시 비번 등록 => equals()
//
//3. 아이디 
//- 이메일 아이디로 자동 등록 => indexOf(), subString()
//
//=> 저장이 끝나면 "회원가입 완료!" 출력하고,
// 등록한 이메일, 아이디, 비번(앞 2글자만 보여주고 남은 글자는 *처리) 
class Account{
	String id;
	String email;
	private String password;
	
	boolean putEmail(){
		String email = JOptionPane.showInputDialog("E-mail을 입력하세요.");
		String[] end = {".com", ".net", ".org", ".edu", ".co.kr"};
		if (!email.contains("@")) {
			JOptionPane.showMessageDialog(null, "@를 포함하셔야 합니다.");
			return false;
		}
		if (email.startsWith("@")) {
			JOptionPane.showMessageDialog(null, "메일 아이디를 입력하셔야합니다.");
			return false;
		}
		if (email.contains("@.")) {
			JOptionPane.showMessageDialog(null, "도메인을 포함하셔야 합니다.");
			return false;
		}
		for(String e:end){
			if(email.endsWith(e)){
				this.email=email;
				putId();
				return true;
			}
		}
		JOptionPane.showMessageDialog(null, "도메인을 포함하셔야 합니다.");
		return false;
	}
	
	void putId(){
		int index = email.indexOf("@");
		id = email.substring(0, index);
	}
	
	boolean putPassword(){
		String password = JOptionPane.showInputDialog("비밀번호를 등록하세요.");
		String rePassword;
		if(password.length()<4 ||password.length()>12){
			JOptionPane.showMessageDialog(null, "4 ~ 12자 내로 지정하세요.");
			return false;
		}
		rePassword = JOptionPane.showInputDialog("한 번 더 입력해주세요.");
		if(!password.equals(rePassword)){
			JOptionPane.showMessageDialog(null, "일치하지 않습니다. 다시 등록하세요.");
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






