import java.util.Scanner; //Importerer scanner verktoyet.

class LikeVerdier {
    public static void main(String[] args) {

    System.out.println("Sjekk om verdiene for c og d er like!"); //Skriver ut en setning til terminalen.

    Scanner tastatur = new Scanner(System.in); //Oppretter scanneren tastatur.

    System.out.println("Skriv inn verdien for c: ");
  int c = Integer.parseInt(tastatur.nextLine()); //Scanneren venter paa input fra terminalen som den kan legge i variabelen c.

    System.out.println("Skriv inn verdien for d: ");
  int d = Integer.parseInt(tastatur.nextLine()); //Scanneren vener paa input fra terminalen som den kan legge i variabelen d.

    if(c == d) { //Sjekker om verdiene for c og d er like og vil dersom det er sant, skrive ut en setning som sier at de er like.
      System.out.println("c er lik d.");
    }
    else { //Hvis verdiene ikke for c og d ikke er like saa vil den skrive ut en setning som sier at de ikke er like.
      System.out.println("c er ikke lik d.");
    }

  }
}
