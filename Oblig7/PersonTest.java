/*Denne testen skal teste funksjonaliteten i Person.java. Den skal se om det gaar an aa kjoepe/legge til DVDer
til HashMapene.*/

class PersonTest{
  public static void main(String[] args) {
    Person Jonas = new Person("Jonas");
    Person Silje = new Person("Silje");

    System.out.println(Jonas.toString());
    System.out.println(Silje.toString());

    Jonas.kjopDVD("The Matrix");
    Jonas.leggDVDTilArkiv("Pulp Fiction");
    Jonas.leggDVDTilArkiv("Toy Story");
    Jonas.oversiktPerson();

    Jonas.leggDVDTilUtlaant("The Matrix");
    Silje.visPerson();
  }
}
