
public class Lounge  {
private Getraenkekarte k=new Getraenkekarte();
	public Lounge() {
		k.neuesGetraenk(new Getraenk("Cola",200,250,0));
	}
	public Getraenkekarte getkarte() {
		return k;
	}
	public String bestellen(Person p1,String name) {
 	Getraenk h=k.suchen(name);
		if(h==null) {
			return "Getraenk nicht gefunden";
		}else if (p1.alt>=h.freialt){
			return "bitte schoen, ihr Getraenk";
 		}else {
 	return "nicht alt genug fuer das Getraenk";
	}
}
}
