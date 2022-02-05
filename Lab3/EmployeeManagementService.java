public class EmployeeManagementService
{
    static int ileEmp=0;
    static Employee head=null;
    void addNewEmployee(Employee obj)
    {
        ileEmp=obj.n;
        Employee temp=head;
        if(head==null)
        {
            head=obj; 
        }
        else
        {
            for(int i=1; i<ileEmp-1; i++)
            {   
            temp=temp.next;
            }
            temp.next=obj;

        }        
        System.out.println("Employee added "+obj.imie+" "+obj.nazwisko);
    }

    void printAllEmployees()
    {
        Employee temp=head;
        for(int i=0; i<ileEmp; i++)
            {   
            System.out.println("Employee: "+temp.imie+" , "+temp.nazwisko);
            temp=temp.next;
            }
    }

    void changeEmail(Employee obj, String newmail)
    {
        if(obj.imie==null)
        {
            System.out.println("Nie ma takiego pracownika");
        }
        else
        obj.mail=newmail;
    }
    void fireEmployee(Employee obj)
    {
        obj.imie=null;
        obj.nazwisko=null;
        obj.mail=null;
        obj.lastmessage=null;
        ileEmp--;
        head=head.next;
    }
    void sendMailToAllEmployees(String allmail)
    {
        Employee temp=head;
        for(int i=0; i<ileEmp; i++)
        {
            temp.lastmessage.txtmail=allmail;
            temp=temp.next;
        }
        
    }


}