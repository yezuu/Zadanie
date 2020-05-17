package dziedziczenie;

public class Zegar implements Comparable<Zegar>
{
    public Zegar(double cena, String rodzaj, String model, String producent)
    {
        this.cena = cena;
        this.rodzaj = rodzaj;
        this.model = model;
        this.producent = producent;
        
        System.out.printf("%s:konstuktor zostal wywolany%s", Zegar.class.getSimpleName(), System.lineSeparator());
    }
    
    public void setCena(double cena)
    {
        this.cena = cena;
    }
    
    public void setRodzaj(String rodzaj)
    {
        this.rodzaj = rodzaj;
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }
    
    public void setProducent(String producent)
    {
        this.producent = producent;
    }
    
    public String getRodzaj()
    {
        return rodzaj;
    }
    
    public double getCena()
    {
        return cena;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public String getProducent()
    {
        return producent;
    }
    
    @Override
    public String toString()
    {
        return String.format("%.2f PLN - %s %s %s %s", cena, getClass().getSimpleName(), rodzaj, producent, model);
    }
    
    @Override
    public int compareTo(Zegar zegar) 
    {
        return Double.compare(cena, zegar.cena);
    }
    
    private double cena;
    private String rodzaj, model, producent;
}