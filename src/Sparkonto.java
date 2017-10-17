public class Sparkonto {
    private double geldbetrag, zinssatz;

    public Sparkonto(){
        geldbetrag = 0;
        zinssatz = 0;
    }

    public Sparkonto(double u_geld, double u_zins){
        geldbetrag = u_geld;
        zinssatz = u_zins;
    }

    public void einzahlung(double z){
        geldbetrag += z;
    }

    public void auszahlung(double z){
        geldbetrag -= z;
    }

    public void verzinsung(){
        geldbetrag += geldbetrag * zinssatz;
    }
}
