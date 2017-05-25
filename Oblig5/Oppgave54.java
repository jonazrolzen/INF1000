class Oppgave54{
    public static void main(String[] args){

        Isbod isboden = new Isbod(); //Oppretter et objekt av klassen Isbod

        isboden.ansett("Petter"); //Kaller paa instansmetoden ansett og sender med "Petter" som parameter
        isboden.ansett("Ida");
        isboden.ansett("Jan");
        isboden.printAlleAnsatte();//Kaller paa instansmetoden printAlleAnsatte og skriver ut hvem som er ansatt
        isboden.giSistemannSparken();//Kaller paa instansmetoden giSistemannSparken, sparker sistemann og sier hvem som ble sparket
        isboden.printAlleAnsatte();
        isboden.ansett("Silje");
        isboden.printAlleAnsatte();
    }
}
