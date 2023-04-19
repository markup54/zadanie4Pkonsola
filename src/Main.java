import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj tekst do zaszyfrowania");
        String doZaszyfrowania = odczyt.next();
        String zaszyfrowane = szyfruj(doZaszyfrowania,"GADERYPOLUKI");
        System.out.println("Tekst po szyfrowaniu "+zaszyfrowane);
    }


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