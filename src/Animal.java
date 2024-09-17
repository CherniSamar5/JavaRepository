public class Animal {

    String family;
    String name;
    int age ;
    boolean isMammal;

    Animal (){}

    @Override
    public String toString() {
        return "family: " + family + ", Name: " + name + ", Age: " + age + ", is Mammal: " + isMammal +"\n";
    }
}
