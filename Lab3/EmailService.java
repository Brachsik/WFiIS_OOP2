public class EmailService
{
    void generateEmailForNewEmployee(Employee obj, int Dep)
    {
        if(Dep==1)
        {
            obj.mail=obj.imie+"."+obj.nazwisko+"@DEVELOPERS.com";
        }
        else if(Dep==2)
        {
            obj.mail=obj.imie+"."+obj.nazwisko+"@MANAGEMENT.com";
        }
        else
        {
            obj.mail=obj.imie+"."+obj.nazwisko+"@HR.com";
        }
    }
    void sendMail(Employee _from, Employee to, String txt)
    {
        to.lastmessage= new Email();
        to.lastmessage.txtmail=txt;
        to.lastmessage.from = _from;
    }
}