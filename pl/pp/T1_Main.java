package pl.pp;
import pl.pp.T1_Person;

public class T1_Main {
    public static void main(String[] args) {
        T1_Person person1 = new T1_Person(); // create object person1 of class Person with default parameters/attributes
        person1.hiToAll(); // by default, fields are empty or zero so this should be displayed

        person1.forename = "John";
        person1.surname = "Doe";
        person1.age = 24;
        person1.hiToAll(); // now it should display the values that we just entered as attributes of the object

        // knowing that we have a constructor for the object that is not empty but accepts certain characteristics, you can
        // initialize an object in one line instead of entering values in each field as above

        T1_Person person2 = new T1_Person("Alice", "Hart", 42);
        person2.hiToAll();

        // you can now use the method growOld() e.g., once for object person1 and three times for object person2
        person1.growOld();
        for(int i=0; i<3; i++) {
            person2.growOld();
        }
        // and display the final age, does everything match up?
        person1.hiToAll();
        person2.hiToAll();

        // instead of referring to specific fields of the object, you can write methods that set, for example, the variable
        // forename or read it and use these methods
        System.out.println(person1.getName()); // read forename from the object using a method (see - Person class code)
        person1.setName("Lolo"); // change the forename field in the object person1
        System.out.println(person1.getName()); // check if the forename in the object person1 has changed
        person1.hiToAll();
    }
}