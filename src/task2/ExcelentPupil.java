package task2;

public class ExcelentPupil extends Pupil{
    @Override
    public String study() {
        return "Бездоганно вчиться.";
    }

    @Override
    public String read() {
        return "Читає по \"діагоналі\".";
    }

    @Override
    public String write() {
        return "Пише каліграфічним почерком.";
    }

    @Override
    public String relax() {
        return "Відпочинок, переважно, перетворює в навчання.";
    }
}
