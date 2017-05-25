/*DVDAdministrasjon.java har som oppgave aa holde kontroll paa personobjekter og utfoere metodene som brukeren oensker.
Den kan lese informasjon fra fil, input fra brukeren, kjoepe DVDer, laane DVDer, vise oversikt over personer, returnere
DVDer tilbake til eieren og avlsutte systemet.*/

import java.util.HashMap; //importerer HashMap verktoeyet
import java.util.Scanner; //importerer Scanner verktoeyet
import java.io.File; //importerer fil-verktoeyet

class DVDAdministrasjon{

  private HashMap<String, Person> navneliste = new HashMap <String, Person>();
  //oppretter et HashMap som holder paa Person-objekter med String-noekler

  private Scanner tastatur = new Scanner(System.in); //Oppretter Scanneren tastatur som tar imot input fra terminal

  public void lesFil(String filNavn) throws Exception{
    File fil = new File(filNavn);
    Scanner filLeser = new Scanner(fil);
    String sistLesteEier = null;
    String sistLesteDVD = null;
    String forrigeLinje = null;
    boolean bindestrek = false;


    while(filLeser.hasNextLine()){
      String linje = filLeser.nextLine();
      if(linje.equals("-")){
        if(bindestrek == false){
          bindestrek = true;
        }
      }
      else if(bindestrek == false){
        navneliste.put(linje, new Person(linje));
      }
      else if(forrigeLinje.equals("-")){
        sistLesteEier = linje;
      }
      else if(!navneliste.containsKey(linje)){
        if(linje.startsWith("*")){
          sistLesteDVD = linje.substring(1);
          navneliste.get(sistLesteEier).leggDVDTilArkiv(linje.substring(1));
        }
        else{
          sistLesteDVD = linje;
          navneliste.get(sistLesteEier).leggDVDTilArkiv(linje);
        }
      }
      else if(navneliste.containsKey(linje) && !linje.equals(sistLesteEier)){
        navneliste.get(linje).leggDVDTilLaant(sistLesteDVD, navneliste.get(sistLesteEier));
        navneliste.get(sistLesteEier).leggDVDTilUtlaant(sistLesteDVD);
      }
      forrigeLinje = linje;
    }
  }

  public void kommandoLoekke(){ //en kommandoloekke som kaller paa forskjellige metoder
    System.out.println("MENY FOR DVDAdministrasjon");
    System.out.println("1: Ny person");
    System.out.println("2: Kjop DVD");
    System.out.println("3: Laan DVD");
    System.out.println("4: Vis person/personer");
    System.out.println("5: Oversikt over personer");
    System.out.println("6: Returner DVD");
    System.out.println("7: Avslutt programmet");

    System.out.println("Skriv inn nummeret til funksjonen du vil utfoere:");
    int brukerValg = Integer.parseInt(tastatur.nextLine());

    switch (brukerValg){
      case 1: nyPerson();
              break;
      case 2: kjop();
              break;
      case 3: laan();
              break;
      case 4: vis();
              break;
      case 5: oversikt();
              break;
      case 6: retur();
              break;
      case 7: avslutt();
              break;
      default: System.out.println("Ugyldig verdi. Proev igjen.");
    }
    kommandoLoekke();
  }

  public void nyPerson(){
    //oppretter en ny person og legger dem til i navneliste dersom de ikke finnes der fra foer
    System.out.println("Skriv inn navnet paa personen:");
    String navn = tastatur.nextLine();
    if(!navneliste.containsKey(navn)){
      navneliste.put(navn, new Person(navn));
      System.out.println(navn + " er lagt inn i systemet.");
    }
    else{
      System.out.println("Denne personen finnes allerede i systemet.");
    }
  }

  public void kjop(){
    //Oppretter en ny DVD og legger den til i personens arkiv dersom personen eksisterer i navneliste
    System.out.println("Hvem skal kjope DVD:");
    String kjoper = tastatur.nextLine();
    if(navneliste.containsKey(kjoper)){
      System.out.println("Hvilken DVD skal kjopes:");
      String kjopDVDTittel = tastatur.nextLine();
      navneliste.get(kjoper).kjopDVD(kjopDVDTittel);
    }
  }

