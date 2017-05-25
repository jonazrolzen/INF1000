import java.util.Scanner; //importerer scanner verktoyet

class FirstArray {
    public static void main(String[] args){
      Scanner tastatur = new Scanner(System.in); //oppretter en scanner

        int[] tall = new int[4]; //lager en int-array med 4 plasser
        String svar = "Ja"; //gir String variabelen verdien "Ja"


        while(tall [1] != 1) { //oppretter en lokke som kjorer saa lenge den andre plassen i int-arrayen ikke er lik 1
          tall [1] = 1; //endrer den andre plassen i int-arrayen til 1 slik at lokken blir brutt
          tall [2] = 2;
          tall [3] = 3;
        }
        while(tall [0] != 1337){ //oppretter en lokke som kjorer saa lenge den forste plassen ikke er 1337.
          tall [0] = 1337; //endrer verdien paa den forste plassen til 1337 slik at lokken blir brutt
          tall [3] = 1337;
        }

        String[] navn = new String[5]; //oppretter en String-array med 5 plasser

      while( svar.equalsIgnoreCase("Ja")){ //oppretter en lokke som kjorer saa lenge variabelen svar er lik ja (noe den er naa)
      System.out.println("Vil du kjore lokken? Ja eller Nei?");
      svar = tastatur.nextLine(); //bruker skriver inn enten ja eller nei. dette bestemmer om lokken skal kjores paa nytt

        System.out.println("Skriv inn 5 navn.");  //Brukeren skriver inn 5 navn som blir plassert paa hver sin plass i String-arrayen
        System.out.println("Skriv inn navn nummer 1:");
        navn [0] = tastatur.nextLine();
        System.out.println("Skriv inn navn nummer 2:");
        navn [1] = tastatur.nextLine();
        System.out.println("Skriv inn navn nummer 3:");
        navn [2] = tastatur.nextLine();
        System.out.println("Skriv inn navn nummer 4:");
        navn [3] = tastatur.nextLine();
        System.out.println("Skriv inn navn nummer 5:");
        navn [4] = tastatur.nextLine();

        System.out.println("Innhold i int-array:"); //Priter ut verdiene i int-arrayen
          System.out.println(tall [0]);
          System.out.println(tall [1]);
          System.out.println(tall [2]);
          System.out.println(tall [3]);

        System .out.println("Innhold i String-array:"); //printer ut verdiene i String-arrayen
          System.out.println(navn [0]);
          System.out.println(navn [1]);
          System.out.println(navn [2]);
          System.out.println(navn [3]);
          System.out.println(navn [4]);
      }


/*
Beklager at denne oppgaven er saa rotete. Skulle rekke noe annet.*/






    }
}
