package task6;

import java.awt.*;

public class ColorPrinter extends Printer {
    public void print(String value, Color color){
        System.out.print("\033[38;2;" + color.getRed() + ";" + color.getGreen() + ";" + color.getBlue() + "m");
        super.print(value);
        System.out.print("\033[0m");
    }
}
