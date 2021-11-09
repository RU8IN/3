package misc;

public class Plaintiff extends Person implements PlaintiffInterface {

    private final String lawsuit;
    private final String person_name;

    public Plaintiff (Human person, String lawsuit) {
        super(person.get_name(), person.get_address());
        this.lawsuit = lawsuit;
        this.person_name = person.get_name();
    }

    @Override
    public void say_lawsuit() {
        super.talk(this.lawsuit);
//        return this.lawsuit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Plaintiff) {
            return this.person_name.equals(((Plaintiff) obj).get_name());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.person_name;
    }

    @Override
    public int hashCode() {
        return this.person_name.hashCode();
    }
}
