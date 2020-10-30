package com.company;

public class NowyKlient extends Books {
    NowyKlient(String name,String surname) {
    }
    NowyKlient() {
    }
            public void uzyjImienia(String imie){
                System.out.println("Dziekujemy za wizyte: "+imie);
            }
            public void uzyjImienia(String imie,int nr){
                System.out.println(imie+ " twoj numer to chyba nie " +nr+" prawda?");
            }

            static void ksiazka(){
                System.out.println("Dzisiaj polecamy ksiazke: " + book.get(7));
            }

    }





