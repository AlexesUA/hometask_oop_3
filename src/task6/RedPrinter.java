package task6;

public class RedPrinter extends Printer {
    @Override
    public void print(String value){
        System.out.print("\033[38;2;" + 255 + ";" + 0 + ";" + 0 + "m");
        super.print(value);
        System.out.print("\033[0m");
    }
}
