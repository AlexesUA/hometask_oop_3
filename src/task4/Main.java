package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        System.out.print("Введіть ліцензійний ключ: ");
        String licenseKey = scInput.nextLine();

        // Це я погодився з Idea замінити звичайний switch на розширений. Цікавий метод запису.
        DocumentWorker document = switch (licenseKey) {
            case "Pro" -> new ProDocumentWorker();
            case "Expert" -> new ExpertDocumentWorker();
            default -> new DocumentWorker();
        };

        document.print();
    }
}
