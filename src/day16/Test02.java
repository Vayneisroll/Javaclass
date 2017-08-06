package day16;

import javax.swing.JOptionPane;

/*
 * < 비정상 작동 >
 * 1. 에러 : 프로그램으로 만들 수 없음
 * 2. 경고 : 왠만하면 바꿨으면... 
 * 3. 예외 : 돌발상황 
 * 
 * < 예외 클래스 > 
 * 1. 모든 돌발상황을 상황별로 클래스로 만들어 둠
 * 2. try - catch를 통해서 위에서 발생하는 예외상황을 손쉽게 처리할 수 있다. 
 * 3. Exception 클래스 : 모든 예외클래스의 루트클래스
 * 
 * < try - catch (예외처리) > 
 * 형식 : 
 *  try{
 *  
 *  	// 예외상황이 발생할 가능성이 있는 코드
 *  
 *  } catch(예외클래스1 변수명){
 *  	// 예외상황1이 발생하면 작업할 명령들
 *  } catch(예외클래스2 변수명){
 *  	// 예외상황2가 발생하면 작업할 명령들
 *  } finally { // (선택사항)
 *   	// 정상, 비정상이든 무조건 마지막에 처리해야할 작업
 *  }
 */
public class Test02 {
	public static void main(String[] args) {
		// 두 수를 입력 받고, 나눈 몫을 출력
		try{ // 예외상황이 발생할 가능성이 있는 코드
			String data;
			int n1, n2;
			data =JOptionPane.showInputDialog("정수 1");
			n1 = Integer.parseInt(data);//NumberFormatException
			data =JOptionPane.showInputDialog("정수 2");
			n2 = Integer.parseInt(data);//NumberFormatException
			JOptionPane.showMessageDialog(null, n1/n2);//ArithmeticException
		} catch(NumberFormatException e){
			e.printStackTrace(); // catch 안하면 기본적으로 실행되는 메소드
			JOptionPane.showMessageDialog(null, "정수를 입력하셔야합니다.");
		} catch(ArithmeticException e){
			JOptionPane.showMessageDialog(null, "0으로 나눌 수 없습니다.");
		} finally {
			JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
		}
		
		try{ // 예외상황이 발생할 가능성이 있는 코드
			String data;
			int n1, n2;
			data =JOptionPane.showInputDialog("정수 1");
			n1 = Integer.parseInt(data);//NumberFormatException
			data =JOptionPane.showInputDialog("정수 2");
			n2 = Integer.parseInt(data);//NumberFormatException
			JOptionPane.showMessageDialog(null, n1/n2);//ArithmeticException
		} catch(Exception e){ // 모든 예외클래스를 소화할 수 있음
			e.printStackTrace(); // catch 안하면 기본적으로 실행되는 메소드
			JOptionPane.showMessageDialog(null, "예기치 않은 돌발상황.");
		} finally {
			JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
		}
	}
}





