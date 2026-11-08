
public class Segelflugzeug extends Flugzeug {
public static int  n=0;
	public Segelflugzeug(double spannw) {
		super(spannw,1);
		n++;
	}
	public static int getAnzahl() {
		return n;
	}
	@Override
	public String toString() {
	 return "Spannweite: "+spannw+" ,"+"Sitze: "+sitz+" (Segelflugzeug)";	
	}
}
