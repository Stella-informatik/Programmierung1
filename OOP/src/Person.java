
public class Person {
String vorname;
int alt;
public Person(String vorname,int alt) {
	this.vorname=vorname;
	this.alt=alt;
}
	public String toString() {
		return vorname+" ("+alt+")";
	}
}

