
public class Composed extends Function {
	Function f;
	Function g;
public Composed(Function f, Function g){
	this.f=f;
	this.g=g;
}
@Override
//polymorphie
public double map(double x) {
	return g.map(f.map(x));
}
	
}

