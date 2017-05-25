import java.util.Scanner; //Importerer scanner verktoyet.

class MinOppgave1 {
    public static void main(String[] args) {



      System.out.println("Velkommen til denne ukens SuperDuper Quiz!"); //Skriver ut en setningen som er skrevet mellom parantesene til terminalen.

        deltaker(); //
        sporsmaal1();
        sporsmaal2();
        sporsmaal3();
        /*Kaller paa de forskjellige void metodene som er skrevet under.
        Holder koden ryddig ved at hvis jeg f.eks. skal bruke en kodedel flere ganger saa slipper jeg aa skrive den paa nytt
        og all kode som tilhorer f.eks. det forste sporsmaalet ligger under sporsmaal1. */

      System.out.println("Whoops! Der har tiden gaatt fra oss. Tusen takk til vaar deltaker for en hederlig innsats i kveld. Vi fortsetter neste uke! God kveld!");

    }

    public static void deltaker(){ //Lager en void metode som heter deltaker.
      System.out.println("La oss ta i mot dagens deltager! Hva heter du?");
      System.out.println("Skriv inn navn: ");
      Scanner tastatur = new Scanner(System.in); //Oppretter en ny scanner
      String navn = tastatur.nextLine(); //Scanneren venter paa input fra terminalen etter en verdi som den kan legge inn i variabelen.
      System.out.println(" Hei, " + navn + "! Er du nervos i kveld? Ja eller nei?"); //Skriver ut en setning og bruker variabelen navn som vi definerte via terminalen.
      String nervos = tastatur.nextLine(); //Lager en variabel og venter paa input fra terminalen etter en verdi.
        if(nervos.equalsIgnoreCase("Ja")){ /*Hvis variabelen nervos inneholder ja, saa vil den skrive ut en setning
          som er knyttet til denne verdien. .equalsIgnoreCase gjor at den ikke bryr seg om store og smaa bokstaver.*/
          System.out.println("Hehe! Det er lett aa forstaa, men tiden loper fra oss!");
        }
        else if(nervos.equalsIgnoreCase("Nei")){ //Hvis nervos ikke er ja, saa sjekker den om nervos er nei.
          System.out.println("En deltaker med selvtillit?! Det liker vi! Vi starter med forste sporsmaal!");
        }
        else{ //Hvis nervos ikke er ja eller nei, saa vil den skrive ut setningen under.
          System.out.println("Svarer feil allerede for vi har begynt! Kan ikke love bra for resten av kvelden! Vi starter med forste sporsmaal!");
        }
    }

//Void metodene under fungerer paa samme maate som den ovenfor.
    public static void sporsmaal1(){
      System.out.println("Kveldens forste sporsmaal er: Hvem er statsminister i Norge? ");
      System.out.println("Skriv inn ditt svar: ");
      Scanner tastatur2 = new Scanner(System.in);
      String svar1 = tastatur2.nextLine();
        if(svar1.equalsIgnoreCase("Erna Solberg")){
          System.out.println("Det er riktig! Noen folger med paa nyhetene horer jeg!");
        }
        else{
          System.out.println("Beklager, men det er feil.");
        }
    }


    public static void sporsmaal2(){
      System.out.println("Kveldens andre sporsmaal: Er Bergen en by i Sverige? Ja eller nei?");
      System.out.println("Ja eller nei? Skriv inn ditt svar: ");
      Scanner tastatur3 = new Scanner(System.in);
      String svar2 = tastatur3.nextLine();
        if(svar2.equalsIgnoreCase("Ja")){
          System.out.println("Det er feil! Noen maa nok tilbake til barneskolen igjen! Hehe!");
        }
        else if(svar2.equalsIgnoreCase("Nei")){
          System.out.println("Det er riktig! Noen har fulgt med i timen!");
        }
    }


    public static void sporsmaal3(){
      System.out.println("Tredje sporsmaal er: Hva heter den velkjente rorleggeren som har sin egen spillserie laget av Nintendo?");
      Scanner tastatur4 = new Scanner(System.in);
      String svar3 = tastatur4.nextLine();
        if(svar3.equalsIgnoreCase("Mario")){
          System.out.println("Helt riktig!");
        }
        else if(svar3.equalsIgnoreCase("Super Mario")){
          System.out.println("Helt riktig!");
        }
        else{
          System.out.println("Det er dessverre feil. Riktig svar er Mario, men vi hadde ogsaa godkjent Super Mario.");
        }
    }
  }
