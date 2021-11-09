package misc;

import java.util.Random;

public class Judge extends Person implements JudgeInterface {

    private final String person_name;

    public Judge(Person person) {
        super(person.get_name(), person.get_address());
        this.person_name = person.get_name();
    }

    @Override
    public Person make_decision(Person plaintiff, Person defendant) {

        Random random = new Random();
        random.setSeed(4);

        if (random.nextFloat() > 0.5) {
            super.talk(String.format("Я принял решение в пользу %s", plaintiff.get_name()));
            return plaintiff;
        }
        else {
            super.talk(String.format("Я принял решение в пользу %s", defendant.get_name()));
            return defendant;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Judge) {
            return this.person_name.equals(((Judge) obj).get_name());
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
