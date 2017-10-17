public class MCviereck {
    public static void main(String[] args) {
        double flaeche = 0;
        System.out.print("Breite: ");
        double breite = Tastatur.liesDouble();
        System.out.print("\nHoehe: ");
        double hoehe = Tastatur.liesDouble();
        Viereck quadrat = new Viereck(breite, hoehe);

        flaeche = quadrat.flaechenberechnung();
        quadrat.ergebnisausgabe(flaeche);
    }
}
