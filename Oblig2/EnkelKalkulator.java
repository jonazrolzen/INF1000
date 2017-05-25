import java.util.Scanner; //Importerer scanner verktoyet

class EnkelKalkulator {
  public static void main(String[] args){
    Scanner tastatur = new Scanner(System.in); //Oppretter en scanner

    System.out.println("Skriv inn forste tall:"); //Skriver ut en setning til terminalen
    int tall1 = tastatur.nextInt(); //Venter paa tall den kan legge i variabelen tall1
    System.out.println("Skriv inn det andre tallet:");
    int tall2 = tastatur.nextInt();

    addere(tall1, tall2); //kaller paa metoden med parameterene tall1 tall 2
    trekkeFra(tall1, tall2);
    multiplisere(tall1, tall2);
  }

  public static void addere(int a, int b){ //oppretter en metode der parameterene blir plassert
    System.out.println("Summen av tallene er: " + (a+b)); //skriver ut en setning og summen av parameterene
  }
  public static void trekkeFra(int a, int b){
    System.out.println("Differansen mellom tallene er: " + (a-b));
  }
  public static void multiplisere(int a, int b){
    System.out.println("Produktet av tallene er: " + (a*b));
  }

}
