
public class Polynom {
	public static int n=0;
double[]koeffizienten;
public Polynom(double[]koeffizienten) {
	int b = koeffizienten.length;
	while(b>0 &&koeffizienten[b-1]==0) {
		 b--;
	}
	this.koeffizienten=new double[koeffizienten.length];
		for(int i=0;i<koeffizienten.length;i++) {
			 this.koeffizienten[i]=koeffizienten[i];
}
	
	n++;
}
public String toString() {
	String res="";
	
	for(int i=this.koeffizienten.length-1;i>=0;i--) {
		 res+=(this.koeffizienten[i]+"*x^"+i).toString();
	if(i>0) {
		String kom="+";
		 res+=kom;
	}
	}
		return res;
}
public double auswerten(double x) {
	double sum=0;
	for(int i=this.koeffizienten.length-1;i>=0;i--) {
		sum+=(this.koeffizienten[i])*(Math.pow(x,i));
	}
	return sum;
}
public static int getAnzahl() {
	return n;
}
}

