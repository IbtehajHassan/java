package lamdas.ch1;

import java.util.function.Predicate;

public class BoundMethodReference {


    interface ContextMatters <T> {
        boolean test(T a, T b);
    }

    public static void main(String[] args) {


        String name = "Mr. Jeff";
        Predicate<String> predicate = name::startsWith;

        System.out.println("Mr: " + predicate.test("Mrs."));

        ContextMatters<String> contextMatters = String::startsWith;

        System.out.println("Mr: " + contextMatters.test("Mr. Jeff", "Mrs."));
    }
}
