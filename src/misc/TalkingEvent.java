package misc;

public class TalkingEvent extends Event{

    private final Human speaker;
    private final String phrase;

    public TalkingEvent(Human speaker, String phrase) {
        super("Кто-то говорит");
        this.speaker = speaker;
        this.phrase = phrase;
    }

    @Override
    public void start()
    {
        super.start();
        this.speaker.talk(this.phrase);
        super.end();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof TalkingEvent) {
            return this.speaker.get_name().equals(((TalkingEvent) obj).get_name());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.speaker.get_name();
    }

    @Override
    public int hashCode() {
        return this.speaker.get_name().hashCode();
    }
}
