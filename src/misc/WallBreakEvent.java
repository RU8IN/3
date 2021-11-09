package misc;

public class WallBreakEvent extends Event {

    private final Human house_owner;
    private final Event break_event;
    private final HouseParts part;


    public WallBreakEvent(HouseParts part, Human house_owner, Event break_event) {
        super("Разрушение стены");
        this.part = part;
        this.house_owner = house_owner;
        this.break_event = break_event;
    }

    @Override
    public void start() {
        super.start();
        System.out.printf("Стена %s в доме владельца %s разрушилась в результате события %s%n", part, this.house_owner.get_name(), this.break_event.get_name());
        super.end();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof SuitcaseExcavation) {
            return this.house_owner.get_name().equals(((SuitcaseExcavation) obj).get_name());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.house_owner.get_name();
    }

    @Override
    public int hashCode() {
        return this.house_owner.get_name().hashCode();
    }
}
