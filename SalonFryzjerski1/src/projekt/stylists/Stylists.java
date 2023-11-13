package projekt.stylists;

import java.util.Objects;

public class Stylists<i>{

    private String name;
    private String surname;
    private String pesel;
    private int age;

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
            digits[i] = String.valueOf(pesel.substring(i, i + 1));
        }
        int[] weights = {1,3,7,9,1,3,7,9,1,3};
        int check = 0;
        for(int i=0;i<10;i++){
            check += weights[i]*digits[i];}}

    public int compareTo(Stylists s1, Stylists s2) {
            int nComp= this.getName().compareTo(s1.getName());
                int sComp = this.getSurname().compareTo(s2.getSurname());
                return nComp;
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
    }
}
