import java17.Java17Person;
import java8.Java8Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Java8Person java8Person = new Java8Person("Lahiru", 25);
        Java17Person java17Person = new Java17Person("Hashan", 28);
        Java17Person java17Person2 = new Java17Person("Hashan", 28);

        System.out.println(java8Person);
        System.out.println(java17Person);

        System.out.println("Are equal? " + (java17Person == java17Person2));
        System.out.println("Are equal? " + java17Person.equals(java17Person2));

        // pattern matting for instanceof
        Object obj = "Hello Java 17";
        // java 8 way
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s);
        }

        // java 17 way
        if (obj instanceof String s) {
            System.out.println(s);
        }

        Object [] objects = {"Java", 12, 3.15, true};
        for (Object object : objects) {
            if (object instanceof String s) {
                System.out.println(s.toUpperCase());
            }
            if (object instanceof Integer i) {
                System.out.println(i * 10);
            }
            if (object instanceof Double d) {
                System.out.println(d * 100);
            }
            if (object instanceof Boolean b) {
                System.out.println(b ? "Yes" : "No");
            }
        }


    }
}