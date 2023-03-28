package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        System.out.print("Введіть ліцензійний ключ: ");
        String licenseKey = scInput.next();

        DocumentWorker document;

        switch (licenseKey){
            case "Pro":
                document = new ProDocumentWorker();
                break;
            case "Expert":
                document = new ExpertDocumentWorker();
                break;
            default:
                document = new DocumentWorker();
                break;
        }

        document.print();
    }
}
