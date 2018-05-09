package geometria;

public class Teglatest extends Hasab {
	private double aold;
	private double bold;
	public Teglatest (double magassag, double aold, double bold){
		super (magassag);
		this.aold = aold;
		this.bold = bold;
	}
	@Override
	public double alapterulet() {
		// TODO Auto-generated method stub
		return this.aold * this.bold;
	}
	@Override
	public String toString(){
		return "Téglatest: "+this.aold+", "+this.bold+", "+this.getMagassag();
	}

}
