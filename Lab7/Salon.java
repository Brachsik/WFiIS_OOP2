import java.util.ArrayList;
import java.util.List;

public class Salon {
    final String name;
    List<Pojazd> pojazdy = new ArrayList<>();
    Salon(String nazwa)
    {
        name = nazwa;
    }
    Salon(Salon s, String nazwa)
    {
        name = nazwa;
        pojazdy.addAll(s.pojazdy);
    }
    void dodajPojazd(Pojazd obj)
    {
        pojazdy.add(obj);
        System.out.println("dodaje nowy pojazd");
    }
    void wypiszWszystkiePojazdy()
    {
        for(Pojazd brumbrum : pojazdy) {
            System.out.print(brumbrum);
            if(pojazdy.get(pojazdy.size()-1) != brumbrum)
            System.out.print(" ,");
       }
       System.out.println();
    }
    void usunPojazd(Pojazd obj)
    {
        System.out.println("usuwam "+ obj);
        pojazdy.remove(obj);
    }
    void zawieraPojazd(Pojazd obj)
    {
        System.out.println(pojazdy.contains(obj));
    }
}
