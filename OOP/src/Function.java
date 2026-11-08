
public class Function {

	public double map(double x) {
		return x;
	}
	public void print(double e,double f, double g){
		for(double i=e;i<=f;i+=g) {
		double y=this.map(i);	
	System.out.println(i+" | "+y);
		}
}
}
