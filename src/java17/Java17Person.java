package java17;

public record Java17Person(String name, int age) {
    @Override
    public String toString() {
        return "Name : " + name + ", Age: " + age;
    }
}
