public class Kunde {
    private String nachName, vorName, adresse;

    public Kunde(String u_nachName, String u_vorName, String u_adresse) {
        nachName = u_nachName;
        vorName = u_vorName;
        adresse = u_adresse;
    }

    public void setNachName(String u_nachName) {
        nachName = u_nachName;
    }

    public void setVorName(String u_vorName) {
        vorName = u_vorName;
    }

    public void setAdresse(String u_adresse) {
        adresse = u_adresse;
    }

    public String getNachName() {
        return nachName;
    }

    public String getVorName() {
        return vorName;
    }

    public String getAdresse() {
        return adresse;
    }

    public void datenEingabe() {
        System.out.print("Nachname: ");
        setNachName(Tastatur.liesString());
        System.out.print("Vorname: ");
        setVorName(Tastatur.liesString());
        System.out.print("Adresse: ");
        setAdresse(Tastatur.liesString());
    }

    public void datenAusgabe() {
        System.out.println(getNachName() + ", " + getVorName() + " - " + getAdresse());
    }
} //hä
