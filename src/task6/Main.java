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


//Взагалі не дуже зрозумів завдання, як його треба було зробити.
//Знайшов таке ж завдання на С#
//              var arr = new Printer[3];
//              arr[0] = new Printer();
//              arr[1] = new PrinterBlue();
//              arr[2] = new PrinterRed();
//
//              foreach (Printer r in arr)
//              {
//                  r.Print("Hello");
//              }
//
//               ((PrinterRed)arr[2]).Print("ad");
//
// і тут, наскільки я розумію (код не компілював), в блоці foreach все друкується методом з
// базового класа. А вже після якного приведення, друкується методом з дочірного класа.
//
// Але, якщо я просто перевизначаю метод в дочірньому класі, і створюю його з типом батьківського
// Printer bluePrinter = new ColorPrinter();
// Все одно буде працювати метод дочірнього класу. Чи я щось не так розумію.
