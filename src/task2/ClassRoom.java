package task2;

public class ClassRoom {
    private Pupil[] pupils;
    private int index;

    {
        pupils = new Pupil[4];
        index = 0;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2){
        addPupil(pupil1);
        addPupil(pupil2);
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3){
        this(pupil1, pupil2);
        addPupil(pupil3);
    }

    public void addPupil(Pupil pupil){
        if (index<4){
            pupils[index] = pupil;
            index++;
        }
        else {
            System.out.println("Клас повний.");
        }
    }

}
