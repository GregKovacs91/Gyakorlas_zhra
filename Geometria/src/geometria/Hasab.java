package geometria;

public abstract class Hasab {
	private double magassag;
	public Hasab(double magassag){
		this.magassag = magassag;
	}
	public double getMagassag(){
		return magassag;
	}
	public abstract double alapterulet();
	
	public double terfogat(){
		return this.magassag * alapterulet();
	}
	public boolean nagyobbTerfogatu(Hasab masik){
		return this.terfogat() > masik.terfogat();
	}

}
