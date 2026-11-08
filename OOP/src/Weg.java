
public class Weg {
Punkt []p;

public Weg(int x,int  y) {
	Punkt p1=new Punkt(x,y);
	this.p= new Punkt[] {p1};
	
}
public int getAnzahl() {
	return p.length;
}
public void verlaengern(Weg w) {
	Punkt[] neu=new Punkt[this.p.length+w.p.length];
	
	for (int i=0;i<p.length;i++) {
		neu[i]=p[i];
	}
	for(int i=0;i<w.p.length;i++) {
		neu[p.length+i]=w.p[i];
	}
	this.p=neu;
}
public String toString() {
	String res="";
	for(int i=0;i<p.length;i++) {
		res+=p[i].toString();
	if(i<p.length-1) {
		res+="-";
	}
	}
	return res;
}
}


