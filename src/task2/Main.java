package task2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Додавання учнів за допомогою метода");
        ClassRoom classRoom1 = new ClassRoom();
        classRoom1.printClassRom();

        classRoom1.addPupil(new ExcelentPupil());
        classRoom1.addPupil(new BadPupil());
        classRoom1.addPupil(new GoodPupil());
        classRoom1.addPupil(new GoodPupil());

        classRoom1.printClassRom();
        classRoom1.addPupil(new BadPupil());
        classRoom1.printClassRom();

        System.out.println("\n\nДодавання учнів в конструкторі");

        ClassRoom classRoom2 = new ClassRoom(new BadPupil(), new GoodPupil(), new ExcelentPupil());
        classRoom2.printClassRom();
    }
}
