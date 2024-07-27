package task2;

public class Person {
    private String name;
    private int age;

    private static final int DEFAULT_AGE = 18;

    public Person() {
        this.age = DEFAULT_AGE;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John Doe";
        person1.display();

        Person person2 = new Person("Jane Doe", 25);
        person2.display();
        Person person3 = new Person("smith", 22);
        person3.display();
    }
}
