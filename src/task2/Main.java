package task2;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom1 = new ClassRoom();
        classRoom1.printClassRom();

        classRoom1.addPupil(new ExcelentPupil());
        classRoom1.addPupil(new BadPupil());
        classRoom1.addPupil(new GoodPupil());
        classRoom1.addPupil(new GoodPupil());

        classRoom1.printClassRom();
        classRoom1.addPupil(new BadPupil());
        classRoom1.printClassRom();
    }
}
