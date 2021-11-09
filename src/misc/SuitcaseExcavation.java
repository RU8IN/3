package misc;

public class SuitcaseExcavation extends Event {

    private final Human starter;

    public SuitcaseExcavation(Human starter) {
        super("Раскопки чемодана с золотом");
        this.starter = starter;
    }

    @Override
    public void start() {
        super.start();
        System.out.printf("Раскопки чемоданчика с золотом (минералами) инициировал: %s%n", starter.get_name());
        super.end();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof SuitcaseExcavation) {
            return this.starter.get_name().equals(((SuitcaseExcavation) obj).get_name());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.starter.get_name();
    }

    @Override
    public int hashCode() {
        return this.starter.get_name().hashCode();
    }
}
