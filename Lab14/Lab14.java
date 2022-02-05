import java.util.Scanner;

// stworzyc program który utworzy dwie macierze z losowymi liczbami całkowitymi o wymiarach które wpisuje uzytkownik na poczatku wykonywania programu
// m1 => m x p
// m2 => n x p
// następnie wykonuje operacje mnożenia macierzy
// raz bez użycia wątków
// drugi raz przy użyciu wielu wątków
// uzytkownik otrzymuje output
// jesli wynikowa macierz ma wymiar wiekszy niz 10x10 nie printujemy ani wylosowanych ani wynikowej, podajemy tylko czasy
//SINGLE THREAD:
//Matrix 1 :
//
//830  930  360
//840  140  580
//200  270  370
//
//Matrix 2 :
//
//440  600  390
//630  590  390
//830  220  530
//
//Output Matrix :
//
//1249900  1125900  877200
//939200  714200  689600
//565200  360700  379400
//
//Time taken in milli seconds: 2
//==================
//MULTIPLE THREAD
//Matrix 1 :
//
//830  930  360
//840  140  580
//200  270  370
//
//Matrix 2 :
//
//440  600  390
//630  590  390
//830  220  530
//
//Output Matrix :
//
//1249900  1125900  877200
//939200  714200  689600
//565200  360700  379400
//
//Time taken in milli seconds: 1
//==================

// Mierzenie czasu: System.currentTimeMillis()
// Liczba dostępnych procesorów: Runtime.getRuntime().availableProcessors()
public class Lab14 {
    private static final Exception ExceptionInInitializerError = null;

    public static void main(String[] args) {
        Macierz m1= new Macierz();
        Macierz m2= new Macierz();
        Scanner scan = new Scanner(System.in);
        int x,y,x1,y1;
        System.out.print("Ile wierszy: ");
        x=scan.nextInt();
        System.out.print("Ile Kolumn: ");
        y=scan.nextInt();
        System.out.print("Ile wierszy: ");
        x1=scan.nextInt();
        try{
            System.out.print("Ile Kolumn: ");
            y1=scan.nextInt();
            if(x!=y1)
            {
                throw ExceptionInInitializerError;
            }
            m1.generate(x, y);
            m2.generate(x1, y1);
    
            Mnozenie2 wynik = new Mnozenie2();
            long start = System.currentTimeMillis();
            wynik.mnozenie(m1,m2);
            long end = System.currentTimeMillis();
            System.out.println("Czas zwyklego: " + (end-start));
            if(x<10)
            wynik.wypisz();
    
            Mnozenie wynikthread = new Mnozenie();
            start = System.currentTimeMillis();
            wynikthread.mnozenie(m1,m2);
            end = System.currentTimeMillis();
            System.out.println("Czas niezwyklego: " + (end-start));
            if(x<10)
            wynikthread.wypisz();
        }
        catch(Exception e)
        {
            System.out.println("ZLE ROZMIARY!!!!");
        }
       
    }
}
