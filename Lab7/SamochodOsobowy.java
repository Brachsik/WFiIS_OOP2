public class SamochodOsobowy implements Pojazd{
    
    public boolean stan = false;
    private final String name;
    private final String type = "samochod";
    SamochodOsobowy(String nazwa)
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
    public String jaksienazywam()
    {
        return name;
    }

}
