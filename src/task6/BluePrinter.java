package task6;

public class BluePrinter extends Printer {
    @Override
    public void print(String value){
        System.out.print("\033[38;2;" + 0 + ";" + 0 + ";" + 255 + "m");
        super.print(value);
        System.out.print("\033[0m");
    }
}
