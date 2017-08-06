package day15;
import java.util.*; 

public class Test03 {
	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("ÇÇÄ«Ãò",3));
		ts.add(new Person("È«±æµ¿",40));
		ts.add(new Person("¶óÀÌÃò",5));
		ts.add(new Person("ÇÇÃò",1));
		ts.add(new Person("¶Ñ¹÷ÃÊ",12));
		ts.add(new Person("È«±æµ¿",3));
		System.out.println(ts);
	}
}
