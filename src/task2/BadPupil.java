package task2;

public class BadPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Навчання на дуже низькому рівні.");
    }

    @Override
    public void read() {
        System.out.println("Читає по слогах.");
    }

    @Override
    public void write() {
        System.out.println("Пише з помилками та помарками.");
    }

    @Override
    public void relax() {
        System.out.println("Відпочинок перетворює на хаос.");
    }
}
