package Creational.Prototype;

import java.util.HashMap;

public class ColorStore {
    private static HashMap<String,Color> allColors;

    static {
        allColors = new HashMap<>();
        allColors.put("black", new BlackColor());
        allColors.put("blue", new BlueColor());
    }

    public static Color getColor(String colorName) {
        return (Color) allColors.get(colorName);
    }

}
