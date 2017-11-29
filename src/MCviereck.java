public class MCviereck {
    public static void main(String[] args) {
        double flaeche;
        Viereck quadrat = new Viereck(14, 4);

        flaeche = quadrat.flaechenberechnung();
        quadrat.ergebnisausgabe(flaeche);
    }
}
