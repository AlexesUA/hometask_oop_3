package task2;

public class ExcelentPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Бездоганно вчиться.");
    }

    @Override
    public void read() {
        System.out.println("Читає по \"діагоналі\".");
    }

    @Override
    public void write() {
        System.out.println("Пише каліграфічним почерком.");
    }

    @Override
    public void relax() {
        System.out.println("Відпочинок, переважно, перетворює в навчання.");
    }
}
