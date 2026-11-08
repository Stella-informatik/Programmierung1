
public class Ergebnis extends Student {
float note;
int punktzahl;
public static int n=0;

public Ergebnis(Student willi,float note,int punktzahl) {
	super(willi.vorname,willi.name,willi.matrnummer);
	this.note=note;
	this.punktzahl=punktzahl;
}



@Override
public  String toString() {
	return super.toString()+" "+"Note= "+note+" "+"Punktzahl= "+ punktzahl;
}
}

