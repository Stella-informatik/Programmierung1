
public class Passagierflugzeug extends Flugzeug{
public static int n=0;
	double schub;
public Passagierflugzeug(double spannw,int sitz,double schub) {
	super(spannw,sitz);
	this.schub=schub;
	n++;
}
public static  int getAnzahl() {
	return n;
}
@Override
public String toString() {
	return "Spannweite: "+spannw+" ,"+"Sitze: "+sitz+","+"Schub: "+schub+ "(Passagierflugzeug)";
}
}
