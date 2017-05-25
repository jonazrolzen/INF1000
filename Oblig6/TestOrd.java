class TestOrd{
  public static void main(String[] args){
    Ord sjokolade = new Ord("sjokolade");
    Ord gulrot = new Ord("gulrot");

    System.out.println(sjokolade.toString());
    System.out.println(gulrot.toString());

System.out.println("");

    gulrot.oekAntall();

    gulrot.hentAntall();
    gulrot.hentLengde();
    gulrot.plassiDokument();

System.out.println("");

    sjokolade.hentAntall();
    sjokolade.hentLengde();
    sjokolade.plassiDokument();
  }
}
