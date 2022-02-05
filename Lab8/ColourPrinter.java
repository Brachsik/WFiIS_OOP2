

public class ColourPrinter {
    enum Kolory {
        czerwony("Red", "Czerwony"), 
        zielony("Green", "Zielony"), 
        zolty("Yellow", "Zolty"), 
        niebieski("Blue", "Niebieski");
        private final String ang;
        private final String pl;
    
        Kolory(String sa, String spl)
        {
            this.ang = sa;
            this.pl = spl;
        }
    }
    static void printColours()
    {
        Kolory[] wszystkie = Kolory.values();
        for(Kolory k : wszystkie){
            System.out.println("Kolor: "+ k.ang+" Po polsku "+ k.pl);
        }
    }
    static void printGetNameColours()
    {

        Kolory[] wszystkie = Kolory.values();
        for(Kolory k : wszystkie){
            System.out.println(k.pl);
        }
     
    }
    static void printSaySomethingColours()
    {

        Kolory[] wszystkie = Kolory.values();
        for(Kolory k : wszystkie){
            System.out.println("Kolor to:"+k.pl);
        }
    }
}
