
public class Flugzeug {
public static int n=0;
double spannw;
int sitz;
public Flugzeug(double spannw ,int sitz) {
	this.spannw=spannw;
	this.sitz=sitz;
	n++;
}
public static int getAnzahl() {
	return n;
}
public String toString() {
	return "Spannweite: "+spannw+","+"Sitze:"+sitz;
}

}
