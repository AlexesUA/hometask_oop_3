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

    public String toString(){
        return String.format("Учень %1$s, %2$s, %3$s, %4$s ", study(), read(), write(), relax());
    }
}
