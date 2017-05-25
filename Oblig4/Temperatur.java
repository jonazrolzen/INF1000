import java.util.Scanner; //Importerer scanner verktoyet
import java.io.File; //Gjor slik at vi kan lese filer som ligger paa maskinen. Naermere forklaring onskes.


class Temperatur{
    public static void main(String[] args)throws Exception{ // litt usikker paa hva throws Exception gjor.


      int[] temperaturer = new int[12]; //Oppretter en int-array med 12 plasser
      int teller = 0; //Oppretter en int variabel som vi kaller for teller
      Scanner fil = new Scanner(new File("temperatur.txt")); //Oppretter en scanner som leser filen vi har spesifisert

        while(fil.hasNextLine()){ //Oppretter en while-lokke som kjorer saa lenge scanneren fil har en linje til aa lese
          temperaturer[teller] = Integer.parseInt(fil.nextLine()); /*Sier at verdien i temperatur arrayen paa plassen som
          teller speifiserer er lik den neste linja som scanneren fil leser og gjor den om fra tekst til tall. */
          teller++; //Oker teller med 1
        }

      teller = 0; //nullstiller variabelen teller
      double tempSum = 0.0; //Oppretter en double variabel kalt tempSum med verdien 0.0

      for(teller = 0; teller < temperaturer.length; teller ++){ /*Oppretter en for-lokke som kjorer saa lenge telleren
        er mindre enn lengden til temperaturer arrayen. Ser forst at teller er f.eks. 0. Sjekker saa at telleren er mindre
        enn lengden til temperatur arrayen. Kjorer saa innholdet i lokken for den til sist legger til 1 til verdien i teller.*/
        tempSum = tempSum + temperaturer [teller]; //legger sammen verdiene fra arrayen inn i double variabelen
      }
      System.out.println("Gjennomsnittstemperaturen er: " + tempSum/12 + " grader Celcius.");
      //Skriver ut en setning og deler verdien til tempSum paa antall maaneder slik at vi faar gjennomsnittet.
    }
}
