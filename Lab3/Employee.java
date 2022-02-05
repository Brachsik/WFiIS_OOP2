public class Employee
{
    int n;
    String imie;
    String nazwisko;
    String mail;
    Email lastmessage=new Email();
    public Employee next = null;
    Employee(int _n, String _imie, String _nazwisko)
    {
        n=_n;
        imie=_imie;
        nazwisko=_nazwisko;
    }

    public String getEmail()
    {
        return mail;
    }

    public Email getLastEmailMessage()
    {
        return lastmessage;
    }
}