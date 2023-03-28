package task2;

public class ClassRoom {
    private Pupil[] pupils;
    private int index;

    {
        pupils = new Pupil[4];
        index = -1;
    }

    public ClassRoom(){}
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
            index++;
            pupils[index] = pupil;

        }
        else {
            System.out.println("Клас повний.");
        }
    }

    public void printClassRom(){
        System.out.println("Учнів в класі " + (index<0?0:index+1));
        for (int i=0; i<index; i++) {
            System.out.println( (i+1) + " " + pupils[i].toString());

        }
    }

}
