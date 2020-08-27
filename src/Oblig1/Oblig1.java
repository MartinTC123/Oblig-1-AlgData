package Oblig1;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    //Oppgave 1 (Metoder: ferdig)
    public static int maks(int[]a){
        if (a.length == 0){
            throw new NoSuchElementException("Denne tabellen er tom!");
        }

        for (int i= 0; i < a.length; i++){
            for (int j = i +1; j < a.length; j++){
                if (a[i] > a[j]){
                    int temp= a[i];a[i]=a[j];a[j]= temp; // bytter plass på a[i] og a[j] hvis den er sann.
                }
            }
            System.out.print(a[i] + " "); // Print for å sjekke om tabellens største verdi ligger bakerst.
        }

        int max= a[0];

        for (int i= 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static int ombyttinger(int[] a){
        int teller= 0;

        for (int i= 0; i < a.length; i++){
            for (int j= i + 1; j < a.length; j++){
                if (a[i] > a[j]){
                    int temp= a[i];a[i]=a[j];a[j]= temp;
                    teller++; // teller som øker for hver gang et et ombytte skjer.
                }
            }
        }
        return teller;
    }

    //Oppgave 2 (Metode: ferdig)
    public static int antallUlikeSortert(int[]a){
        int teller= 1;

        if (a.length == 0){
            return 0;
        }

        boolean sortert= false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] <= a[j]) {
                    sortert = true;
                } else {
                    sortert = false;
                    throw new IllegalStateException
                            ("Tabellen er ikke sortert i stigende rekkefølge!");
                }
            }
        }
        int j= 0;
        for (int i= 1; i < a.length; i++){
            for (j= 0; j < a.length; j++){
                if (a[i] == a[j]){
                    break;
                }
            }
            if (i == j){
                teller++;
            }
        }
        return teller;
    }

    // Oppgave 3 (Metode: ferdig)
    public static int antallUlikeUsortert(int[]a){
        if (a.length == 0){
            return 0;
        }

        int teller= 1;
        int j= 0;

        for (int i = 1; i < a.length; i++){
            for (j= 0; j < a.length; j++){
                if (a[i] == a[j]){
                    break;
                }
            }
            if (i == j){
                teller++;
            }
        }
        return teller;
    }

    // Oppgave 4 (Metoden
    public static void delsortering(int[]a){
        int part= 0;
        int oddt= 0;

        for (int i= 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];a[i] = a[j];a[j] = temp; // bytter plass på a[i] og a[j] hvis den er sann.
                }
            }
        }

        for (int i= 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                a[i]= part;
            }
        }

        for (int i= 0; i < a.length; i++){
            if (a[i] % 2 != 0){
                a[i] = oddt;
            }
        }
      //  System.out.print(Arrays.toString(a));
    }

    public static void delsortering2(int[] a){
        int left = 0;
        int right = a.length-1;
        for (int i =0; i<a.length; ++i){
            while (a[left]%2!=0){
                left++;
            }
            while (a[right]%2==0) {
                right--;
            }
            if(left<right){
                int temp = a[left];
                a[left] = a[right];
                a[right]=temp;
            }
        }
        System.out.println(Arrays.toString(a) + "   "+ left + right);
    }

    public static void rotasjon(char[]a){
        char temp = a[a.length - 1];
        for (char c = (char) (a.length - 1); c > 0; c--) {
            a[c] = a[c - 1];
        }
        a[0] = temp;
        System.out.print(Arrays.toString(a)+" ");
    }

    public static void main(String[] args) {
        int[] a = {2,20,7,4,1,6,10,5,19};
        int[] b = {3,3,3,4,4,5,9,10};


        // 1,5,7,19,2,4,6,10,20
        delsortering(a);
        delsortering2(b);

        //System.out.println("Antall ulike verdier i en sortert tabell: " + antallUlikeSortert(b));
        //System.out.println("Antall ulike verdier i en usortert/sortert tabell: " + antallUlikeUsortert(a));

        //System.out.println("Antall ombyttinger: " + ombyttinger(a));
        //System.out.println("\n" + "Den største verdien i tabellen er: " + maks(a));

    }
}

