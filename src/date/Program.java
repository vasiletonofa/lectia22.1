package date;

import java.time.LocalTime;

public class Program {

    String name;

    int number;

    int duration;

    public Program(int number, String name, int duration) {
        this.duration = duration;
        this.number = number;
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
