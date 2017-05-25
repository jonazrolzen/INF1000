class Oppgave51{
    public static void main(String[] args){

      Bil svart = new Bil(); //Oppretter en ny bil som heter svart og som er et objekt av klassen Bil

        svart.kjorTur(60); //Kaller paa instansmetoden kjorTur og sender med 60 som antall km man vil kjore
        svart.fyllTank(2); //Kaller paa instansmetoden fyllTank og sender med 2 som antall liter vi vil fylle paa tanken
        svart.hentMaksDistanse(); //Kaller paa instansmetoden hentMaksDistanse og skriver ut bilens maksdistanse basert paa antall liter i tanken og bensinforbruket
        svart.hentKilometerstand();//Kaller paa instansmetoden hentKilometerstand og skriver ut hvor langt bilen har kjort

      Bil gul = new Bil(); //Oppretter en ny bil som heter gul og er uavhengig av svart

        gul.kjorTur(1001);
        gul.fyllTank(51);
        gul.hentMaksDistanse();
        gul.hentKilometerstand();

      Bil rosa = new Bil();

        rosa.kjorTur(100);
        rosa.fyllTank(6);
        rosa.hentMaksDistanse();
        rosa.hentKilometerstand();

      Bil lilla = new Bil();

        lilla.kjorTur(0);
        lilla.fyllTank(0);
        lilla.hentMaksDistanse();
        lilla.hentKilometerstand();

      Bil blaa = new Bil();

        blaa.kjorTur(1000);
        blaa.fyllTank(50);
        blaa.hentMaksDistanse();
        blaa.hentKilometerstand();

      Bil rod = new Bil();

        rod.kjorTur(125);
        rod.fyllTank(5.5);
        rod.hentMaksDistanse();
        rod.hentKilometerstand();
        rod.kjorTur(125);
        rod.hentKilometerstand();
    }
}
