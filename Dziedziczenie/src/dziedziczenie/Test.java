package dziedziczenie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test 
{
    public static void main(String[] args) 
    {
        System.out.println("--- Zadanie 1 ---");
        Zegar zegar = new Zegar(30.50, "damski", "", "nieznany");
        
        System.out.println();
        
        Analogowy analogowy = new Analogowy(999.99, "męski", "AH20B", "Pablo Eskobar", true, "automatyczny");
        
        System.out.println();
        
        Elektroniczny elektroniczny = new Elektroniczny(1150.00, "damski", "K100", "Pablo Eskobar", true, true);
        
        
        
        System.out.println();
        System.out.println("--- Zadanie 2 ---");
        System.out.println();
        
        Zadanie2Test();
        
        System.out.println();
        System.out.println("--- Zadanie 3 ---");
        System.out.println();
        
        Zadanie3Test();
    }
    
    private static void Zadanie2Test()
    {
        List<Zegar> zegarki = new ArrayList<>();
        
        zegarki.add(new Zegar(30.50, "damski", "", "nieznany"));
        zegarki.add(new Analogowy(999.99, "męski", "AH20B", "Pablo Eskobar", true, "automatyczny"));
        zegarki.add(new Elektroniczny(1150.00, "damski", "K100", "Pablo Eskobar", true, true));
        
        System.out.println();
        
        System.out.println("--- rosnaco cena ---");
        
        Collections.sort(zegarki);
        for (Zegar zegarek : zegarki) System.out.println(zegarek.toString());
        
        System.out.println("--- malejaco cena ---");
        
        Collections.reverse(zegarki);
        for (Zegar zegarek : zegarki) System.out.println(zegarek.toString());
    }
    
    private static void Zadanie3Test()
    {
        Zegar zegar = new Zegar(30.50, "damski", "", "nieznany");
        System.out.println(zegar.toString());
        
        System.out.println();
        
        Zegar analogowy = new Analogowy(999.99, "męski", "AH20B", "Pablo Eskobar", true, "automatyczny");
        System.out.println(analogowy.toString());
        
        System.out.println();
        
        Zegar elektroniczny = new Elektroniczny(1150.00, "damski", "K100", "Pablo Eskobar", true, true);
        System.out.println(elektroniczny.toString());
        

    }
}