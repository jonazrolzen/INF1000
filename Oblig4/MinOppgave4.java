import java.util.Scanner; //Importerer scanner verktoyet
import java.io.File; //Gjor at vi kan lese filer

/* Oppgavetekst
Lag et quizprogram som tester brukerens mattekunnskaper. Du skal lese profilen til den fiktive deltageren
som brukeren skal spille som. Legg opplysningene som finnes i filen profil.txt inn i en String-array. Oppgavene
som brukeren faar, skal vaere at de maa skrive inn to tall som sendes til en metode som sender svaret tilbake.
Det skal telles poeng og brukeren skal til slutt faa vite hvor bra de gjorde det med en liten melding.
*/

class MinOppgave4{
    public static void main(String[] args)throws Exception{

        Scanner filLeser = new Scanner(new File("profil.txt")); //Oppretter en scanner som leser filen profil.txt
        Scanner tastatur = new Scanner(System.in); //Oppretter en scanner som lytter til tastaturet

        String[] profil = new String[10]; //Oppretter en String-array med 10 tomme plasser
        String nervos = ""; //Oppretter en String variabel som het nervos og som er forelopig tom

        int oppgaveSvar1 = 0; //Oppretter en int-variabel som skal brukes til aa registrere brukerens svar
        int oppgaveSvar2 = 0;

        int poeng = 0; //int-variabel som skal brukes til aa telle antall poeng brukeren samler opp

          for(int teller = 0; filLeser.hasNextLine(); teller++){ //for-lokke som legger inn dataene fra profil.txt inn i String-arrayen
            profil [teller] = filLeser.nextLine();
          }
          //Velkomstmeldinger som er paa starten av programmet. Skrives ut til terminalen
          System.out.println("Hei, og velkommen tilbake til Super Duper Quiz!" +
            " Det ble en litt lang pause paa 3 uker siden forrige program og den forrige deltageren dode"+
            " uheldigvis paa venterommet, men vi har naa en ny deltager!");
          System.out.println("");

          System.out.println("*masse applaus fra publikum*");
          System.out.println("");
          //Meldinger til terminalen som bruker dataene som ligger i String-arrayen
          System.out.println("Han heter " + profil [1] + " og kommer fra " + profil [3] + ".");
          System.out.println("Han er en stor fan av " + profil [5] + ". Han mener at " + profil [7] + ".");
          System.out.println("Han er i folge seg selv " + profil [9] + ", men er han smart? Det skal vi finne ut av, " +
          " saa onsk " + profil [1] + " velkommen!");

          System.out.println("");
          System.out.println("*masse applaus fra publikum*");
          System.out.println("");

          System.out.println("Velkommen til programmet " + profil [1] + ". Er du nervos i kveld?");
          System.out.println("Skriv inn Ja eller Nei:");
            nervos = tastatur.nextLine(); //Variabelen nervos blir det brukeren skriver inn
                if(nervos.equalsIgnoreCase("Ja")){ //Skriver de inn ja, saa faar de meldingen rett under
                  System.out.println("Da kan vi opplyse om at du har ingenting aa bekymre deg for!" +
                  " Vi skal ikke la deg do paa venterommet som den forrige deltageren.");
                }
                else if(nervos.equalsIgnoreCase("Nei")){ //Skriver de inn nei, saa faar de den meldingen under denne kommentaren
                  System.out.println("En fryktlos deltager altsaa. Det liker vi!");
                }
                else{ //Skriver de hverken ja eller nei, saa faar de en melding som sier at de er en stor idiot
                  System.out.println("Like dum som den forrige deltageren! Kanskje vi bare skal etterlate deg paa venterommet alikevel?!");
                }


          System.out.println(""); //Setter inn et ekstra linjeskift
          System.out.println("Vi starter med kveldens forste oppgave!");
          System.out.println("Nevn to tall som sammen blir til summen 12.");

            System.out.println("Skriv inn det forste tallet:");
              oppgaveSvar1 = tastatur.nextInt(); //oppgaveSvar1 blir det neste tallet brukeren skriver inn
            System.out.println("Skriv inn det andre tallet");
              oppgaveSvar2 = tastatur.nextInt(); //oppgaveSvar2 blir det neste tallet brukeren skrive inn

          System.out.println("Da er svaret avgitt og vi sender tallene til datamaskinen som skal regne ut om du har riktig.");
              int oppgave1 = oppgaveAddisjon(oppgaveSvar1, oppgaveSvar2); /*Oppretter en ny int-variabel som kaller paa
              metoden oppgaveAddisjon og sender med verdiene i oppgaveSvar1 og oppgaveSvar2 som parametere*/
                if(oppgave1 == 12){ /*Sjekker om den nye verdien til oppgave1 er lik 12 og hvis det stemmer vil de faa
                  en melding om at de har riktig og det legges til 1 til verdien til variabelen poeng.*/
                  System.out.println("Det er korrekt! Ett poeng til deg!");
                  poeng++;
                }
                else{ //Hvis verdien i oppgave1 ikke er 12, saa faar brukeren en melding om ingen poeng.
                  System.out.println("Svaret er desverre feil og det blir ingen poeng denne runden!");
                }
                System.out.println("");
          //Oppgavene under fungerer paa samme maate som oppgaven over. Bare med andre metoder og variabler
          System.out.println("Kveldens andre oppgave er:");
          System.out.println("Gi meg to tall som kan multipliseres med hverandre for aa faa svaret 25.");

            System.out.println("Skriv inn det forste tallet:");
              oppgaveSvar1 = tastatur.nextInt();
            System.out.println("Skriv inn det andre tallet");
              oppgaveSvar2 = tastatur.nextInt();

          System.out.println("Da er svaret avgitt og vi sender tallene til datamaskinen.");
            int oppgave2 = oppgaveMulti(oppgaveSvar1, oppgaveSvar2);
              if(oppgave2 == 25){
                System.out.println("Det er riktig. Ett poeng til deg!");
                poeng++;
              }
              else{
                System.out.println("Svaret er feil og det ble ingen poeng denne runden.");
              }
              System.out.println("");

          System.out.println("Kveldens aller siste oppgave er:");
          System.out.println("Gi meg to tall som sammen blir til summen 21");
          System.out.println("Skriv inn det forste tallet:");
            oppgaveSvar1 = tastatur.nextInt();
          System.out.println("Skriv inn det andre tallet:");
            oppgaveSvar2 = tastatur.nextInt();

          System.out.println("Da er svaret avgitt og vi sender tallene til datamaskinen.");
            int oppgave3 = oppgaveAddisjon(oppgaveSvar1, oppgaveSvar2);
              if(oppgave3 == 21){
                System.out.println("Svaret er riktig! Ett poeng til deg");
                poeng++;
              }
              else{
                System.out.println("Svaret er feil. Ingen poeng denne runden.");
              }

          System.out.println("");
          System.out.println("Naa skal vi se hvor bra " + profil [1] + " har gjort det.");
            if(poeng == 3){ //Sjekker poengsummen og skriver ut en melding avhengig av hvor bra man gjorde det
              System.out.println("Wow! 3 av 3 mulige! Du er litt av et geni! Da faar jeg bare si takk til deg " +
              profil [1] + ". Meld deg gjerne paa neste uke ogsaa og til dere der hjemme, takk for at dere saa paa " +
              "og takk for meg!");
            }
            else if(poeng == 2){
              System.out.println("2 av 3 mulige er ikke daarlig det! Nesten full pott. Da faar jeg bare si takk til deg " +
              profil [1] + ". Til dere der hjemme, takk for at dere saa paa og takk for meg!");
            }
            else if(poeng == 1){
              System.out.println("1 av 3 mulige. Gikk ikke saa bra for deg i kveld, " + profil [1] +
              ". Ikke meld deg paa neste uke, ettersom vi har smartere folk som vil vaere med." +
              "Til dere der hjemme, takk for at dere saa paa og takk for meg!");
            }
            else if(poeng == 0){
              System.out.println("0 av 3 mulige. Hvorfor meldte du deg paa i det hele tatt, " + profil [1] +
              "?! Du er ikke velkommen som publikum engang etter denne fiaskoen! Til dere der hjemme, beklager" +
              " at dere maatte se paa dette her. Takk for meg.");
            }




    }

    public static int oppgaveAddisjon(int a, int b){ /*Oppretter en metode kalt oppgaveAddisjon som tar imot
      to int-parametere. Den oppretter en ny variabel kalt sum og inneholder verdien etter at a og b har blitt lagt
      sammen. Metoden returnerer saa variabelen sum til f.eks. oppgave1 og blir den nye verdien til oppgave1.*/
      int sum = a + b;
      return sum;
    }

    public static int oppgaveMulti(int a, int b){ /*Denne metoden gjor det samme som den ovenfor, men med
      multiplikasjon og sender den til en annen variabel*/
      int sum = a * b;
      return sum;
}
}
