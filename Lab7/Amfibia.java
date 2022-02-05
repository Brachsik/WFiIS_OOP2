public class Amfibia implements Pojazd, PojazdPlywajacy
{
    private final String name;
    public boolean stan = true;
    private final String type = "Amfibia";
    
    Amfibia(String nazwa)
    {
        name = nazwa;
    }
    public void zmienstanstart()
    {
        if(stan)
        {
            System.out.println(type+" "+name+" zaczyna plynac");
        }
        stan = true;
    }
    public void zmienstanstop()
    {
        stan = false;
        System.out.println(type+" "+name+" zatrzymuje silnik");
    }



    @Override
    public String toString() {
        return type;
    }

    public void jedz()
    {
        if(stan)
            System.out.println("Amfibia jedzie");
        else
        System.out.println("Niie dziala");
    }
    public void plyn()
    {
        if(stan)
            System.out.println("Amfibia plynie");
    }
    public String jaksienazywam()
    {
        return name;
    }
}
