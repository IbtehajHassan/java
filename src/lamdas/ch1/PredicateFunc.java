package lamdas.ch1;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateFunc {
    public static void main(String[] args) {

        System.out.println("Custom predicate function to check if the num is greater:" + test(5, (a) -> a > 0));
        System.out.println("Custom Predicate to check if Mr exists in a string: " + test("Mr. Jeff", (a) -> a.contains("Mr.")));

        BiPredicate<String, Integer> biPredicate = (a, b) -> a.length() == b;

        System.out.println("BiPredicate to check if the length of the string is equal to the number: " + biPredicate.test("Hello", 5));

    }

    public static <T> boolean test(T a, Predicate<T> lambda){
        return lambda.test(a);
    }
}
