package projekt.stylists;

import java.util.Set;

public class ActionOnStylist extends StylistsList{
    public ActionOnStylist(String name, String surname, String pesel, int age) {
        super(name, surname, pesel, age);
    }

    public void addStylist(Stylists stylists) {
        stylisci.add(stylists);
    }

    public Stylists searchStylist(Set<Stylists> stylists) {
        for (Stylists s : stylists) {
            if (s.getName().equals(stylists)) return s;
        }


        public boolean removeStylist(Set<Stylists> stylists){
            return stylisci.remove(searchStylist(stylists));
        }

    }}