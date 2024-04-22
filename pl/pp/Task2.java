package pl.pp;

public class Task2 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.hiToAll();
        person1.setForename("Rumeysa");
        person1.setSurname("Ceyhan");
        person1.setAge(20);
        person1.hiToAll();

        Person2 person2 = new Person2("Lavin", "Dobby", 30);
        person2.hiToAll();

        person1.growOld(1);
        for(int i=0; i<3; i++) {
            person2.growOld(5);
        }
        person1.hiToAll();
        person2.hiToAll();

        System.out.println(person1.getForename());
        person1.setForename("Irmak");
        System.out.println(person1.getForename());
        person1.hiToAll();

        person1.beYounger();
        person1.hiToAll();
    }
}