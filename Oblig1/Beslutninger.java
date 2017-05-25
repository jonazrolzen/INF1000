import java.util.Scanner; //Importerer scanner verktoyet slik at vi kan lese ting fra terminalen.

class Beslutninger {
    public static void main(String[] args) {
      int alder; //Oppretter en variabel som heter alder og som forelopig er uspesifisert.

        System.out.println("Sjekk om du er myndig!"); //Skriver setningen "Sjekk om du er myndig! ut til terminalen.
      Scanner tastatur = new Scanner(System.in); //Oppretter en scanner som heter tastatur.

        System.out.println("Skriv inn din alder: ");
        alder = Integer.parseInt(tastatur.nextLine()); // Scanneren tastatur venter paa input fra terminalen som den kan legge i boksen alder.

        if(alder >=18) { //Hvis alder er storre eller lik 18 saa vil den skrive ut setningen "Du er myndig." til terminalen.
          System.out.println("Du er myndig.");
        }
        else { //Hvis alder er under 18 saa vil den skrive ut setningen "Du er ikke myndig." til terminalen.
          System.out.println("Du er ikke myndig.");
        }
  }
}
