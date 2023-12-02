package projekt;

import projekt.stylists.ActionOnStylist;
import projekt.stylists.Stylists;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main extends ActionOnStylist {

    public Main(String name, String surname, String pesel, int age) {
        super(name, surname, pesel, age);
    }

    public static void main(String[] args) {

        Stylists stylist1 = new Stylists("Anna","Maria","13243259423",24);
        Stylists stylis2 =new Stylists("Jan","Nowak","23243259445",34);
//        stylisci.add(new Stylists("Marta","Wiśniewska","33243259444",54));
//        stylisci.add(new Stylists("Piotr","Lewandowski","82565354721",44));
//        stylisci.add(new Stylists("Michał","Kamiński", "09876543212",22));
//        stylisci.add(new Stylists("Agnieszka","Kubiak", "56254351536",41));
//        stylisci.add(new Stylists("Tomasz","Kaczmarek", "98346397802",32));
//        stylisci.add(new Stylists("Magdalena","Zielińska", "39179408359",71));
//        stylisci.add(new Stylists("Grzegorz","Szymański", "58370569289",17));
//        stylisci.add(new Stylists("Karolina","Woźniak", "39077291636",24));
//        stylisci.add(new Stylists("Marcin","Dąbrowski", "64907727301",55));
//        stylisci.add(new Stylists("Justyna","Nowicki", "75109472546",56));
//        stylisci.add(new Stylists("Karolina","Jankowska", "88064193669",57));
//        stylisci.add(new Stylists("Paweł","Michalski", "11857131729",43));
//        stylisci.add(new Stylists("Aleksandra","Król", "30462966822",22));
//        stylisci.add(new Stylists("Andrzej","Wróbel", "71213384131",33));
//        stylisci.add(new Stylists("Monika","Adamska", "78105149948",55));
//        stylisci.add(new Stylists("Beata","Bezmysłow", "30042669641",66));
//        stylisci.add(new Stylists("łukasz","Kasza", "20200615098",23));
//        stylisci.add(new Stylists("Rafał","Maziarz", "42034370793",44));


    System.out.println(writeStylists());

        System.out.println("podaj imię stylisty którego chcesz wyszukać ");
        Scanner w = new Scanner(System.in);

        String stylistname = w.nextLine();
        System.out.println(searchStylist(Stylists.name));


        while(true) {
            System.out.println("Czy chcesz dodać stylistę? [tak/nie]");
            String addStylist = w.nextLine();

            if (addStylist.equals("tak")) {
                System.out.println("Dodaj Stylistę [imię, nazwisko, pesel, wiek]");
                String name = w.nextLine();
                String surname = w.nextLine();
                String pesel = w.nextLine();
                int age = w.nextInt();
                addStylist(name,surname,pesel,age);
            } else if (addStylist.equals("nie")) {
                break;
            } else {
                System.out.println("Niepoprawna odpowiedź, wprowadź 'tak' lub 'nie'.");
            }
        }


        while(true) {
            System.out.println("Czy chcesz usunąć stylistę? [tak/nie]");
            String removestylists = w.nextLine();

            if (removestylists.equals("tak")) {
                System.out.println("Usuń Stylistę [imię, nazwisko, pesel, wiek]");
                String name = w.nextLine();
                String surname = w.nextLine();
                String pesel = w.nextLine();
                int age = w.nextInt();
                removeStylist(name,surname,pesel,age);
            } else if (removestylists.equals("nie")) {
                break;
            } else {
                System.out.println("Niepoprawna odpowiedź, wprowadź 'tak' lub 'nie'.");
            }
        }


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