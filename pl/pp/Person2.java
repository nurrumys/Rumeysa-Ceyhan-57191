package pl.pp;

public class Person2 {
    private String forename;
    private String surname;
    private int age;
    private String address;
    private int year_of_birth;

    public Person2() {

    }


    public Person2(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
    }

    public void hiToAll(){
        System.out.println("My name is " + forename + " " + surname + ". " + "I am " + age + " years old.");
    }

    public int growOld(int years){
        age = age + years;
        return age;
    }

    public String getForename(){
        return forename;
    }

    public void setForename(String nameToSet){
        forename = nameToSet;
    }

    public void beYounger() {
        age = age - 1;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String newSurname) {
        surname = newSurname;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int newAge) {
        age = newAge;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String newAddress) {
        address = newAddress;
    }


    public int getYearOfBirth() {
        return year_of_birth;
    }

    public void setYearOfBirth(int newYearOfBirth) {
        year_of_birth = newYearOfBirth;
    }
}
