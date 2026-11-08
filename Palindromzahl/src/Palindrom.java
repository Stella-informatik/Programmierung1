import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println("gib mir eine Zahl");
	 Scanner sc= new Scanner(System.in);
		int zahl= sc.nextInt();
		int y=spiegeln(zahl);
		int A=spiegeladdieren(zahl);
		int B=palindromtest(zahl);
		System.out.println(y);
		System.out.println(A);
		System.out.println(B);
	}
	 public static int spiegeln(int zahl) {
		 int x=0;
		 while(zahl>0) {
			 int z=zahl%10;
			 x=(x*10)+z;
			 zahl=zahl/10;
		  }
		 return x;
	 
	 }
	 public static int spiegeladdieren(int zahl) {
		 int y=spiegeln(zahl);
	 int summe=0;
	 summe=zahl+y;
	 return summe;
	
	}
	 public static int palindromtest(int zahl) {
		 int y=spiegeln(zahl);
			int A=spiegeladdieren(zahl);
			if(zahl==y) {
				return zahl;
			}else while(zahl!=y) {
				zahl=spiegeladdieren(zahl);
				y=spiegeln(zahl);
			}
			return zahl;
			
		 
	 }
}


