
public class Student {
String vorname;
String name;
int matrnummer;
	
  public Student(String vorname,String name,int matrnummer){
	  this.vorname=vorname;
	  this.name=name;
	  this.matrnummer=matrnummer;
  }
  public String toString() {
	  return vorname+" "+name+" "+"("+ matrnummer+")";
  }
	}


