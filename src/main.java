import misc.*;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Eventable> events = new ArrayList<>();

        Person kuks = new Person("Кукс", "Улица Пушкина, д. Колотушкина");
        Person kaktus = new Person("Кактус", "Кривая улица, д. 47");
        Person judge = new Person("Фольтест", "Темерия, замок Ла Валетт");

        events.add(new TalkingEvent(kuks, "Поднимаю цену на аренду моего дома, Кактус"));
        events.add(new TalkingEvent(kaktus, "Где-то во дворе дома товарища Кукса зарыт чемоданчик с золотом! Нужно больше золота!"));

        SuitcaseExcavation excavation = new SuitcaseExcavation(kaktus);
        events.add(excavation);
        events.add(new WallBreakEvent(HouseParts.SOUTH_WALL, kuks, excavation));

        JudicialProcess process = new JudicialProcess("Первый судебный", new Plaintiff(kuks, "Она придумала чемоданчик с золотом в отместку за повышение цены на аренду, чтобы из-за раскопок сломалась стена!"),
                new Defendant(kaktus, "Не было такого. И вообще он цену на жильё необоснованно завысил!"), new Judge(judge));

        events.add(process);
        Day day = new Day(events);
        day.start();
    }
}

// 312522