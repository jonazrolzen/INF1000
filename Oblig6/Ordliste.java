import java.util.Scanner; //importerer scanner verktoyet
import java.io.File; //importerer fil-behandlings tingen
import java.util.ArrayList; //importerer ArrayList verktøyet


class Ordliste{

  private ArrayList<Ord> ordliste = new ArrayList<Ord>(); //Oppretter en ny ArrayList som holder paa ord-objekter
  private Ord[] vanligste5Ord = new Ord[5]; //Oppretter en vanlig array som holder paa 5 ord-objekter.


      public void lesBok(String filnavn) throws Exception{ //metode som leser filen
        File filInn = new File (filnavn);
        Scanner filLeser = new Scanner(filInn); //oppretter en ny scanner som leser filen vaar
          while(filLeser.hasNextLine()){ //while loop som kjorer saa lenge scanneren har en linje til aa lese
            leggTilOrd(filLeser.nextLine()); //kaller paa metoden leggTilOrd og sender den sist leste linja med som parameter
            }
          }

      public void leggTilOrd(String ord){ //metode som legger til ord i arraylisten
        Ord ordet = new Ord (ord);
        if(finnOrd(ord) == null){ //kaller paa metoden finnOrd og sjekker om ordet allerede finnes i listen
          ordliste.add(ordet); //hvis den ikke gjor det saa legger den ordet til
        }
        else{ //hvis den finnes saa oker den antallet forekomster
          finnOrd(ord).oekAntall();
        }
      }

      public Ord finnOrd(String tekst){ // metode finner ord i arraylisten
        for(int teller = 0; teller < ordliste.size(); teller++){ //for lokke som gaar igjennom arraylisten
          String sjekkOmOrdetFinnes = ordliste.get(teller).toString(); //gjor om ord objektet til en string
          if(tekst.equalsIgnoreCase(sjekkOmOrdetFinnes)){ //sjekker om det er noe som matcher
            return ordliste.get(teller); //hvis den matcher, saa returnerer den ordet slik at forekomstene til ordet blir oket
          }
        }
        return null; //hvis den ikke matcher, saa returnerer den null og ordet vil bli lagt til
      }

      public int antallOrd(){ //sjekker antall ord i arraylisten
        return ordliste.size(); //returnerer antall ord
      }

      public int antallForekomster(String tekst){ //sjekker forekomstene til et ord
        return finnOrd(tekst).hentAntall(); //returnerer forekomstene
      }

      public Ord[] vanligste5(){ //skal returnere de vanligste 5 ordene, men ble ikke ferdig med den
        Ord allerMestVanlig;
        int 1MVForekomster = allerMestVanlig.hentAntall();

        Ord nestMestVanlig;
        int 2MVForekomster = nestMestVanlig.hentAntall();

        Ord tredjeMestVanlig;
        int 3MVForekomster = tredjeMestVanlig.hentAntall();

        Ord fjerdeMestVanlig;
        int 4MVForekomster = fjerdeMestVanlig.hentAntall();

        Ord femteMestVanlig;
        int 5MVForekomster = femteMestVanlig.hentAntall();

        for(int teller = 0; teller < ordliste.size(); teller++){
          if(ordliste.get(teller).hentAntall() > hoyeste){
            hoyeste = ordliste.get(teller).hentAntall();
            allerMestVanlig = ordliste.get(teller);
            vanligste5Ord [0] = allerMestVanlig;
          }
        }
      return vanligste5Ord.toString();
    }*/

      public Ord finnLengste(){ //finner det lengste ordet i listen
        Ord lengsteOrd = ordliste.get(0);
        for(Ord lang : ordliste){ //enhanced for lokke som gaar igjennom arraylisten og sjekker
          if(lang.toString().length() > lengsteOrd.toString().length()){
            lengsteOrd = lang;
          }
        }
        return lengsteOrd; //returnerer det lengste ordet
      }

      public Ord finnKorteste(){ //funker paa samme maate som finnLengste, men finner det korteste ordet
        Ord kortesteOrd = ordliste.get(0);
        for(Ord kort : ordliste){
          if(kort.toString().length() < kortesteOrd.toString().length()){
            kortesteOrd = kort;
          }
        }
        return kortesteOrd;
      }

      public Ord tarMestPlassIDokument(){ //Sjekker hvilket ord som tar mest plass
        int antallPlasser = 0;
        Ord mestPlass = ordliste.get(0);
          for(int teller = 1; teller < ordliste.size(); teller++){ //lokke som finner ut hvilket ord som tar mest plass
            if(ordliste.get(teller).plassiDokument() > antallPlasser){
              antallPlasser = ordliste.get(teller).plassiDokument();

              mestPlass = ordliste.get(teller);
            }
          }
          return mestPlass; //returnerer ordet som tar mest plass
      }

      }
