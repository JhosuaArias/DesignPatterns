package Creational.AbstractFactory.Border;

public class SolidBorder implements Border {
    @Override
    public void sayBorderType() {
        System.out.println("Im a solid border");
    }
}
