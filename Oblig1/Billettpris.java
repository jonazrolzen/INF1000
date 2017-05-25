import java.util.Scanner; //Importerer scanner verktoyet.

class Billettpris {
    public static void main(String[] args) {

    System.out.println("Sjekk hvor mye du maa betale paa trikken!"); //Skriver ut en setning til terminalen.

      Scanner tastatur = new Scanner(System.in); //Oppretter en ny scanner som heter tastatur.

      System.out.println("Skriv inn din alder: ");
    int alder = Integer.parseInt(tastatur.nextLine()); //Scanneren venter paa input fra terminalen som den kan legge i alder.

        if(alder <=12) { //Sjekker om alder er 12 eller lavere og vil skrive ut en setning til terminalen dersom det er sant.
          System.out.println("Du skal betale 25 kr.");
        }
        else if(alder >=67) { //Hvis alder ikke er 12 eller lavere, saa vil den sjekke om alder er 67 eller hoyere og vil skrive ut en setning dersom det er sant.
          System.out.println("Du skal betale 25kr."); //Gaar vel kanskje ogsaa aa bruke ||, men jeg fikk det ikke til aa funke.
        }
        else { //Hvis alder ikke er en av de nevnt ovenfor saa vil den skrive ut setningen spesifisert under.
          System.out.println("Du skal betale 50 kr.");
        }
  }
}
