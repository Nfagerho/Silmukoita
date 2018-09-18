package fi.academy;

import java.util.Scanner;

public class Silmukoita {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Tämä on testiä GIT:iin. Nyt lisäsin tähän tämän lauseen.");
        System.out.println("Tässä pieni silmukka:");

        int i = 0;
        while (i < 6) {
            System.out.println("Hei maailma!");
            i++;
        }

        System.out.println("Tässä vielä toinen silmukka. Syötä luku: ");
        int syöte = lukija.nextInt();
        int j = 0;
        while (j < syöte) {
            System.out.println("*");
            System.out.println(" ");
            j++;
        }

        System.out.println("Lisäsin tähän vielä tämän vikan lauseen.");



    }
}
