package Creational.Singleton;

public class Singleton {

    private int number;
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public void init(int number){
        this.number = number;
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public int sum(){
        return number++;
    }

    public int getNumber(){
        return number;
    }

}
