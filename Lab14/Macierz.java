import java.util.ArrayList;

public class Macierz {

    ArrayList<ArrayList<Integer>> macierz = new  ArrayList<ArrayList<Integer>>();
    int x,y;

    void generate(int x, int y)
    {
        this.x=x;
        this.y=y;
        
        for(int i=0; i<x; i++)
        {
            ArrayList<Integer> w = new ArrayList<Integer>();
            macierz.add(w);
            for(int j=0; j<y; j++)
            {

                double val= Math.random();
                val*=100;
                w.add((int)val);
            }
        }

    }

    void wypisz()
    {
        System.out.println();
        for(int i=0; i<x; i++)
        {
            for(int j=0; j<y; j++)
            {
                System.out.print(macierz.get(i).get(j)+"  ");
            }
            System.out.println();
        }
        System.out.println();System.out.println();
    }
}
