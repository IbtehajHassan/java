# Chapter 1:Interfaces and Lambda Expressions

### 1 Introduction
1. Interfaces
2. Functional Interfaces
3. Relationship of functional interfaces to lambdas

### Functional Interfaces from the API
1. Predicate and BiPredicate
2. Supplier
3. Consumer and BiConsumer
4. Function and BiFunction
5. UnaryOperator and BinaryOperator

### Final and Effectively final
### Method References
- Bound 
- Unbound
- Static
- Constructor


#### Notes
- Class can extend only one class but can implement multiple interfaces.
- From java 8 it is not possible to inherit concrete methods from interfaces.
- Two types of concrete methods in interfaces:
  1. Default methods
  2. Static methods
- Default methods are inherited by the implementing class.
- Static methods are not inherited by the implementing class.
- Interface is a contract for what a class can do without specifying how it does it.
- when a class implements an interface, it needs to make sure it has implementation for each abstract method of the interface.
- Interfaces are implicitly abstract and all interface methods are implicitly public.
- All variables are public, static and final in an interface.
- Functional interfaces are interfaces with only one abstract method.
- Functional interfaces can have multiple default methods.
`@FunctionalInterface` annotation is used to ensure that the interface has only one abstract method.

#### Lambda Expressions
- Lambda expressions are used to provide implementation of functional interface.
- Lambda makes the code more concise.
- A lambda expression is an instance of a functional interface.

### Predicate BiPredicate test()
- they only take input param(s) and only return boolean.

### Supplier get()
- Supplier<T> s = () -> new T();
- s.get(); // returns new T();
- T get()

### Consumer & BiConsumer accept()
- Consumer<T> c = () -> sout(T);
- c.accept(T);
- void accept(T)
- BiConsumer<T, U> bc = (T, U) -> sout(T + U);
- bc.accept(T, U);
- void accept(T, U)
- Another use of BiConsumer is to iterate over a map.
- map.forEach((k, v) -> sout(k + v));
- OR BiConsumer b = (k, v) -> sout(k + v);
- map.forEach(b);

### Function & BiFunction apply()
- Function<I,O> func = (a) -> a.length();
- BiFunction<I, I, O> bifunc = (a, b) -> a + b;

### UnaryOperator & BinaryOperator func.apply()
- basically Function and BiFunction with same input and output type.
- UnaryOperator<IO> io = (a) -> a++;
- BiOperator<IO> bi = (a, b) -> a + b;

### Final and Effectively final
- A variable that is not declared as final but is not modified after initialization is effectively final.
- A lambda expression can access a local variable only if it is effectively final.
- A lambda expression can access an instance variable or static variable without any restriction.

### Method References
- Method references are used to refer to methods without invoking them.
- Method references are used to make the code more readable.
- Context is the key!, the interface type being created is hugely important in determining the context.
- The complier turns the method reference into a lambda expression.
- Method references are classified into four categories:
  1. Bound
  2. Unbound
  3. Static
  4. Constructor
- Bound method reference: object::instanceMethod, instance known at compile time.
- Unbound method reference: Class::instanceMethod, instance known at runtime.
- Static method reference: Class::staticMethod
- Constructor reference: Class::new
- Method references are used to refer to constructors as well.
- 