public class MCviereck {
    public static void main(String[] args) {
        double flaeche = 0;
        System.out.print("Laenge: ");
        double breite = Tastatur.liesDouble();
        System.out.print("\nBreite: ");
        double laenge = Tastatur.liesDouble();
        Viereck quadrat = new Viereck(breite, laenge);

        flaeche = quadrat.flaechenberechnung();
        quadrat.ergebnisausgabe(flaeche);
    }
}
