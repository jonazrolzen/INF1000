class Oblig7{
  public static void main(String[] args) throws Exception{
    DVDAdministrasjon admin = new DVDAdministrasjon();
    /*I tilfelle filleseren ikke blir ferdig i tide foer innlevering saa maa bruker legge inn personer
    og en DVD for aa teste funksjonalitet. Disse metodekallene vil vaere kommentert ut dersom den ble ferdig.*/
    /*admin.nyPerson();
    admin.nyPerson();
    admin.kjop();*/
    admin.lesFil("dvdarkiv2.txt");
    admin.kommandoLoekke();
  }
}
