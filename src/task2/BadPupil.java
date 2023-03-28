package task2;

public class BadPupil extends Pupil{
    @Override
    public String study() {
        return "Навчання на дуже низькому рівні";
    }

    @Override
    public String read() {
        return "Читає по слогах";
    }

    @Override
    public String write() {
        return "Пише з помилками та помарками";
    }

    @Override
    public String relax() {
        return "Відпочинок перетворює на хаос";
    }
}
