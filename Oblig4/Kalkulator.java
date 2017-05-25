class Kalkulator{
    public static void main(String[] args){
      int addSvar = addisjon(3, 4); /*Oppretter en variabel som kaller paa metoden addisjon og sender med 3 og 4 som
      parametere*/
      System.out.println("Summen av tallene er: " + addSvar); // Printer ut en setning med den nye verdien til addSvar.

      int subSvar = subtraksjon(5, 2);
      System.out.println("Differansen mellom tallene er: " + subSvar); //Gjor samme som ovenfor

      int helDivSvar = heltallsdivisjon(10, 3);
      System.out.println("Kvotienten er lik: " + helDivSvar); //Gjor samme som ovenfor

      double divSvar = divisjon(10, 3);
      System.out.println("Kvotienten er lik: " + divSvar); //gjor samme som ovenfor, men med en double i stedet for int
    }
    public static int addisjon(int a, int b){ /*Oppretter en metode med returverdi som tar i mot to parametere og
      legger dem sammen inn i en ny int-variabel kalt sum. Saa returnerer metoden verdien som ligger i sum
      til addSvar, der metoden ble kalt. addSvar er ikke naa int addSvar = addisjon(3, 4), men heller int addSvar = 7.*/
        int sum = a + b;
        return sum;
    }

    public static int subtraksjon(int a, int b){ //Samme som addisjon, men med subtraksjon og sender til subSvar
      int sum = a - b;
      return sum;
    }

    public static int heltallsdivisjon(int a, int b){ //Samme som addisjon, men med heltallsdivisjon og sender til helDivSvar
      int sum = a / b;
      return sum;
    }

    public static double divisjon(double a, double b){ /* Returnerer en double i stedet for int. Fungerer paa samme
      maate som de over, men returnerer et desimaltall til divSvar*/
      double sum = a / b;
      return sum;
    }
}
