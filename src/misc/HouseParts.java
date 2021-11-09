package misc;

public enum HouseParts {
    NORTH_WALL,
    EAST_WALL,
    SOUTH_WALL,
    WEST_WALL,
    ROOF,
    FLOOR;

    @Override
    public String toString(){

        switch (this.name()) {
            case ("NORTH_WALL"): {
                return "северной стороны";
            }
            case ("EAST_WALL"): {
                return "восточной стороны";
            }
            case ("SOUTH_WALL"): {
                return "южной стороны";
            }
            case ("WEST_WALL"): {
                return "западной стороны";
            }
            case ("ROOF"): {
                return "(крыша)";
            }
            case ("FLOOR"): {
                return "(пол)";
            }
        }
        return "Такого в enum'е нет";
    }
}
