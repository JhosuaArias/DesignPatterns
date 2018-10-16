package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        //Esto no funciona
        //Singleton singleton = new Singleton();
        //Esto si funciona
        Singleton singleton1 = Singleton.getInstance();
        //Para inicializarlo
        singleton1.init(0);
        System.out.println(singleton1.sum());
        System.out.println(singleton1.sum());
        //Siempre es la misma instancia
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getNumber());
    }
}
