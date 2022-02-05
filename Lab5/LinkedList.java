
public class LinkedList
{
    node head=new node();
    node last;
    LinkedList(int[] x)
    {
        
        int rozmiar = x.length;
        if(rozmiar!=0)
        head.val=x[0];
        node temp = head;
        last = head;
        for(int i=1; i<rozmiar; i++)
        {
            node nowy = new node();
            nowy.val=x[i];
            temp.next=nowy;
            temp = nowy;
            last = temp;
        }
    }

    void add(int number)
    {
        node nowy = new node();
        last.next = nowy;
        nowy.val=number;
        last = nowy;
    }

    void display()
    {
        if(head!=null)
        {
            node temp = head;
            while(temp!=last)
            {
                System.out.print(temp.val+", ");
                temp = temp.next;
            }
            System.out.println(temp.val+"\n");
        }   
    }

    void remove()
    {
        if(head!=null)
        head = head.next;

    }

    void merge(LinkedList obj)
    {
        if(head!=null)
        {
            last.next=obj.head;
            last=obj.last;
        }
        else
        {
            head=obj.head;
            last=obj.last;
        }
        
    }
    void contains(int number)
    {
        node temp=head;
        while(temp!=null)
        {
            if(number == temp.val)
            {
                System.out.println("Lista zawiera: "+number);
                break;
            }
            temp=temp.next;
        }
        if(temp == null)
            {
                System.out.println("Lista nie zawiera: "+number);
            }

    }
    
    void clear()
    {
        node temp=head;
        node temp2;
        while(temp!=last)
        {
            temp2=temp.next;
            temp.next=null;
            temp=temp2;
        }
        head = null;
        last = null;

    }

}