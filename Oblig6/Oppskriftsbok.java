import java.util.HashMap;

class Oppskriftsbok{
  private HashMap<String, Oppskrift> oppskrift = new HashMap<String, Oppskrift>();

  public void skrivUtAlleOppskrifter(){
    for(Oppskrift o : oppskrifter.values()){
      System.out.println(o.toString());
      o.skrivUtIngredienser();
      o.skrivUtOppskrift();
    }
  }
  public boolean finnesOppskrift(String tittel){
    return oppskrifter.containsKey(tittel);
  }

  public void skrivUtOppskrift(String tittel){
    if(finnesOppskrift(tittel)){
      Oppskrift o = oppskrifter.get(tittel);
      System.out.println(skrivUtOppskrift);
    }
    else{
      System.out.println("Oppskriften paa " + )
    }
  }
}
