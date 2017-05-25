/*Person.java skal vite hva personen heter, hvilke DVDer personen eier, hvem av dem som er utlaant til andre og hvilke
DVDer som personen laaner fra andre. Personen kan kjoepe DVDer og legge dem til arkivet sitt. Den kan ogsaa legge til
DVDer til alle HashMapene, fjerne DVDer,vise en oversikt over hvilke DVDer som eies,laanes ut og laanes + hvor mange o
sjekke HashMapene om et DVD-objekt med den tilsendte noekkelen finnes.*/

import java.util.HashMap; //importerer HashMap verktoeyet

class Person{

  private String navn; //navnet paa personen i String variabel

  private HashMap<String, DVD> arkiv = new HashMap <String, DVD>(); //Oppretter et HashMap som tar vare paa DVDer med String noekler
  private HashMap<String, DVD> utlaant = new HashMap <String, DVD>();
  private HashMap<String, DVD> laant = new HashMap <String, DVD>();

  public Person(String navn){ //konstruktoer
    this.navn = navn; //setter navn til aa vaere det tilsendte navnet
  }

  public String toString(){ //returnerer navnet paa personen
    return navn;
  }

  public void visPerson(){ //Viser en oversikt over hvilke DVDer personen eier, laaner ut og laaner fra andre
    System.out.println("Person: " + navn);
    System.out.println("DVDer som er eid:");
    boolean arkivStatus = arkiv.isEmpty();
    if(arkivStatus == true){
      System.out.println(navn + " eier ingen DVDer.");
    }
    else{
      for(DVD d : arkiv.values()){
        System.out.println(d.toString());
    }
    }
    System.out.println("DVDer som er utlaant:");
    boolean utlaantStatus = utlaant.isEmpty();
    if(utlaantStatus == true){
      System.out.println(navn + " laaner ikke ut noen DVDer.");
    }
    else{
      for(DVD d : utlaant.values()){
        System.out.println(d.toString() + " er laant ut til " + d.hvemLaaner().toString() + ".");
      }
    }
    System.out.println("DVD er som er laant:");
    boolean laantStatus = laant.isEmpty();
    if(laantStatus == true){
      System.out.println(navn + " laaner ingen DVDer.");
    }
    else{
      for(DVD d : laant.values()){
        System.out.println(d.toString() + " er laant av " + d.hvemEier().toString() + ".");
      }
    }
  }

  public void oversiktPerson(){ //Hviser en oversikt over hvor mange DVDer personen eier, laanes ut og laaner fra andre
    System.out.println("Person: " + navn);
    System.out.println("Eide: " + antallArkiv());
    System.out.println("Utlaante: " + antallUtlaant());
    System.out.println("Laante: " + antallLaant());
    System.out.println("");
  }

  public void kjopDVD(String dvdTittel){ //oppretter en ny DVD og legger den til i personens arkiv dersom den ikke finnes fra foer
    boolean eier = sjekkArkiv(dvdTittel);
    if(eier == true){
      System.out.println(navn + " eier allerede " + dvdTittel + ".");
    }
    else{
      arkiv.put(dvdTittel, new DVD(dvdTittel, this));
      System.out.println(this.toString() + " eier naa " + dvdTittel + ".");
      System.out.println("");
    }
  }


  public void fjernDVDFraArkiv(String dvdTittel){ //fjerner DVD fra arkiv
    if(arkiv.containsKey(dvdTittel)){
      arkiv.remove(dvdTittel);
    }
  }

  public void fjernDVDFraUtlaant(String dvdTittel){ //fjerner DVD fra utlaant
    if(utlaant.containsKey(dvdTittel)){
      utlaant.remove(dvdTittel);
    }
  }

  public void fjernDVDFraLaant(String dvdTittel){ //fjerner DVD fra laant
    if(laant.containsKey(dvdTittel)){
      laant.remove(dvdTittel);
    }
  }


  public void leggDVDTilArkiv(String dvdTittel){ //legger en ny DVD til arkiv dersom den ikke finnes fra foer
    if(!arkiv.containsKey(dvdTittel)){
      arkiv.put(dvdTittel, new DVD(dvdTittel, this));
    }
  }

  public void leggDVDTilUtlaant(String dvdTittel){ //legger en DVD til utlaant dersom den ikke finnes der fra foer
    if(!utlaant.containsKey(dvdTittel)){
      utlaant.put(dvdTittel, arkiv.get(dvdTittel));
    }
  }

  public void leggDVDTilLaant(String dvdTittel, Person eier){ //legger til en DVD til laant og setter DVDen til aa bli laant ut til laaneren
    if(!laant.containsKey(dvdTittel)){
      laant.put(dvdTittel, eier.hentDVDFraArkiv(dvdTittel));
      eier.hentDVDFraArkiv(dvdTittel).laanUtDVD(this);
    }
  }


  public DVD hentDVDFraArkiv(String dvdTittel){ //henter og returnerer oensket DVD fra arkiv dersom den finnes der
    DVD dvd = arkiv.get(dvdTittel);
    return dvd;
  }

  public DVD hentDVDFraUtlaant(String dvdTittel){ //henter og returnerer oensket DVD fra utlaant dersom den finnes der
    DVD dvd = utlaant.get(dvdTittel);
    return dvd;
  }

  public DVD hentDVDFraLaant(String dvdTittel){ //henter og returnerer oensket DVD fra laant dersom den finnes der
    DVD dvd = laant.get(dvdTittel);
    return dvd;
  }


  public int antallArkiv(){ //returnerer stoerrelsen paa arkiv
    return arkiv.size();
  }

  public int antallUtlaant(){ //returnerer stoerrelsen paa utlaant
    return utlaant.size();
  }

  public int antallLaant(){ //returnerer stoerrelsen paa laant
    return laant.size();
  }


  public boolean sjekkArkiv(String dvdTittel){ //sjekker arkiv om oensket DVD finnes der
    if(arkiv.containsKey(dvdTittel)){
      return true;
    }
    return false;
  }

  public boolean sjekkUtlaant(String dvdTittel){ //sjekker utlaant om oensket DVD finnes der
    if(utlaant.containsKey(dvdTittel)){
      return true;
    }
    return false;
  }

  public boolean sjekkLaant(String dvdTittel){//sjekker laant om oensket DVD finnes der
    if(laant.containsKey(dvdTittel)){
      return true;
    }
    return false;
  }
}
