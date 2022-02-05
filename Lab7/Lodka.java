public class Lodka implements Pojazd,PojazdPlywajacy{
    
    private final String name;
    public boolean stan = false;
    private final String type = "lodka";
    
    Lodka(String nazwa)
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
    public void jedz(){}
    public void plyn(){
        if(stan == false)
        {
            System.out.println("lodka nie moze plynac bo nie jest wlaczona");
        }
    }
    public String jaksienazywam()
    {
        return name;
    }
}
