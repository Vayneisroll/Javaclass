package day16;

import javax.swing.JOptionPane;

/*
 * < ������ �۵� >
 * 1. ���� : ���α׷����� ���� �� ����
 * 2. ��� : �ظ��ϸ� �ٲ�����... 
 * 3. ���� : ���߻�Ȳ 
 * 
 * < ���� Ŭ���� > 
 * 1. ��� ���߻�Ȳ�� ��Ȳ���� Ŭ������ ����� ��
 * 2. try - catch�� ���ؼ� ������ �߻��ϴ� ���ܻ�Ȳ�� �ս��� ó���� �� �ִ�. 
 * 3. Exception Ŭ���� : ��� ����Ŭ������ ��ƮŬ����
 * 
 * < try - catch (����ó��) > 
 * ���� : 
 *  try{
 *  
 *  	// ���ܻ�Ȳ�� �߻��� ���ɼ��� �ִ� �ڵ�
 *  
 *  } catch(����Ŭ����1 ������){
 *  	// ���ܻ�Ȳ1�� �߻��ϸ� �۾��� ��ɵ�
 *  } catch(����Ŭ����2 ������){
 *  	// ���ܻ�Ȳ2�� �߻��ϸ� �۾��� ��ɵ�
 *  } finally { // (���û���)
 *   	// ����, �������̵� ������ �������� ó���ؾ��� �۾�
 *  }
 */
public class Test02 {
	public static void main(String[] args) {
		// �� ���� �Է� �ް�, ���� ���� ���
		try{ // ���ܻ�Ȳ�� �߻��� ���ɼ��� �ִ� �ڵ�
			String data;
			int n1, n2;
			data =JOptionPane.showInputDialog("���� 1");
			n1 = Integer.parseInt(data);//NumberFormatException
			data =JOptionPane.showInputDialog("���� 2");
			n2 = Integer.parseInt(data);//NumberFormatException
			JOptionPane.showMessageDialog(null, n1/n2);//ArithmeticException
		} catch(NumberFormatException e){
			e.printStackTrace(); // catch ���ϸ� �⺻������ ����Ǵ� �޼ҵ�
			JOptionPane.showMessageDialog(null, "������ �Է��ϼž��մϴ�.");
		} catch(ArithmeticException e){
			JOptionPane.showMessageDialog(null, "0���� ���� �� �����ϴ�.");
		} finally {
			JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
		}
		
		try{ // ���ܻ�Ȳ�� �߻��� ���ɼ��� �ִ� �ڵ�
			String data;
			int n1, n2;
			data =JOptionPane.showInputDialog("���� 1");
			n1 = Integer.parseInt(data);//NumberFormatException
			data =JOptionPane.showInputDialog("���� 2");
			n2 = Integer.parseInt(data);//NumberFormatException
			JOptionPane.showMessageDialog(null, n1/n2);//ArithmeticException
		} catch(Exception e){ // ��� ����Ŭ������ ��ȭ�� �� ����
			e.printStackTrace(); // catch ���ϸ� �⺻������ ����Ǵ� �޼ҵ�
			JOptionPane.showMessageDialog(null, "����ġ ���� ���߻�Ȳ.");
		} finally {
			JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
		}
	}
}





