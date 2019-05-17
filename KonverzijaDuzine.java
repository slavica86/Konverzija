package projekat;
import java.util.Scanner;

public class KonverzijaDuzine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner (System.in);
		System.out.println("Unesi duzinu i incima:");
		double duzina = ulaz.nextDouble();
		double duzinaCm = duzina/0.3937;
		System.out.println("Duzina u cm: "+duzinaCm);
		ulaz.close();
		

	}

}
