package task6;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ColorPrinter bluePrinter = new ColorPrinter();

        bluePrinter.print("Some Text", Color.BLUE);

        Printer print = bluePrinter;

        print.print("Text1");
        ColorPrinter newBluePrinter = (ColorPrinter) print;
        newBluePrinter.print("Text2", Color.BLUE);
    }
}
