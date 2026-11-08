
public class A380 extends Passagierflugzeug{
public static int n=0;
	public A380() {
		super(79.8,558,4*320.0);
	n++;
	}
	public static int getAnzahl() {
		return n;
	}
	@Override
	public String toString() {
		return "Spannweite: "+spannw+" ,"+"Sitze: "+sitz+","+"Schub: "+schub+ "(Passagierflugzeugflugzeug)  A380";
	}
}
