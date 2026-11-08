
public class Hyperbel extends Function {
int a;
public Hyperbel(int a) {
	this.a=a;
}
@Override
public double map(double x) {
	if(x==0) {
		return 0.0;
	}
	
	return this.a*Math.pow(x, -1);
}
}
