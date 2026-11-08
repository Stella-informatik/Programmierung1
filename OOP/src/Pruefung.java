
public class Pruefung extends Ergebnis {
String pname;
String datum;
int credit;
public Pruefung(Ergebnis e1,String pname,String datum,int credit) {
	super(e1,e1.note,e1.punktzahl);
	this.pname=pname;
	this.datum=datum;
	this.credit=credit;
}
 void neuesErgebnis(Ergebnis e) {
	n++;
	
 }
 @Override
 public String toString() {
	 return "Pruefung "+pname+" vom "+datum+" mit "+credit;
 }
}
