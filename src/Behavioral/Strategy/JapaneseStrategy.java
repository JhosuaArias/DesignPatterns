package Behavioral.Strategy;

public class JapaneseStrategy implements Strategy {

    public JapaneseStrategy(){
    }
    @Override
    public void sayHello() {
        System.out.println("Konnichiwa!");
    }

}
