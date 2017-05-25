class Oppgave51{
    public static void main(String[] args){

      Bil svart = new Bil();

        svart.kjorTur(60);
        svart.fyllTank(2);
        svart.hentMaksDistanse();
        svart.hentKilometerstand();

      Bil gul = new Bil();

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
