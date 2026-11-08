import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student willi=new Student("Willi","Wichtig",900);
		Student helga=new Student("Helga","Eifrig",901);
		
System.out.println(willi);
System.out.println(helga);

Ergebnis e1=new Ergebnis(willi,4.0f,60);
Ergebnis e2=new Ergebnis(helga,1.0f,118);
	System.out.println(e1);
	System.out.println(e2);
	
	Pruefung prog1=new Pruefung(e1,"Programmierung","28.01.2025",9);
	prog1.neuesErgebnis(e1);
	prog1.neuesErgebnis(e2);
	System.out.println(prog1);
	
	Person p1=new Person("Paul",16);
	System.out.println(p1);
	Getraenk g1=new Getraenk("Cola",200,250,0);
	Getraenk g2=new Getraenk("Vodka",200,200,16);
	Getraenk g3=new Getraenk("Bier",20,300,18);
	System.out.println(g1);
	System.out.println(g2);
	System.out.println(g3);
	Getraenkekarte gk=new Getraenkekarte();
	gk.neuesGetraenk(new Getraenk("Cola",200,250,0));
	System.out.println(gk);
	Getraenk g=gk.suchen("Cola");
	if(g!=null) {
	System.out.println(g);
	}
	Lounge l=new Lounge();
	System.out.println("Unsere Karte : \n"+l.getkarte());
	System.out.println(l.bestellen(p1, "Cola"));
	
	Scanner sc=new Scanner(System.in);
	System.out.println("gib mir zaehler");
	int zaehler=sc.nextInt();
	System.out.println("gib mir nenner");
	int nenner=sc.nextInt();
	Rational r1=new Rational(zaehler,nenner);
	System.out.println("gib mir ein Operator");
	String oper=sc.next();
	System.out.println("gib mir zaehler");
	int zaehler1=sc.nextInt();
	System.out.println("gib mir nenner");
	int nenner1=sc.nextInt();
	Rational r2=new Rational(zaehler1,nenner1);
	
	Rational ergb=null;
	if(oper.equals("+")) {
		ergb=r1.add(r2);
	}System.out.println(ergb);
	if(oper.equals("*")) {
		ergb=r1.mul(r2);
	}System.out.println(ergb);
	
	
	
	Weg w1=new Weg(1,1);
	Weg w2=new Weg(2,2);
	System.out.println(w1);
	System.out.println(w2);
	w1.verlaengern(w2);
	System.out.println(w1);
	double []koeffizienten= {3.0,2.0,1.0};
	Polynom p=new Polynom(koeffizienten);
	System.out.println(p);
	System.out.println(p.auswerten(2.0));
	System.out.println(p.getAnzahl());
	
	int[]best= {2,2,2,2,2,2,2,2};
	Rueckgabeautomat R=new Rueckgabeautomat(best);
	System.out.println(R);
	System.out.println(R.toString1());
	System.out.println(R.arrayInString(R.rest(1.0,0.57)));
	
	Function f=new Function();
	System.out.println(f.map(2));
	Function k=new Parabel(1,-2,2);
	System.out.println(k);
	k.print(-5.0,5.0,0.1);
	Function z= new Hyperbel(2);
	Function h=new Composed(k,z);
	h.map(2);
	
	Segelflugzeug sf = new Segelflugzeug(17.0);
	System.out.println(sf);
	Passagierflugzeug pg = new Passagierflugzeug(10.97, 4, 1.3);
	System.out.println(pg);
	A380 a380 = new A380();
	System.out.println(a380);
	System.out.println("Anzahl Flugzeug: "+Flugzeug.getAnzahl());
	System.out.println("Anzahl Segelflugzeuge: "+sf.getAnzahl());
	System.out.println("Anzahl Passagierflugzeuge: "+pg.getAnzahl());
	System.out.println("Anzahl A380: "+a380.getAnzahl());
	
	
	
	
	
	
	}
	}


