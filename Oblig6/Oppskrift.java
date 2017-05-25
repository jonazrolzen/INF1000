import java.util.*;

class Oppskrift{
  private ArrayList<String> ingredienser = new ArrayList<String>();
  private ArrayList<String> oppskrift = new ArrayList<String>();
  private String tittel;

  public oppskrift(ArrayList<String> ingredienser, String tittel, ArrayList<String> oppskrift){
    this.ingredienser = ingredienser;
    this.tittel = tittel;
    this.oppskrift = oppskrift;
  }

  public void skrivUtOppskrift(){
    System.out.println("Fremgangsmaate: ");

    for(String steg : oppskrift){
      System.out.println(steg);
    }
  }

  public void skrivUtIngredienser(){
    for(String ingrediens : ingredienser){
      System.out.println(ingrediens);
    }
  }

  public String toString(){
    return tittel;
  }

  public vois leggTilIngrediens(String ingrediensen){
    ingredienser.add(ingrediensen);
  }
}
