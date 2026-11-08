
public class Rational {
private int nenner;
private int zaehler;
public Rational(int zaehler) {
	this.zaehler=zaehler;
	nenner=1;
	
}
public Rational(int zaehler, int nenner) {
	if (nenner==0) {
		System.out.println("Nenner ist 0");
		}
    this.zaehler=zaehler/(ggT(nenner,zaehler));
	this.nenner=nenner/(ggT(nenner,zaehler));
	
	if(nenner<0) {
		nenner=-nenner;
		zaehler=-zaehler;
	}
	
}
public static int ggT(int a,int b) {
	a=Math.abs(a);
	b=Math.abs(b);
	while(b!=0) {
		int tmp=a%b;
	   a=b;
	   b=tmp;
	}
	return a;
}
public String toString() {
	return this.zaehler+"/"+this.nenner;
}
public  Rational add(Rational other) {
	int neuzaehler=0;
	int neunenner=0;
	if(this.nenner==other.nenner) {
		 neuzaehler=this.zaehler+other.zaehler;
		 neunenner=this.nenner;
	}
		return new Rational(neuzaehler,neunenner);	
	
	
}
public  Rational sub(Rational other) {
	int neuzaehler=0;
	int neunenner=0;
	if(this.nenner==other.nenner) {
		 neuzaehler=this.zaehler-other.zaehler;
		 neunenner=this.nenner;	
	}
	return new Rational(neuzaehler,neunenner);
}
public  Rational mul(Rational other) {
		int neuzaehler=this.zaehler*other.zaehler;
		int neunenner=this.nenner*other.nenner;
		
	
	return new Rational(neuzaehler,neunenner);
}
public  Rational div(Rational other) {
		int neuzaehler=this.zaehler*other.nenner;
		int neunenner=this.nenner*other.zaehler;
		
	return new Rational(neuzaehler,neunenner);
}
}
