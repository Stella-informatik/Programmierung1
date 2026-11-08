
public class Getraenk {
String name;
int menge;
int preis;
int freialt;
public Getraenk(String name,int menge,int preis,int freialt) {
	this.name=name;
	this.menge=menge;
	this.preis=preis;
	this.freialt=freialt;
}
public String toString() {
	return "Name: "+name+","+" Menge: "+menge+","+" Preis: "+preis+","+" Altersfreigabe: "+freialt;
}
}
