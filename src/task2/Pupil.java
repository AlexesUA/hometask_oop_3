package task2;

public class Pupil {

    public String study(){
        return "Всі Добре навчаються";
    }
    public String read(){
        return "Всі гарно читають";
    }
    public String write(){
        return "Всі гарно пишуть";
    }
    public String relax(){
        return "Всі гарно відпочивають";
    }

    public void print(){
        study();
        read();
        write();
    }
}
