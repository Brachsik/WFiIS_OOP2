import java.util.List;

public class Main {
    public static void main(String[] args) {
    
    
        int[] tab = {1, 2, 3, 4};
        int[] tab2 = {6, 7, 8, 9};
        LinkedList list = new LinkedList(tab);
        System.out.println("Test display() oraz new LinkedList(tab)");
        list.display();

        System.out.println("Test add()");
        list.add(3);
        list.display();

        System.out.println("Test remove()");
        list.remove();
        list.display();
        
        System.out.println("Test merge()");
        LinkedList list2 = new LinkedList(tab2);
        list.merge(list2);
        list.display();

        System.out.println("Test constains()");
        list.contains(9);
        list.contains(3);
        list.contains(-3);

        System.out.println("\nTest clear()");
        list.clear();
        list.display();
        /* sprawdzenie cleara
        int[] tab3 = {1,2,3};
        LinkedList list3 = new LinkedList(tab3);
        list3.display();
        node jeden = list3.head;
        node dwa = jeden.next;
        list3.clear();
        System.out.println(jeden.next+", "+dwa.next);
        */
    }
    
}
