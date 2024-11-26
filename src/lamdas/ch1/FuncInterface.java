package lamdas.ch1;

import java.util.function.Predicate;

public class FuncInterface {

    interface CustomFuncInterface<T> {
        boolean compare(T a, T b);
    }

    public static void main(String[] args) {

        CustomFuncInterface<Integer> custom = (a, b) -> a > b;

        System.out.println(custom.compare(5, 3));
        System.out.println(custom.compare(3, 3));
        System.out.println("Hello World!");

        Predicate<Integer> predicate = (a) -> a > 0;

        System.out.println(predicate.test(5));
        System.out.println(predicate.test(-1));
    }
}
