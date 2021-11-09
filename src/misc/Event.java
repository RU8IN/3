package misc;

public abstract class Event implements Eventable {

    private final String name;

    public Event(String name) { this.name = name; }

    public void start() {
        System.out.println("Событие " + this.name + " началось");
    }

    public void end() {
        System.out.println("Событие " + this.name + " закончилось");
    }

    public String get_name() { return this.name; }

}