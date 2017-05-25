class NegativeTall {
    public static void main(String[] args){

      int[] heltall = {1, 4, 5, -2, -4, 6, 10, 3, -2};
      //Oppretter en int array med et gitt sett med verdier
      int tall = 0;
      //Oppretter en int variabel
      int teller = 0;
    //int negative = 0;

        while(teller < 9){ //Oppretter en lokke som kjores kun hvis teller er mindre enn 9
          if(heltall [tall] < 0){
            /*Sjekker om verdien på plassen som tall er i heltall arrayen er mindre enn 0. F.eks. Hvis tall er 3, saa vil
            den sjekke plass nummer 3 i heltall arrayen.*/
          //negative = negative + 1;
            heltall [tall] = teller;
            /*Hvis det stemmer at det tallet er under 0, saa vil den faa en ny verdi lik verdien til variabelen teller som
            teller hvilken plass vi er paa.*/
        }
        tall = tall + 1;
        /* Legger til 1 paa verdien til tall slik at vi ikke sjekker den samme plassen i arrayen om igjen*/
        teller = teller + 1;
        /*Legger til 1 paa verdien til teller slik at vi kan eventuelt gi en ny verdi dersom den opprinnelige verdien
        er under 0 og slik at while-lokken vil bli avsluttet saa fort den naar slutten.*/
      }

      //System.out.println(negative);
      System.out.println(heltall[0]);
      System.out.println(heltall[1]);
      System.out.println(heltall[2]);
      System.out.println(heltall[3]);
      System.out.println(heltall[4]);
      System.out.println(heltall[5]);
      System.out.println(heltall[6]);
      System.out.println(heltall[7]);
      System.out.println(heltall[8]);
      /*Skriver ut innholdet i int arrayen. Det maa vel finnes en enklere metode enn dette.*/
    }
}
