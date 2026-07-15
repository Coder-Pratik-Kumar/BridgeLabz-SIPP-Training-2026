public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Person:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
