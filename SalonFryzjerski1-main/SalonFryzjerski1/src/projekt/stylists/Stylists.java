package projekt.stylists;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Stylists implements Comparable<Stylists> {

    protected static String name;
    protected static String surname;
    protected static String pesel;
    protected static int age;

    public Stylists(String name, String surname, String pesel, int age) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void checkPesel(String pesel){
    int[] digits = new int[11];
            for (int i=0;i<11;i++){
        digits[i] = Integer.parseInt(pesel.substring(i, i + 1));
    }
    int[] weights = {1,3,7,9,1,3,7,9,1,3};
    int check = 0;
            for(int i=0;i<10;i++){
        check += weights[i]*digits[i];}}

     public void checkPesel(int pesel){
        int[] digits = new int[11];
        for (int i=0;i<11;i++){
            String stringPesel=String.valueOf(pesel);
            digits[i] = Integer.parseInt(stringPesel.substring(i, i + 1));
        }
        int[] weights = {1,3,7,9,1,3,7,9,1,3};
        int check = 0;
        for(int i=0;i<10;i++){
            check += weights[i]*digits[i];}}

    public int compareTo(Stylists stylists) {
        int nameCompare = this.getSurname().compareTo(stylists.getSurname());
        if (nameCompare != 0) {
            return nameCompare;
        }
        return this.getName().compareTo(stylists.getName());
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stylists stylists = (Stylists) o;
        return Objects.equals(name, stylists.name) && Objects.equals(surname, stylists.surname);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "projekt.Ok.projekt.stylists{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                '}';
    }}
