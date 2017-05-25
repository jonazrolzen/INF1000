import java.util.Scanner; //Importerer scanner verktoyet

class SumTall {
    public static void main(String[] args) {

      Scanner tastatur = new Scanner(System.in); //oppretter en scanner
      int plussTall; //Oppretter en heltalls variabel
      int resultat;

      resultat = 0; //gir variabelen en verdi
      plussTall = 1;

      while (plussTall != 0){ //oppretter en lokke som kjorer saa lenge plussTall ikke er 0
      System.out.println("Skriv inn et tall som skal bli addert:");
      plussTall = tastatur.nextInt(); //gir en ny verdi til plusstall som brukeren taster inn
      resultat = (resultat + plussTall); //resultat faar en ny verdi
      System.out.println("Tallet er naa: " + resultat); //sier til bruker hva den naaverende summen er
    }
    System.out.println("Resultatet ble til slutt: " + resultat); //Printer ut en setning og resultatet naar lokken blir brutt
  }
}
