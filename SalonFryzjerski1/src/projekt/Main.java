package projekt;

import projekt.stylists.ActionOnStylist;

import java.util.Scanner;

public class Main extends ActionOnStylist {
    public Main(String name, String surname, String pesel, int age) {
        super(name, surname, pesel, age);
    }

    public static void main(String[] args) {

        System.out.println("podaj imię stylisty którego chcesz wyszukać ");
        Scanner w = new Scanner(System.in);

        String stylistname = w.nextLine();
        System.out.println(searchStylist(s));

        System.out.println("Czy chcesz dodać Stylistę?");
        String addstylist = w.nextLine();

        if(addstylist=="tak"){

            System.out.println("Dodaj Stylistę [imie,nazwisko,pesel,wiek]");
            String name = w.nextLine();
            String surname = w.nextLine();
            String pesel = w.nextLine();
            String wiek = w.nextInt();
            addStylist(name,surname,pesel,wiek);
        } else{continue;}

        System.out.println("Czy chcesz usunąć Stylistę?");
        String removeStylist = w.nextLine();

        if(removeStylist=="tak"){
            System.out.println("podaj imie stylisty");
            String name = w.nextLine();
            String stylista=searchStylist(name);
            removeStylist(stylista);

        } else{continue;}


//        boolean czyPoprawne = false;
//
//        while(!czyPoprawne) {
//            try {
//                index = Integer.parseInt(odczyt.readLine());
//            } catch (NumberFormatException n) { System.out.println("Niepoprawne dane! " +
//                    "\n Który element tablicy chcesz zobaczyć: ");
//            } catch (IOException e) { System.out.println("Błąd odczytu danych");
//            }
//
//            czyPoprawne = index == -1? false : true;
//        }

    }}