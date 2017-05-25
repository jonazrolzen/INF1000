import java.util.Scanner; //Importerer scanner verktoyet.

class Metoder {
    public static void main(String[] args) {

      navnsted(); //Kaller paa void metoden navnsted. Den vil da hente koden som er skrevet nedenfor.
      navnsted();
      navnsted();
    }


    public static void navnsted(){ //Oppretter en void metode som heter navnsted.
        Scanner tastatur = new Scanner(System.in); //Oppretter en scanneren tastatur.

        System.out.println("Skriv inn navnet ditt: "); //Skriver ut setningen som er skrevet mellom parantesene til terminalen.
        String navn = tastatur.nextLine(); //Venter paa input fra terminalen som den kan legge inn i variabelen navn.
        System.out.println("Skriv inn ditt bosted: ");
        String bosted = tastatur.nextLine();
        System.out.println("Hei, " + navn + "! Du er fra "+ bosted + "!");
        //Skriver ut en setning som bruker variabelene navn og bosted som vi har definert via terminalen.
 }
}
