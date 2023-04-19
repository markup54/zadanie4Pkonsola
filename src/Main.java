import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sortowanie sortowanie = new Sortowanie();
        sortowanie.wczytajTabliceZKlawiatury();
        sortowanie.sortujTablice();
        sortowanie.wypiszTablice();
        /*Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj tekst do zaszyfrowania");
        String doZaszyfrowania = odczyt.next();
        String zaszyfrowane = szyfruj(doZaszyfrowania,"GADERYPOLUKI");
        System.out.println("Tekst po szyfrowaniu "+zaszyfrowane);
         */
    }

    /********************************************************
     * nazwa funkcji: szyfruj
     *
     * parametry wejściowe: slowo - slowo do zaszyfrowania typu string
     *                      klucz - klucz szyfrowania, slowo okreslajace jakie litery są zastępowane
     * wartość zwracana: szyfr - zmienna tekstowa przechowująca zaszyfrowany tekst
     * opis funkcji: funkcja szyfruje tekst szyfrem podstawieniowym zwanym GADERYPOLUKI
     * autor: 0000000000000
     * ****************************************************/
    public static String szyfruj(String  slowo , String klucz) {
        String szyfr = "";
        for(int i=0;i<slowo.length();i++){
            Character litera = (char) slowo.charAt(i);
            if(klucz.contains(litera.toString()))
            {
                //podmiana
                int indeks = klucz.indexOf(litera.toString());
                if(indeks%2 ==0){
                    szyfr = szyfr+klucz.charAt(indeks+1);
                }
                else{
                    szyfr = szyfr+klucz.charAt(indeks-1);
                }
            }
            else{
                szyfr = szyfr+litera;
            }
        }
        return  szyfr;
    }
}