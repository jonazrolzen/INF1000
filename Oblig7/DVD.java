/*DVD.java skal ha kontroll paa hva tittelen er, hvem som eier den og hvem som laaner den. Den skal ogsaa kunne si om
den er utlaant eller ikke og hvis den som laaner leverer den tilbake saa skal den sette laaner = null*/

class DVD{

  String tittel; //Hva DVDen heter
  Person eier; //Hvem som eier den
  Person laaner; //Hvem som laaner den hvis noen laaner den

  public DVD (String tittel, Person eier){ //konstruktoer som tar i mot tittel og eier som parameter
    this.tittel = tittel; //Setter tittelen til aa vaere lik tittelen som ble sendt med
    this.eier = eier; //Setter eier til aa vaere lik eieren som ble sendt med
  }

  public String toString(){ //returnerer tittelen paa DVDen
    return tittel;
  }

  public Person hvemEier(){ //returnerer eieren
    return eier;
  }

  public Person hvemLaaner(){ //returnerer hvem som laaner. hvis ingen laaner saa returnerer den null
    return laaner;
  }

  public boolean utlaantStatus(){ //returnerer true eller false avhengig om DVDen er utlaant eller ikke
    if(laaner == null){
      return false;
    }
    return true;
  }

  public void laanUtDVD(Person laaner){ //setter laaner til aa vaere lik laaneren som ble sendt med
    this.laaner = laaner;
  }

  public void returnerDVD(Person laaner){ //setter laaner til aa vaere null dersom den riktige laaneren returnerer DVDen
    if(this.laaner == laaner){
      this.laaner = null;
    }
  }
}
