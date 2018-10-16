package Behavioral.Strategy;

public class Main {

    public static void main(String[] args) {

        Strategy [] people = {new AmericanStrategy(), new JapaneseStrategy()};
        for (Strategy strategy : people) {
            strategy.sayHello();
        }

        Strategy hispanic = () -> System.out.println("Hola!");
        hispanic.sayHello();
    }

}
