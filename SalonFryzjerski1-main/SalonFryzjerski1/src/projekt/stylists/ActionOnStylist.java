package projekt.stylists;
import java.util.Set;
import java.util.TreeSet;


public class ActionOnStylist extends Stylists {

    public static Set<Stylists> stylisci = new TreeSet<>();

    public ActionOnStylist(String name, String surname, String pesel, int age) {
        super(name, surname, pesel, age);
    }




    public static void addStylist(String name, String surname, String pesel, int age) {
        stylisci.add(new Stylists(Stylists.name, Stylists.surname, Stylists.pesel, Stylists.age));
    }

    public static Stylists searchStylist(String name) {
        for (Stylists stylist : stylisci) {
            if (stylist.getName().equals(name)) {
                return stylist;
            }
        }
        return null;
    }



    public static void removeStylist(String name, String surname, String pesel, int age){
            System.out.println(stylisci.remove(new Stylists(Stylists.name, Stylists.surname, Stylists.pesel, Stylists.age)));
        }

        public static String writeStylists(){
            for (Stylists stylist : stylisci) {
                System.out.println("Name: " + stylist.getName() +
                        ", Surname: " + stylist.getSurname() +
                        ", Pesel: " + stylist.getPesel() +
                        ", Age: " + stylist.getAge());
            }
            return null;
        }

    }