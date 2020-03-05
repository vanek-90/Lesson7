public final class Авианосец extends Ship {  // Авианосец в России один, наследников на данный момент нет.
    int speed = 33;

    public Авианосец(String shipName, String color, int length, int speed) {
        super(shipName, color, length);
        this.speed = speed;
    }

    // Единственный возвращающий метод
    public int getSpeed() {
        return speed;
    }
}
