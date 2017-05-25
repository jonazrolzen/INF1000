class Bil { //Oppretter klassen Bil

  private int kilometerstand = 0; //Oppretter en privat int kan kun endres av ting i klassen Bil og ikke utenfor

  private double maksDistanse = 0.0;
  private double literITank = 50.0;
  private double manglendeLiterITank = 0.0;
  private double bensinForTur = 0.0;

  private final double tankStorrelse = 50.0; //Oppretter en privat final double og ingenting kan endre verdien
  private final double bensinForbrukPrKm = 0.05;


    public boolean kjorTur(int km) { //Sjekker om man kan kjore saa langt brukeren har spesifisert
        bensinForTur = (bensinForbrukPrKm * km); //Ganger bensinforbruket pr. km med antall km som skal kjores for aa finne ut hvor mange liter som trengs
          if(bensinForTur <= literITank){ //Hvis det trengs mindre eller likt antall liter drivstoff enn det som er i tanken, saa kjor tur
            kilometerstand = (kilometerstand + km); //Legger til antall km kjort til kilometerstanden
            literITank = (literITank - bensinForTur);//Tommer tanken for saa mangle liter bensin som ble brukt
            System.out.println("Du har kjort: " + km + "."); //Printer ut hvor langt man har kjort
            return true;
          }
          else{
            System.out.println("Du har ikke nok bensin paa tanken for denne turen."); //Printer ut at man ikke faar kjort, fordi man ikke har nok bensin for turen
            return false;
          }

    }
    //fyller drivstoff paa tanken
    public boolean fyllTank(double liter) { //tar imot en double som parameter og er hvor mange liter som skal fylle paa
      manglendeLiterITank = tankStorrelse - literITank; //Sjekker hvor mange liter bensin som mangler i tanken

        if(literITank == 0.0 && liter <=tankStorrelse){ //Hvis det er tomt for bensin og antall liter er mindre enn eller lik tankstorrelsen, saa fyll paa tanken
          literITank = literITank + liter;//fyller paa antall liter paa tanken
          System.out.println("Du fylte: " + liter + " l paa tanken." +
          " Tanken inneholder naa: " + literITank + " l bensin.");//Skriver ut hvor mye man fylte paa og hvor mye bensin som er i tanken naa
          return true;
        }
        else if(liter <= manglendeLiterITank){ //Hvis antall liter er mindre enn eller lik antall manglende liter, saa fyll paa tanken
          literITank = literITank + liter;
          System.out.println("Du fylte: " + liter + " l paa tanken." +
          " Tanken inneholder naa: " + literITank + " l bensin.");
          return true;
        }
        else{ //Hvis du prover aa fylle paa mer bensin enn det er plass til saa skriver den ut at du ikke kan gjore det
          System.out.println("Du kan ikke fylle paa saa mye bensin.");
          return false;
        }
    }
    //Regner ut maksdistansen bilen kan kjore ut ifra forbruk pr. km og antall liter bensin som er i tanken
    public double hentMaksDistanse() {
        maksDistanse = (literITank / bensinForbrukPrKm); //deler antall liter i tanken paa bensinforbruket pr. km
        System.out.println("Bilen kan maksimalt kjore " + maksDistanse + " km med det gjenverende i tanken."); //Skriver ut hvor langt man kan kjore
        return maksDistanse;
    }
    //Henter kilometerstanden til bilen
    public int hentKilometerstand() {
        System.out.println("Bilen har kjort: " + kilometerstand + " km."); //Skriver ut hvor langt bilen har kjort
        return kilometerstand;
    }
}
//Tank paa 50 l
//0.5 l pr. mil
//0.05 l pr. km
//100 mil || 1000 km
