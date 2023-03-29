package task6;

import java.awt.Color;

public class Printer {
    final protected void print(String value) {
        System.out.println(value);
    }

//    public void printInColor(String value, Color color) {
//        System.out.print("\033[38;2;" + color.getRed() + ";" + color.getGreen() + ";" + color.getBlue() + "m");
//        System.out.println(value);
//        System.out.print("\033[0m");
//    }
}
