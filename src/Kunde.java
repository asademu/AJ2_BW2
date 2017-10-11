public class Kunde {
    private String nachName, vorName, adresse;

    public Kunde(String u_nachName, String u_vorName, String u_adresse) {
        nachName = u_nachName;
        vorName = u_vorName;
        adresse = u_adresse;
    }

    public void datenEingabe() {
        System.out.print("Nachname: ");
        nachName = Tastatur.liesString();
        System.out.print("Vorname: ");
        vorName = Tastatur.liesString();
        System.out.print("Adresse: ");
        adresse = Tastatur.liesString();
    }

    public void datenAusgabe() {
        System.out.println(nachName + ", " + vorName + " - " + adresse);
    }
}
