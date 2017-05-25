import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

class Oblig6 {
  public static void main(String[] args)throws Exception{
    Ordliste liste = new Ordliste();
    liste.lesBok("scarlet.txt");

      System.out.println("Det er " + liste.antallOrd() + " ulike ord i teksten.");

      System.out.println("Ordet Watson forekommer: " + liste.antallForekomster("Watson") + " ganger i teksten");

      System.out.println("Ordet elementary forekommer: " + liste.antallForekomster("elementary") + " ganger i teksten");

      System.out.println("Det korteste ordet er: " + liste.finnKorteste() + ", med " + liste.finnKorteste().hentLengde() + " tegn.");

      System.out.println("Det lengste ordet er: " + liste.finnLengste() + ", med " + liste.finnLengste().hentLengde() + " tegn.");

      System.out.println("Det ordet som tar mest plass er: " + liste.tarMestPlassIDokument() + ". Ordet forekommer "
        + liste.tarMestPlassIDokument().hentAntall() + " ganger og bruker " +
        (liste.tarMestPlassIDokument().hentAntall()) * (liste.tarMestPlassIDokument().hentLengde()) + " plasser i teksten.");

  }
}
