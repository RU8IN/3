package misc;

public class JudicialProcess extends Event {

    private final String process_name;
    private final Plaintiff plaintiff;
    private final Defendant defendant;
    private final Judge judge;

    public JudicialProcess(String process_name, Plaintiff plaintiff, Defendant defendant, Judge judge) {
        super(process_name);
        this.plaintiff = plaintiff;
        this.defendant = defendant;
        this.judge = judge;
        this.process_name = process_name;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Процесс начался");
        this.plaintiff.say_lawsuit();
        this.defendant.say_defend_phrase();
        Person winner = this.judge.make_decision(this.plaintiff, this.defendant);
        System.out.printf("Победил %s%n", winner.get_name());
        super.end();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof JudicialProcess) {
            return this.process_name.equals(((JudicialProcess) obj).get_name());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.process_name;
    }

    @Override
    public int hashCode() {
        return this.process_name.hashCode();
    }
}
