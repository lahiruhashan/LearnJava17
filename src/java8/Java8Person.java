package java8;

public class Java8Person {
    private final String name;
    private final int age;

    public Java8Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}
