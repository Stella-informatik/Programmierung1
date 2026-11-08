
public class Getraenkekarte {
public int n =0;
Getraenk[] g=new Getraenk[0];

	public void neuesGetraenk(Getraenk h) {
		Getraenk[]neu=new Getraenk[n+1];
	for(int i=0;i<n;i++) {
		neu[i]=g[i];
	}
	neu[n]=h;
	g=neu;
	
	n++;}
@Override
public String toString() {
	String result=" ";
	for (int i=0;i<n;i++) {
		Getraenk h=g[i];
	result+=h.toString()+"/n";
	}
	return result;
}

public Getraenk suchen(String name) {
 for (int i=0;i<n;i++) {
	 Getraenk h=g[i];
	 if(h.name.equals(name)) {
		 return h;
	 }
 }
 return null;
}
}
	

