package projekt.stylists;
import java.util.Set;
import java.util.TreeSet;

public class StylistsList extends Stylists {

    public StylistsList(String name, String surname, String pesel, int age) {
        super(name, surname, pesel, age);
    }
    Set<Stylists> stylisci=new TreeSet<>();


    Stylists stylist1=new Stylists("Anna","Maria","13243259423",24);
    Stylists stylist2=new Stylists("Jan","Nowak","23243259445",34);
    Stylists stylist3=new Stylists("Marta","Wiśniewska","33243259444",54);
    Stylists stylist4=new Stylists("Piotr","Lewandowski","82565354721",44);
    Stylists stylist5=new Stylists("Michał","Kamiński", "09876543212",22);
    Stylists stylist6=new Stylists("Agnieszka","Kubiak", "56254351536",41);
    Stylists stylist7=new Stylists("Tomasz","Kaczmarek", "98346397802",32);
    Stylists stylist8=new Stylists("Magdalena","Zielińska", "39179408359",71);
    Stylists stylist9=new Stylists("Grzegorz","Szymański", "58370569289",17);
    Stylists stylist10=new Stylists("Karolina","Woźniak", "39077291636",24);
    Stylists stylist11=new Stylists("Marcin","Dąbrowski", "64907727301",55);
    Stylists stylist12=new Stylists("Justyna","Nowicki", "75109472546",56);
    Stylists stylist13=new Stylists("Karolina","Jankowska", "88064193669",57);
    Stylists stylist14=new Stylists("Paweł","Michalski", "11857131729",43);
    Stylists stylist15=new Stylists("Aleksandra","Król", "30462966822",22);
    Stylists stylist16=new Stylists("Andrzej","Wróbel", "71213384131",33);
    Stylists stylist17=new Stylists("Monika","Adamska", "78105149948",55);
    Stylists stylist18=new Stylists("Beata","Bezmysłow", "30042669641",66);
    Stylists stylist19=new Stylists("łukasz","Kasza", "20200615098",23);
    Stylists stylist20=new Stylists("Rafał","Maziarz", "42034370793",44);




        public void writeStylists(){
            for(Stylists stylists: stylisci) System.out.println( stylisci);
        }




}


