package geometria;
import geometria.Henger;
import geometria.Teglatest; 

public class HasabProba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Henger heng = new Henger(10, 2);
		System.out.println(heng);
		System.out.println("T�rfogat: "+heng.terfogat());
		
		Teglatest tegla = new Teglatest(6, 8, 4);
		System.out.println(tegla);
		System.out.println("T�rfogat: " +tegla.terfogat());
		
		if (heng.nagyobbTerfogatu(tegla))
			System.out.println("A nagyobb: " + heng);
		else
			System.out.println("A nagyobb: " + tegla);
	}

}
