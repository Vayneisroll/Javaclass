package day09;
/*
 * < 메소드 오버로드(overload) > 
 * - 하나의 메소드를 여러 버전으로 만들어 둠
 * - 메소드의 특징은..
 *   매개변수와 인자값의 개수와 자료형이 맞아야함..
 *   가끔은 1개 넣고 싶고, 가끔은 2개 넣고 싶고.. 
 *   
 * - 이름은 동일, 기능도 비슷, 
 *   단.. 매개변수 개수 or 자료형의 차이가 있어야함
 *   
 * - 리턴자료형은 상관없음(달라도 됨)
 * - 매개변수 이름이 다르다고 해서 오버로드 되는 건 아님
 * ex. show(String a){} / show(String b){} => error!!
 * 
 */
class A{
	void show(String s){
		System.out.println("인자값 : " + s);
	}
	int show(int s){
		System.out.println("인자값 : " + s);
		return 0;
	}
	
	int show(boolean s){
		System.out.println("인자값 : " + s);
		return 0;
	}
}
public class Test01 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(3.14);
		System.out.println(true);
		System.out.println();
		
		A a = new A();
		a.show("ABC");
		a.show(1);
		a.show(true);
	}
}
