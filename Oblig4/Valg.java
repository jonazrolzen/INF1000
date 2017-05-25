import java.util.Scanner; //Importerer scanner verktoyet
import java.io.File; //Gjor at vi kan lese filer

class Valg{
    public static void main(String[] args)throws Exception{

        Scanner filLeser = new Scanner(new File("stemmer.txt")); //Oppretter en scanner som leser file stemmer.txt

        String[] stemmer = new String[456]; //Oppretter en String-array med 456 tomme plasser der det staar null
        String[] parti = {"Ap", "KrF", "Sp", "H"}; /*Oppretter en String-array med 4 fylte plasser der Ap = 0, KrF = 1,
        Sp = 2 og H = 3*/
        int[] partier = new int[4]; /*Oppretter en int-array med 4 tomme plasser der det staar 0. Hvert parti har sin plass
        som er forklart i kommentaren til String-arrayen parti*/

          for(int teller = 0; filLeser.hasNextLine(); teller++){ /*Oppretter en for-lokke som kjorer saa lenge scanneren
            filLeser har en linje aa lese. Legger inn den nyeste leste linjen inn i String-arrayen stemmer paa plassen
            spesifisert av teller. Til slutt saa legges det paa 1 til verdien til teller slik at vi bytter plass i arrayen hver gange
            lokken kjores.*/
            stemmer [teller] = filLeser.nextLine();
          }

          for(int teller = 0; teller < 456; teller++){ /*Oppretter en ny for-lokke som skal telle hvor mange stemmer
            hvert parti faar ved aa sjekke plassen i String-arrayen stemmer som er spesifisert av teller. Hvis
            stemmer [teller] er paa en plass som f.eks. matcher Ap, saa skal den legge til 1 til verdien paa plassen Ap
            har faatt i int-arrayen  partier. Plassen til hvert parti i int-arrayen stemmer er forklart ovenfor.*/
            if(stemmer [teller].equals("Ap")){
              partier [0]++;
            }
            else if(stemmer [teller].equals("KrF")){
              partier [1]++;
            }
            else if(stemmer [teller].equals("Sp")){
              partier [2]++;
            }
            else if(stemmer [teller].equals("H")){
              partier [3]++;
            }
          }

          for(int teller = 0; teller < 4; teller ++){ /*Regner ut prosenten av stemmene hvert parti fikk og skriver ut
            en setning som inneholder det og hvor mange stemmer det tilsvarer.*/
            double prosent = partier [teller]*100;
            prosent = prosent/456;
            System.out.println(parti [teller] + " fikk " + prosent + "% av stemmene, altsaa " +
            partier[teller] + " stemmer.");
          }

        System.out.println("Valgets vinner er " + parti [0] + " med sine " + partier [0] + " stemmer.");
        //Skriver ut valgets vinner med hvor mange stemmer de fikk.


    }
}
