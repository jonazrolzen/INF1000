/*Dette testprogrammet starter med aa opprette to personer og en DVD med en eier. Foerst saa skriver den ut navnet paa DVDen
og hvem som eier den, foer den skriver ut hvem som laaner DVDen og om utlaantStatus er true eller false.
Saa laanes DVDen ut til en person og den sjekker de samme tingene. Til slutt saa leveres DVDen tilbake og det sjekkes
om DVDen er returnert til eier.*/

class DVDTest{
  public static void main(String[] args){

    Person Jonas = new Person("Jonas");
    Person Silje = new Person("Silje");

    DVD testDVD = new DVD("TestDVD", Jonas);

    System.out.println(testDVD.toString());
    System.out.println(testDVD.hvemEier().toString());
    System.out.println(testDVD.hvemLaaner());
    System.out.println(testDVD.utlaantStatus());
    System.out.println("");

    testDVD.laanUtDVD(Silje);
    System.out.println(testDVD.hvemEier().toString());
    System.out.println(testDVD.hvemLaaner());
    System.out.println(testDVD.utlaantStatus());
    System.out.println("");

    testDVD.returnerDVD(Silje);
    System.out.println(testDVD.hvemEier().toString());
    System.out.println(testDVD.hvemLaaner());
    System.out.println(testDVD.utlaantStatus());
    System.out.println("");
  }
}
