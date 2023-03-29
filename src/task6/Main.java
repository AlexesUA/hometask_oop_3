package task6;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ColorPrinter bluePrinter = new ColorPrinter();

        bluePrinter.print("Blue text in ColorPrinter method", Color.BLUE);

        Printer print = bluePrinter;
        print.print("Standard text in Printer method");
        //print.print("Standard text in Printer method", Color.BLUE); // Помилка


        ColorPrinter RedPrinter = (ColorPrinter) print;
        RedPrinter.print("Red text in ColorPrinter method", Color.RED);
    }
}
