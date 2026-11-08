
public class Parabel extends Function {
int a,b,c;
double []arr;
public Parabel(int a,int b,int c) {
	this.a=a;
	this.b=b;
	this.c=c;
}
@Override
public double map(double x) {
	return (this.a*Math.pow(x, 2))+(this.b*Math.pow(x, 1))+this.c;
}
}
