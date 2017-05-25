/*Denn testen starter med aa be brukeren opprette 2 personer og be en av dem kjoepe en DVD for at det skal
vaere personer og en dvd liggende inne allerede naar man starter kommandoloekken*/

class DVDAdminTest{
  public static void main(String[] args) {
  DVDAdministrasjon admin = new DVDAdministrasjon();
  admin.nyPerson();
  admin.nyPerson();
  admin.kjop();
  admin.kommandoLoekke();
  }
}
