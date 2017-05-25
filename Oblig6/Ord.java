class Ord{

    private String ord;
    private int forekomster;
    private int lengde;
    private int plassIDokument;

      public Ord(String tekst){ //konstruktor ord objektet
        ord = tekst;
        forekomster++; //oker forekomster med 1
      }

      public String toString(){ //gjor ord objekter om til string
        return ord;
      }

      public int hentAntall(){ //henter antall forekomster av ordet
        return forekomster;
      }


      public void oekAntall(){ //oker antall forekomster
        forekomster++;
      }
      public int hentLengde(){ //henter lengden til ordet
        int lengde = ord.length();
        return lengde;
      }

      public int plassiDokument(){ //sjekker hvor mye plass ordet tar i dokumentet
        plassIDokument = (ord.length() * forekomster);
        return plassIDokument;

      }

}