  public void laan(){
    //laaner bort en DVD dersom eieren og laaneren eksisterer og at eieren eier DVDen og at den ikke er laant bort allerede
    System.out.println("Hvem skal laane DVDen:");
    String laaner = tastatur.nextLine();
    System.out.println("Hvem skal DVDen laanes fra: ");
    String eier = tastatur.nextLine();
    System.out.println("Hvilken DVD skal laanes:");
    String dvdTittel = tastatur.nextLine();

    boolean eierskap = navneliste.get(eier).sjekkArkiv(dvdTittel);
    boolean utlaant = navneliste.get(eier).sjekkUtlaant(dvdTittel);

    if(navneliste.containsKey(laaner) && navneliste.containsKey(eier) && eierskap == true && utlaant == false && !laaner.equals(navneliste.get(eier).toString())){
      navneliste.get(eier).leggDVDTilUtlaant(dvdTittel);
      navneliste.get(laaner).leggDVDTilLaant(dvdTittel, navneliste.get(eier));
      System.out.println(laaner + " laaner naa " + dvdTittel + " av " + eier + ".");
      System.out.println("");
      return;
    }
    else if(!navneliste.containsKey(laaner)){
      System.out.println("Laaner: " + laaner + " finnes ikke i systemet.");
      return;
    }
    else if(!navneliste.containsKey(eier)){
      System.out.println("Eier: " + eier + " finnes ikke i systemet.");
      return;
    }
    else if(laaner.equals(navneliste.get(eier).toString())){
      System.out.println("Du kan ikke laane av deg selv din gjoek!");
      return;
    }
    else if(eierskap == false){
      System.out.println(eier + " eier ikke " + dvdTittel + ".");
      return;
    }
    else if(utlaant == true){
      System.out.println(eier + " eier " + dvdTittel + ", men laanes for oeyeblikket av " +
      navneliste.get(eier).hentDVDFraArkiv(dvdTittel).hvemLaaner().toString() + ".");
      return;
    }
  }

  public void vis(){
    //Viser en oversikt over eide, laant ut og laante DVDer for den oenskede personen/personene
    System.out.println("Skriv inn navnet paa den personen du vil vise. Skriv * hvis du vil vise alle.");
    String person = tastatur.nextLine();
    if(navneliste.containsKey(person)){
      navneliste.get(person).visPerson();
    }
    else if(person.equals("*")){
      for(Person p : navneliste.values()){
        p.visPerson();
        System.out.println("");
      }
    }
    else{
      System.out.println(person + " finnes ikke i systemet.");
    }
  }

  public void oversikt(){
    //Viser en oversikt over antall DVDer personenene i navneliste eier, laaner ut og laaner
    System.out.println("Oversikt over alle personene i systemet:");
    for(Person p : navneliste.values()){
      p.oversiktPerson();
    }

  }

  public void retur(){
    //returnerer en DVD fra laaner tilbake til eier dersom laaneren eksiterer og laaner DVDen
    System.out.println("Hvem skal returnere DVD:");
    String laaner = tastatur.nextLine();
    System.out.println("Hvilken DVD skal returneres:");
    String dvdTittel = tastatur.nextLine();
    String eier = navneliste.get(laaner).hentDVDFraLaant(dvdTittel).hvemEier().toString();
    boolean sjekkLaant = navneliste.get(laaner).sjekkLaant(dvdTittel);
    if(navneliste.containsKey(laaner) && sjekkLaant == true){
      navneliste.get(laaner).hentDVDFraLaant(dvdTittel).hvemEier().fjernDVDFraUtlaant(dvdTittel);
      navneliste.get(laaner).hentDVDFraLaant(dvdTittel).returnerDVD(navneliste.get(laaner));
      navneliste.get(laaner).fjernDVDFraLaant(dvdTittel);
      System.out.println(dvdTittel + " er naa returnert fra " + laaner + " til " + eier + ".");
      System.out.println("");
      return;
    }
    else if(!navneliste.containsKey(laaner)){
      System.out.println(laaner + " finnes ikke i systemet");
      return;
    }
    else if(sjekkLaant == false){
      System.out.println(laaner + " laaner ikke " + dvdTittel + " og kan ikke returnere den.");
      return;
    }
  }

  public void avslutt(){
    //Avslutter programmet
    System.out.println("Programmet avsluttes. Ha det bra!");
    System.exit(0);
  }
}
