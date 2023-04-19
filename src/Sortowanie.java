import java.util.Scanner;

public class Sortowanie {
    public int tablicaSortowana []  =new int [10];
    public void wczytajTabliceZKlawiatury(){
        System.out.println("Wczytywanie tablicy");
        Scanner odczyt = new Scanner(System.in);
        for(int i = 0 ; i < tablicaSortowana.length;i++){
            System.out.println("Podaj "+i+" element tablicy");
            tablicaSortowana[i] = odczyt.nextInt();
        }
    }

    public void  wypiszTablice(){
        for(int i = 0 ; i < tablicaSortowana.length;i++){
            System.out.println(tablicaSortowana[i]+", ");
        }
    }
    private int szukajMaksymalnej(int indeks){
        int maksymalna= tablicaSortowana[0];
        int ind =0;
        for(int i = indeks; i<tablicaSortowana.length;i++){
            if (maksymalna < tablicaSortowana[i]){
                maksymalna = tablicaSortowana[i];
                ind = i;
            }
        }
        return ind;

    }
    public void sortujTablice(){
        for(int i=0; i <tablicaSortowana.length-1;i++){
            int indeks = szukajMaksymalnej(i);
            //zamienic element i z elementem pod indeksem
            int pomoc = tablicaSortowana[i];
            tablicaSortowana[i]=tablicaSortowana[indeks];
            tablicaSortowana[indeks] = pomoc;
        }
    }
}
