import java.util.Scanner;

class Lokker{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		String svar = "";

		//
		// if (a.equals(b))			//Betyr: hvis a er lik b
		// if (!a.equals(b)) 		//Betyr: hvis a IKKe er lik b
		//


		//Lokken etterspor og lar bruker skrive inn fine ord, helt til brukeren
		//skriver inn SLUTT i store bokstaver:
		while (!svar.equals("SLUTT")){
			System.out.println("Skriv inn fine ord: ");
			svar = in.nextLine();
		}


	}
}
