import java.util.Scanner; //Importerer scanner verktoyet
import java.io.File; //Importerer en ting som gjor at vi kan lese filer

class Innlesing {
    public static void main(String[] args)throws Exception {


      Scanner filLeser = new Scanner (new File ("winnie.txt")); //Oppretter en scanner som leser filen
      Scanner tastatur = new Scanner(System.in); //Oppretter en scanner som lytter til det brukeren skriver inn

      int antallGanger = 0; //Oppretter er variabel som skal brukes til aa telle antall ganger ordet forekommer

      System.out.println("Skriv inn ordet du vil soke etter:");
      String ord = tastatur.nextLine(); //Brukeren skriver inn hvilket ord han/hun vil soke etter


        while(filLeser.hasNextLine()){ //Oppretter en while-lokke som kjorer saa lenge scanneren filLeser har en linje aa lese
          if(filLeser.nextLine().equalsIgnoreCase(ord)){ /*Hvis ordet som ble lest inn fra filen matcher det ordet
            brukeren har tastet inn, saa legg til 1 til verdien til variabelen antallGanger*/
            antallGanger++;
          }
      }
      System.out.println("Ordet forekommer " + antallGanger + " ganger i teksten.");
      //Printer ut hvor mange ganger ordet forekommer i teksten til terminalen.
    }
}
