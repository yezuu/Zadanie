package dziedziczenie;

public class Analogowy extends Zegar
{
    public Analogowy(double cena, String rodzaj, String model, String producent, boolean bezel, String mechanizm)
    {
        super(cena, rodzaj, model, producent);
        
        this.bezel = bezel;
        this.mechanizm = mechanizm;
        
        System.out.printf("%s: konstuktor zostal wywolany%s", Analogowy.class.getSimpleName(), System.lineSeparator());
    }
    
    public void setBezel(boolean bezel)
    {
        this.bezel = bezel;
    }
    
    public void setMechanizm(String mechanizm)
    {
        this.mechanizm = mechanizm;
    }
    
    public boolean hasBezel()
    {
        return bezel;
    }
    
    public String getMechanizm()
    {
        return mechanizm;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s (bezel/luneta: %s, mechanizm: %s)", super.toString(), bezel? "tak" : "nie", mechanizm);
    }
    
    private boolean bezel;
    private String mechanizm;
}