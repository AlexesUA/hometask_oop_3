package task6;

import java.awt.*;

public class ColorPrinter extends Printer {
    public void print(String value, Color color){
        System.out.print("\033[38;2;" + 0 + ";" + 0 + ";" + 255 + "m");
        super.print(value);
        System.out.print("\033[0m");
    }
}
