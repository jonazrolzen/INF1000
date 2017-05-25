class TestOrdliste{
  public static void main(String[] args) throws Exception{

    Ordliste liste = new Ordliste();
    liste.lesBok("hallo.txt");
    liste.leggTilOrd("Sjokoladekake");
    System.out.println(liste.antallOrd());
    liste.sjekk();
    System.out.println(liste.finnLengste());
    System.out.println(liste.finnKorteste());
    System.out.println(liste.antallForekomster("hallo"));
    //System.out.println(liste.vanligste5());



  }
}
