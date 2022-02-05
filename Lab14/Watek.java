import java.util.ArrayList;

import javax.crypto.Mac;

public class Watek extends Thread{
    ArrayList<Integer> w;
    Macierz m1,m2;
    int i;
    Watek(Macierz m1, Macierz m2, int i, ArrayList<Integer> w)
    {
        this.m1=m1;
        this.m2=m2;
        this.i=i;
        this.w=w;
    }

    @Override
    public void run() {
        for(int j=0; j<m1.y; j++)
            {
                int val=0;
                    for(int z=0; z<m1.y; z++)
                    {
                        val+=m1.macierz.get(i).get(z)*m2.macierz.get(z).get(j);
                        
                    }
                    w.add(val);
            } 
}
}
