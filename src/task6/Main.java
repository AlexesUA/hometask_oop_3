package task6;

public class Main {
    public static void main(String[] args) {
        Printer print = new Printer();

        print.print("Text1");

        ((BluePrinter)print).print("Text2");
    }
}
