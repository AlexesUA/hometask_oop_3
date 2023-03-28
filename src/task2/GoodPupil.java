package task2;

public class GoodPupil extends Pupil{
    //Так то ж про мене )))
    @Override
    public void study() {
        System.out.println("Добре вчиться, але є куди зростати.");
    }

    @Override
    public void read() {
        System.out.println("Непогано читає.");
    }

    @Override
    public void write() {
        System.out.println("Пише добре, але повільно.");
    }

    @Override
    public void relax() {
        System.out.println("Не вміє розрахувати час відпочинку.");
    }
}
