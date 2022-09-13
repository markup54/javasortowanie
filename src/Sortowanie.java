import java.util.Scanner;

public class Sortowanie {
    public int[] tablica;
    public void sortowan(){
        for(int i=0;i<tablica.length;i++){
            int indeksSzukany = maksymalna(i);
            int pomoc = tablica[indeksSzukany];
            tablica[indeksSzukany]=tablica[i];
            tablica[i]=pomoc;
        }
    }
    public int maksymalna(int i){
        int indexSz = i;
        int maks = tablica[i];
        for(int k = i+1; k<tablica.length;k++){
            if(maks<tablica[k]) {
                maks = tablica[k];
                indexSz = k;
            }
        }
        return indexSz;
    }
    void wypelnijTablice(){
        tablica=new int[10];
        System.out.println("Podaj 10 elementów tablicy");
        Scanner klawiatura = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Podaj element"+i);
            tablica[i] = klawiatura.nextInt();
        }
    }
    void wypiszTablice(){
        System.out.println("tablica:");
        for(int element:tablica){
            System.out.print(element+" ");
        }
    }
    //https://pastebin.com/LicBSkCu
}
