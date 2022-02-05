import java.util.ArrayList;

public class Mnozenie {

    ArrayList<ArrayList<Integer>> macierz = new  ArrayList<ArrayList<Integer>>();
    int rozmiar;

   void mnozenie(Macierz m1, Macierz m2)
   {
       for(int i=0; i<m1.y; i++)
    {   
        rozmiar=m1.x;
        ArrayList<Integer> w = new ArrayList<Integer>();
        macierz.add(w);
            
        new Watek(m1,m2,i,w).start();
    
    }}
    void wypisz()
    {
        System.out.println();
        for(int i=0; i<rozmiar; i++)
        {
            for(int j=0; j<rozmiar; j++)
            {
                System.out.print(macierz.get(i).get(j)+"  ");
            }
            System.out.println();
        }
        System.out.println();System.out.println();
    }
}
