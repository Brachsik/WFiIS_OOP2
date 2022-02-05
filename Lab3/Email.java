public class Email
{
    String txtmail;
    Employee from = null;

    public String getMessage()
    {
        return txtmail;
    }

    Employee getFrom()
    {
        return from;
    }
}