package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;


public class Books {
    static ArrayList<String> book = new ArrayList<String>();
    static Scanner reader = new Scanner(System.in);
    String nrKarty;

        public Books(double Oplata){

        }
        public Books(){

        }
    static {

        book.add("Harry Potter i Komnata Tajemnic");
        book.add("Biografia Leonarda da Vinci");
        book.add("Za Zamknietymi Drzwiami");
        book.add("Wladca Pierscieni: Druzyna Pierscienia");
        book.add("Supermarket");
        book.add("Domek z Kart");
        book.add("Ready Player One");
        book.add("Astrofizyka dla Zabieganych");
        book.add("Programista samouk");
        book.add("Czysty Kod");
        book.add("Models");
        book.add("Zapisane wspomnienia");
        book.add("Jutrzejsza zagłada");
        book.add("Nawyki warte miliony");
        book.add("Jak lepiej myśleć");
        book.add("Potop");


    }
    static void ksiazka(){
            Random rand = new Random();
            int a = rand.nextInt(16);
        System.out.println("Dzisiaj polecamy ksiazke: " + book.get(a));
    }
    public static void addBook() {                                             //Dodawanie książki do listy.
        System.out.println("Podaj nazwe ksiazki: ");
        String nazwaKsiazki = reader.nextLine();
        book.add(nazwaKsiazki);
        System.out.println("Ile dni ja pan/pani posiadał/a?");
        int dni = Integer.parseInt(reader.nextLine());

        if (dni > 0 && dni <= 30) {                                                                //Naliczanie opłat.

            System.out.println("Pana książka została zwrócona w systemie, proszę ją odnieść na swoje miejsce :)");
        } else {
            Days(dni);
            int iloscdni = dni - 30;
            double wartosc = (double)iloscdni*2;

            System.out.println("Oplata za dodatkowe dni wypozyczenia wynosi: " + wartosc + "zl");
            System.out.println("Prosimy ją uiścić w naszej kasie przy wyjsciu :)");
        }
        System.out.println("Dziekujemy za skorzystanie z bilbioteki i zapraszamy ponownie! :)");
    }
    public static int Days(int dni) throws IllegalArgumentException{                 //Wylapywanie wyjatkow
        if(dni<0){
            try{
                System.out.println("Napewno tyle? :O");
            }
            catch(IllegalArgumentException e){
                dni=0;
            }
            finally {
                System.out.println("Przepraszamy, wystąpił problem :(");
            }
        }
        return dni;
    }

    public static void removeBook(){                                                              //Wypozyczenie ksiazek z listy.
        System.out.println("Więc chce pan wypozyczyć książkę...");
        System.out.println("Chce pan zobaczyć naszą listę książek(1) czy szukać po nazwie(2)?");
        System.out.println("Proszę wpisać odpowiednią liczbę");
        int opcja = Integer.parseInt(reader.nextLine());
        switch (opcja) {                                                                        //Wybor pomiedzy wybraniem z listy a wpisaniem
            case 1:
                print(book);
                System.out.println("Upatrzył/a sobie pan/pani jakąś?");
                search();
                break;

            case 2:
                search();
                break;

        }
    }



    public static void print(ArrayList<String> list) {                                          // Sortowanie listy alfabetycznie;
        Collections.sort(book);
        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i));
        }
    }


    public static void search() {                                                         //Wyszukiwanie ksiazki
        System.out.println("W takim razie proszę wpisać jej nazwę :)");
        String nazwaKsiazki = reader.nextLine();
        if (book.contains(nazwaKsiazki)) {
            book.remove(nazwaKsiazki);
            System.out.println("Pana książka została wypozyczona.");
            System.out.println("Proszę pamiętać o terminie 30-dniowym, po nim naliczamy oplate w wysokosci 2zł/dzień");
            System.out.println("Życzymy miłej lektury");
        }
        else{
            System.out.println("Przepraszamy ale prawdopodobnie coś zostało źle wpisane");
            search();
        }

    }
}
