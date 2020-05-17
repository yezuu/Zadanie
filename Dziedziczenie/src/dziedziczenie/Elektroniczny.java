package dziedziczenie;

public class Elektroniczny extends Zegar
{
    public Elektroniczny(double cena, String rodzaj, String model, String producent, boolean alarm, boolean podswietlenie)
    {
        super(cena, rodzaj, model, producent);
        
        this.alarm = alarm;
        this.podswietlenie = podswietlenie;
        
        System.out.printf("%s: konstuktor zostal wywolany%s", Elektroniczny.class.getSimpleName(), System.lineSeparator());
    }
    
    public void setAlarm(boolean alarm)
    {
        this.alarm = alarm;
    }
    
    public void setPodswietlenie(boolean podswietlenie)
    {
        this.podswietlenie = podswietlenie;
    }
    
    public boolean hasAlarm()
    {
        return alarm;
    }
    
    public boolean hasPodswietlenie()
    {
        return podswietlenie;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s (alarm: %s, podswietlenie: %s)", super.toString(), alarm? "tak" : "nie", podswietlenie? "tak" : "nie");
    }
    
    private boolean alarm;
    private boolean podswietlenie;
}