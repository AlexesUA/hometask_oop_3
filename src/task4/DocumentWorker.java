package task4;

public class DocumentWorker {
    public void openDocument() {
        System.out.println("Документ відкритий.");
    }
    public void editDocument(){
        System.out.println("Правка документа доступна у версії Про.");
    }
    public void saveDocument(){
        System.out.println("Збереження документа доступне у версії Про.");
    }

    public void print(){
        openDocument();
        editDocument();
        saveDocument();
    }
}
