package com.company;
import java.util.Scanner;

/**
 * @author kacper
 */
public class Main extends NowyKlient{
    public Main(){
        System.out.println("Witaj w bibliotece miejskiej! :)");
    }


    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        int liczbaDni = 30;
        Books ksiazki = new Books(liczbaDni);
        boolean z;
        System.out.println("Proszę o podanie swoich danych");
        System.out.println("Podaj swoje imie: ");
        String imie = reader.nextLine();
        System.out.println("Podaj swoje nazwisko: ");
        String nazwisko = reader.nextLine();
        NowyKlient nowy = new NowyKlient(imie, nazwisko);
        Books polecanie = new NowyKlient();
        polecanie.ksiazka();
        while (true) {
            System.out.println("Podaj numer swojej karty bibliotecznej[6 cyfr]: ");
            int nrKarty = Integer.parseInt(reader.nextLine());
            ksiazki.nrKarty += nrKarty;
            int dlugoscnumeru = String.valueOf(nrKarty).length();
            if (dlugoscnumeru != 6) {
                System.out.println("Twoj numer karty jest nieprawidłowy.");
                nowy.uzyjImienia(imie, nrKarty);
            } else
                break;
        }
        Menu();
        nowy.uzyjImienia(imie);


    }

    public static void Menu(){

        Scanner reader =new Scanner(System.in);
        double Oplata = 2.0;
        Books ksiazki = new Books(Oplata);
        System.out.println("Co chciałbyś dzisiaj zrobić?");
        System.out.println("1.Wypozyczenie ksiazki");
        System.out.println("2.Oddanie ksiazki");
        System.out.println("3.Wyjdz");
        int wybor = Integer.parseInt(reader.nextLine());
        switch(wybor){
            case 1: {
                ksiazki.removeBook();
                Menu();
            }
            case 2: {
                ksiazki.addBook();
                Menu();
            }
            case 3: {
                break;
            }
            default:
                break;
        }
    }

}


