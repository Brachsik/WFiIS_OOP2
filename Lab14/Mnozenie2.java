import java.util.ArrayList;

public class Mnozenie2 {
    
    ArrayList<ArrayList<Integer>> macierz = new  ArrayList<ArrayList<Integer>>();
    int rozmiar;
    public void mnozenie(Macierz m1, Macierz m2)
    {   
        for(int i=0; i<m1.x; i++)
        {   
            rozmiar=m1.x;
            ArrayList<Integer> w = new ArrayList<Integer>();
            macierz.add(w);
                for(int j=0; j<m1.x; j++)
                {
                    int val=0;
                    for(int z=0; z<rozmiar; z++)
                    {
                        val+=m1.macierz.get(i).get(z)*m2.macierz.get(z).get(j);
                        
                    }
                    w.add(val);
                }
        }
    }

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
