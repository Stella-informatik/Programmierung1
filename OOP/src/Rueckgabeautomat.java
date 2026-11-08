
public class Rueckgabeautomat {
public static int[]geldstueck=new int[]{200,100,50,20,10,5,2,1};
int[]best=new int[8];
public Rueckgabeautomat(int[]best) {
	this.best=best;
}
public String arrayInString(int []arr) {
	String st="";
	for(int i=0;i<8;i++) {
	st+=arr[i];	
	if(i<7) {
		st+=",";
	}
	}
	return "[" +st+"]";
}
public String toString() {
	return arrayInString(geldstueck);
}
public int [] bestand() {
	return this.best;
}
public String toString1() {
	return arrayInString(best);
}

public int[] rest(double einzahl,double zahlend){
	int sum=(int)Math.round((einzahl-zahlend)*100);
	int[]ausgabe=new int[8];
	if(sum<=0) {
		return ausgabe;
	}
	
	for(int i=0;i<8;i++) {
		while(sum>=geldstueck[i] && best[i]>0) {
			sum-=geldstueck[i];
		this.best[i]--;
		ausgabe[i]++;
		}
	}
	
	if(sum>0) {
		System.out.println("Fehler: passendes Rückgeld nicht möglich");
	
	for(int i=0;i<8;i++) {
		this.best[i]+=ausgabe[i];
	}
	return new int[8];
	}
	return ausgabe;
}
}
