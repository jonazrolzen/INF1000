class Alternativ1 {
    public static void main(String[] args){

        String linje = "Dette er en linje med tekst!";
        //Oppretter en String variabel med en setning som verdi
        int antallGanger = -4;
        //Oppretter en int variabel med tallet 13 som verdi.

        skrivTekster(linje, antallGanger);
        /*Kalle paa metoden skrivTekster og sender med String variabelen linje og int variabelen
        antallGanger til metoden.*/

    }
    public static void skrivTekster(String tekst, int antall){
      //Oppretter en metode med String tekst og int antall som parametere

      /* For aa gjore at det blir skrevet ut et ekstra linjeskift for hver tredje gang tekst skrives ut,
      saa vil jeg opprette en ny variabel som heter f.eks. tredjeLinje som jeg kan bruke i et if-uttrykk. Jeg gir
      variabelen verdien 0, men legger på 1 hver gang lokken kjores for if-uttrykket sjekker verdien. Naar verdien blir
      sjekket og verdien er lik 3, saa vil det bli skrevet ut et ekstra linjeskift samt at verdien til
      variabelen tredjeLinje blir redusert med 3 slik at den starter fra 0 igjen og saann vil den gaa
      uansett hvor mange ganger det skal bli skrevet ut noe.*/
      int teller = 0;
      int tredjeLinje = 0;
      while(teller != antall){
        // Starter en while-lokke som kun kjorer saa lenge teller ikke er det samme som antall
        System.out.println(tekst);
        //Printer ut Stringen som ble sendt til metoden og plassert i tekst
        teller = teller + 1;
        //Legger til 1 på verdien til teller hver gang lokken kjores
        tredjeLinje = tredjeLinje + 1;
        if(tredjeLinje == 3){
          //Sjekker om tredjeLinje er lik 3
          System.out.println("");
          // Hvis den er lik 3, saa vil en tom linje skrives ut og verdien til tredjeLinje vil bli redusert med 3
          tredjeLinje = (tredjeLinje - 3);
        }

      }
    }
}
