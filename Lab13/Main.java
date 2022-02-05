

//        Szyfr Cezara
//
//        Napisz program który będzie obsługiwał dwa tryby oraz przesunięcie w alfabecie niezbędne do zakodowania słowa w szyfr cezara
//
//        (tryb oraz przesunięcie przekazane jako argumenty programu):
//
//        1. Input z pliku zostaje zaszyfrowany i zapisany do pliku o tej samej nazwie + _coded_{przesuniecie}.txt (3pkt za obsługę pojedyńczych wyrazów + 2 pkt za obsługe całych
//
//        zdań ze spacjami)
//
//        2. Input z pliku zostaje odszyfrowany i zapisany do pliku o tej samej nazwie + _decoded_{przesuniecie}.txt. (3pkt za obsługę pojedyńczych wyrazów + 2 pkt za obsługe całych
//
//        zdań ze spacjami)
//
//
//        3. Argumenty programu przekazane jako:
//        java lab2 code 2 test.txt
//        java lab2 decode 2 test.txt
//
//                test.txt zawiera słowo TEST
//
//        4. Przykładowy wynik:
//                (To wypisujemy na konsole)
//        Dla alfabetu: ABCDEFGHIJKLMNOPQRSTUVWXYZ
//        Dla pliku z zawartoscia: TEST
//        Przesunięcia: 2
//        Trybu: code
//        Wynik: VGUV
//
//                (To trafia do pliku o nazwie test_coded_2.txt)
//                VGUV

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

                StringBuilder data = null;
                try {
                        File myObj = new File(args[2]);
                        Scanner myReader = new Scanner(myObj);
                        data = new StringBuilder();
                        while (myReader.hasNextLine()) {
                                data.append(myReader.nextLine());

                        }
                        myReader.close();
                } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                }
               System.out.println("Zawartosc pliku: "+data);

                if (data != null) {
                        data = new StringBuilder(data.toString().toUpperCase());
                }

                int n = Integer.parseInt(args[1]);
                System.out.println("Przesuwamy o: " + n);
                System.out.println("Tryb: " + args[0]);
                StringBuilder encrypted = new StringBuilder();
                char c;
                if (data != null) {
                        for (int i = 0; i < data.length(); i++) {
                                if(args[0].equals("code"))
                                {
                                        if((data.charAt(i))==' ')
                                        {
                                                c=' ';
                                        }
                                        else
                                        {
                                                c = (char) ((int)data.charAt(i) + n);
                                                if ((int)c > 90)
                                                {
                                                        c -= 26;
                                                }
                                        }

                                }
                                else{
                                        if((data.charAt(i))==' ')
                                        {
                                                c=' ';
                                        }
                                        else {
                                                c = (char) ((int)data.charAt(i) - n);
                                                if ((int)c < 65) c += 26;
                                        }
                                }
                                encrypted.append(c);
                        }
                }

                System.out.println("Wynik: "+encrypted);
                String name = args[2];
                name = name.replaceAll(".txt","");
                String FileName = name+"_"+args[0]+"d_"+args[1]+".txt";
                try {
                        File myObj = new File(FileName);
                        if (myObj.createNewFile()) {

                                System.out.println("File created: " + myObj.getName());
                        } else {
                                System.out.println("File"+FileName+" already exists.");
                        }
                } catch (IOException e) {
                        System.out.println("An error occurred.");
                }
                try {
                        FileWriter myWriter = new FileWriter(FileName);
                        myWriter.write(encrypted.toString());
                        System.out.println("Zapisano do pliku: "+FileName);
                        myWriter.close();
                } catch (IOException e) {
                        System.out.println("An error occurred.");
                }

        }
}
