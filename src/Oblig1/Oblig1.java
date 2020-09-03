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
 //Oppgave 4 - delsortering
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
        for(int j : a){
        for (int i = 1; i<a.length;i++){
            if (i<left && a[i] < a[i-1] ){
                int temp = a[i-1];
                a[i-1] = a[i];
                a[i]=temp;
            }
            if (i>left && a[i] < a[i-1] ){
                int temp = a[i-1];
                a[i-1] = a[i];
                a[i]=temp;
            }
        }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void rotasjon(char[]a){
        char temp = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;
        System.out.print(Arrays.toString(a)+" ");
    }

    public static void rotasjon2(char[]a, int k){
        if (k < 0){
            for (int i= 0; k < 0; k++) {
                for (int j = 0; j < a.length - 1; j++) {
                    char temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.print(Arrays.toString(a));
        }
        else {
            for(int i = 0; i < k; i++){
                for (int j= a.length-1; j > 0; j--){
                    char temp= a[j];
                    a[j]= a[j-1];
                    a[j - 1]= temp;
                }
            }
            System.out.print(Arrays.toString(a));
        }
    }

        //Oppgave 7a-fletting

    public static String flett(String s, String t) {
        System.out.println(s.length());
        String returner = "";
        int length = 0;
        if (s.length() > t.length()) {
            length = s.length();
        } else {
            length = t.length();
        }
        for (int i = 0; i < length; i++) {
            if (s.length() > i) {
                char a = s.charAt(i);
                returner += String.valueOf(a);
            }
            if (t.length() > i) {
                char b = t.charAt(i);
                returner += String.valueOf(b);
            }
        }
        return returner;
    }

        //oppgave 7b-fletting

        public static String flettArray(String[] s){
        String returner = "";
        int maxlength =0;
            for(String a : s){
                if(a.length()>maxlength){
                    maxlength=a.length();
                }
                }
            for (int i = 0; i<maxlength;i++){
                for (String a:s){
                    if (a.length()>i) {
                        char b = a.charAt(i);
                        returner += String.valueOf(b);
                    }
                }
            }
            return returner;
        }



    public static void main(String[] args) {
        int[] a = {2,20,7,4,1,6,10,5,19};
        int[] b = {5,9,3,4,4,5,2,10};
        char[]d= {'a','b','c','d','e'};
        String[] c= {"Hei","Hallo", "Hoi", "data"};
        String s = "Hei";
        String t= "Hallo";

        System.out.println(flett(s,t));
        System.out.println(flettArray(c));
        // 1,5,7,19,2,4,6,10,20

        //rotasjon2(d, -3);

        //delsortering2(a);

        //System.out.println("Antall ulike verdier i en sortert tabell: " + antallUlikeSortert(b));
        //System.out.println("Antall ulike verdier i en usortert/sortert tabell: " + antallUlikeUsortert(a));

        //System.out.println("Antall ombyttinger: " + ombyttinger(a));
        //System.out.println("\n" + "Den største verdien i tabellen er: " + maks(a));

    }
}

