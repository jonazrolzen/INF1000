class Isbod{ //Oppretter klassen Isbod

    private String[] navnAnsatte = {"blank", "blank", "blank", "blank", "blank", "blank", "blank", "blank", "blank", "blank",};
    //Oppretter en string array med 10 plasser, der alle plassene inneholder for oyeblikket "blank"
    private int antallAnsatte = 0; //en int som teller antall ansatte til envher tid

    public void ansett(String navn){ //Oppretter en instansmetode kalt ansett og tar i mot en String parameter
      for(int teller = 0; teller < navnAnsatte.length; teller++){ //en for-lokke som flytter plassen vi befinner oss paa i arrayen
        if(navnAnsatte [teller].equals("blank")){ //Hvis plassen vi er paa i String arrayen er lik blank, saa gjor dette
          navnAnsatte [teller] = navn; //Plassen vi befinner oss paa i String arrayen blir byttet ut med navnet som ble mottatt som parameter
          antallAnsatte++; //Oker antall ansatte med 1
          teller = 10; //Setter teller til lik 10 slik at lokken brytes
          System.out.println(navn + " er naa ansatt!"); //Skriver ut at navn er naa ansatt
          System.out.println("Antall ansatte er naa: " + antallAnsatte + "."); //Skriver ut hvor mange ansatte det er naa i isboden
          System.out.println(""); //Skriver ut et ekstra linjeskift
        }

      }
    }

    public void giSistemannSparken(){ //Oppretter en instansmetode som skal gi sistemann sparken
      for(int teller = 9; teller > 0; teller--){ //en for-lokke som teller bakfra
        if(!navnAnsatte [teller].equals("blank")){ //hvis plassen vi befinner oss paa ikke inneholder "blank", saa gjor dette
          System.out.println(navnAnsatte [teller] + " har naa faatt sparken."); //Skriver ut at denne personen har faatt sparken
          navnAnsatte [teller] = "blank"; //Endrer verdien til plassen vi befinner oss paa til "blank"
          teller = -1; //Setter teller til -1 slik at lokken brytes
          antallAnsatte--; //Trekker 1 fra antall ansatte
          System.out.println("");
        }
      }
    }

    public void printAlleAnsatte(){ //Printer ut hvem som er ansatt i isboden naa
      System.out.println("De ansatte er:");
      for(int teller = 0; teller < navnAnsatte.length; teller++){ //Gaar igjennom String arrayen
        if(!navnAnsatte [teller].equals("blank")){ //Hvis plassen vi befinner oss paa ikke er lik "blank", saa gjor dette
          System.out.println(navnAnsatte [teller]);//Skriver ut navnet paa den ansatte som er paa den plassen
        }
      }
      System.out.println("Antall ansatte er: " + antallAnsatte + "."); //Skriver ut antall ansatte
      System.out.println("");
    }
}
