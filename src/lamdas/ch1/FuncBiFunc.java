package lamdas.ch1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FuncBiFunc {

    public static void main(String[] args) {


        Function<String, Integer> func = String::length;
        System.out.println("Length of the string is: " + func.apply("Hello"));

        BiFunction<String, String, String> concate = (a, b) -> a + b;
        System.out.println("Concatenated string is: " + concate.apply("Hello", " World!"));
        System.out.println("Hello World!");
    }
}
