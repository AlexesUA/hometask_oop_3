package task2;

public class GoodPupil extends Pupil{
    //Так то ж про мене )))
    @Override
    public String study() {
        return "Добре вчиться, але є куди зростати";
    }

    @Override
    public String read() {
        return "Непогано читає";
    }

    @Override
    public String write() {
        return "Пише добре, але повільно";
    }

    @Override
    public String relax() {
        return "Не вміє розрахувати час відпочинку";
    }
}
