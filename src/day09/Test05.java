package day09;

class ATeam{
	String name;
	int count; // ÀüÃ¼ ÆÀ¿ø¼ö
}
class BTeam{
	String name;
	static int count; // ÀüÃ¼ ÆÀ¿ø¼ö
}
public class Test05 {
	public static void main(String[] args) {
		ATeam a1 = new ATeam();
		a1.name ="ÇÇÄ«Ãò";
		a1.count = 1; 
		
		ATeam a2 = new ATeam();
		a2.name = "¶óÀÌÃò";
		a2.count = 2;
		a1.count = 2; 
		
		ATeam a3 = new ATeam();
		a3.name = "²¿ºÎ±â";
		a3.count = 3;
		a2.count = 3;
		a1.count = 3; 
//		=====================================
		BTeam b1 = new BTeam();
		b1.name = "ÇÇÄ«Ãò";
		BTeam.count++; 
		
		BTeam b2 = new BTeam();
		b2.name = "¶óÀÌÃò";
		b2.count++; 
		
		BTeam b3 = new BTeam();
		b3.name = "²¿ºÎ±â";
		b3.count++; 
		
		System.out.println(b1.count);
		System.out.println(b2.count);
		System.out.println(b3.count);
	}
}



