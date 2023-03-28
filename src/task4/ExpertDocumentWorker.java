package task4;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void saveDocument(){
        System.out.println("Документ збережено у новому форматі.");
    }
}
